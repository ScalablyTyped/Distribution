package typings.broccoliPersistentFilter

import typings.broccoliNodeApi.mod.InputNode
import typings.broccoliPersistentFilter.anon.Recordoutputstring
import typings.fsTreeDiff.libEntryMod.DefaultEntry
import typings.fsTreeDiff.libEntryMod.default
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  /* note: abstract class */ @JSImport("broccoli-persistent-filter/lib", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Filter {
    def this(inputTree: InputNode, options: Options) = this()
  }
  @JSImport("broccoli-persistent-filter/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def shouldPersist(env: ProcessEnv): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldPersist")(env.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def shouldPersist(env: ProcessEnv, persist: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldPersist")(env.asInstanceOf[js.Any], persist.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait ApplyPatchesSchema extends StObject {
    
    var change: Double
    
    var create: Double
    
    var handleFile: Double
    
    var handleFileTime: Double
    
    var linked: Double
    
    var mkdir: Double
    
    var other: Double
    
    var persistentCacheHit: Double
    
    var persistentCachePrime: Double
    
    var processString: Double
    
    var processStringTime: Double
    
    var processed: Double
    
    var rmdir: Double
    
    var unlink: Double
  }
  object ApplyPatchesSchema {
    
    inline def apply(
      change: Double,
      create: Double,
      handleFile: Double,
      handleFileTime: Double,
      linked: Double,
      mkdir: Double,
      other: Double,
      persistentCacheHit: Double,
      persistentCachePrime: Double,
      processString: Double,
      processStringTime: Double,
      processed: Double,
      rmdir: Double,
      unlink: Double
    ): ApplyPatchesSchema = {
      val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], handleFile = handleFile.asInstanceOf[js.Any], handleFileTime = handleFileTime.asInstanceOf[js.Any], linked = linked.asInstanceOf[js.Any], mkdir = mkdir.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], persistentCacheHit = persistentCacheHit.asInstanceOf[js.Any], persistentCachePrime = persistentCachePrime.asInstanceOf[js.Any], processString = processString.asInstanceOf[js.Any], processStringTime = processStringTime.asInstanceOf[js.Any], processed = processed.asInstanceOf[js.Any], rmdir = rmdir.asInstanceOf[js.Any], unlink = unlink.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplyPatchesSchema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplyPatchesSchema] (val x: Self) extends AnyVal {
      
      inline def setChange(value: Double): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      inline def setCreate(value: Double): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      inline def setHandleFile(value: Double): Self = StObject.set(x, "handleFile", value.asInstanceOf[js.Any])
      
      inline def setHandleFileTime(value: Double): Self = StObject.set(x, "handleFileTime", value.asInstanceOf[js.Any])
      
      inline def setLinked(value: Double): Self = StObject.set(x, "linked", value.asInstanceOf[js.Any])
      
      inline def setMkdir(value: Double): Self = StObject.set(x, "mkdir", value.asInstanceOf[js.Any])
      
      inline def setOther(value: Double): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setPersistentCacheHit(value: Double): Self = StObject.set(x, "persistentCacheHit", value.asInstanceOf[js.Any])
      
      inline def setPersistentCachePrime(value: Double): Self = StObject.set(x, "persistentCachePrime", value.asInstanceOf[js.Any])
      
      inline def setProcessString(value: Double): Self = StObject.set(x, "processString", value.asInstanceOf[js.Any])
      
      inline def setProcessStringTime(value: Double): Self = StObject.set(x, "processStringTime", value.asInstanceOf[js.Any])
      
      inline def setProcessed(value: Double): Self = StObject.set(x, "processed", value.asInstanceOf[js.Any])
      
      inline def setRmdir(value: Double): Self = StObject.set(x, "rmdir", value.asInstanceOf[js.Any])
      
      inline def setUnlink(value: Double): Self = StObject.set(x, "unlink", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Filter
    extends typings.broccoliPlugin.mod.^ {
    
    var _canProcessCache: js.Object = js.native
    
    var _destFilePathCache: js.Object = js.native
    
    def _handleFile(
      relativePath: String,
      srcDir: String,
      destDir: String,
      entry: default,
      outputPath: String,
      forceInvalidation: Boolean,
      isChange: Boolean,
      stats: ApplyPatchesSchema
    ): js.Promise[js.UndefOr[String | Recordoutputstring]] = js.native
    
    var _logger: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify debugGenerator.Logger */ Any = js.native
    
    var _needsReset: Boolean = js.native
    
    var _outputLinks: Record[String, Boolean] = js.native
    
    var _processorInitialized: Boolean = js.native
    
    var async: Boolean = js.native
    
    def baseDir(): String = js.native
    
    def cacheKey(): String = js.native
    
    /**
      * @public
      *
      * optionally override this to build a more robust cache key
      * @param  {String} string The contents of a file that is being processed
      * @return {String}        A cache key
      */
    def cacheKeyProcessString(string: String, relativePath: String): String = js.native
    
    def canProcessFile(relativePath: String, entry: default): Boolean = js.native
    
    var concurrency: Double = js.native
    
    var currentTree: typings.fsTreeDiff.mod.^[DefaultEntry] = js.native
    
    var dependencies: typings.broccoliPersistentFilter.libDependenciesMod.^ | Null = js.native
    
    var dependencyInvalidation: Boolean = js.native
    
    var extensions: js.UndefOr[js.Array[String]] = js.native
    
    def getDestFilePath(relativePath: String, entry: default): String | Null = js.native
    
    var inputEncoding: js.UndefOr[String] = js.native
    
    def isDirectory(relativePath: String, entry: default): Boolean = js.native
    
    var outputEncoding: js.UndefOr[String] = js.native
    
    def postProcess(result: typings.broccoliPersistentFilter.anon.ProcessStringResult, _relativePath: String): typings.broccoliPersistentFilter.anon.ProcessStringResult | js.Promise[typings.broccoliPersistentFilter.anon.ProcessStringResult] = js.native
    
    def processAndCacheFile(
      srcDir: String,
      destDir: String,
      entry: default,
      forceInvalidation: Boolean,
      isChange: Boolean,
      instrumentation: ApplyPatchesSchema
    ): js.Promise[js.UndefOr[String | typings.broccoliPersistentFilter.anon.ProcessStringResult]] = js.native
    
    def processFile(
      _srcDir: String,
      _destDir: String,
      relativePath: String,
      forceInvalidation: Boolean,
      isChange: Boolean,
      instrumentation: ApplyPatchesSchema,
      entry: default
    ): js.Promise[js.UndefOr[String | typings.broccoliPersistentFilter.anon.ProcessStringResult]] = js.native
    
    /**
      * @param _contents {string}
      * @param _relativePath {string}
      * @returns {string}
      */
    def processString(_contents: String, _relativePath: String): String | typings.broccoliPersistentFilter.anon.ProcessStringResult | (js.Promise[String | typings.broccoliPersistentFilter.anon.ProcessStringResult]) = js.native
    
    var processor: typings.broccoliPersistentFilter.libProcessorMod.^ = js.native
    
    var targetExtension: js.UndefOr[String] = js.native
  }
  
  trait Options extends StObject {
    
    var annotation: js.UndefOr[String] = js.undefined
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var concurrency: js.UndefOr[Double] = js.undefined
    
    var dependencyInvalidation: js.UndefOr[Boolean] = js.undefined
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var inputEncoding: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var outputEncoding: js.UndefOr[String] = js.undefined
    
    var persist: js.UndefOr[Boolean] = js.undefined
    
    var targetExtension: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAnnotation(value: String): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
      
      inline def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setDependencyInvalidation(value: Boolean): Self = StObject.set(x, "dependencyInvalidation", value.asInstanceOf[js.Any])
      
      inline def setDependencyInvalidationUndefined: Self = StObject.set(x, "dependencyInvalidation", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setInputEncoding(value: String): Self = StObject.set(x, "inputEncoding", value.asInstanceOf[js.Any])
      
      inline def setInputEncodingUndefined: Self = StObject.set(x, "inputEncoding", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOutputEncoding(value: String): Self = StObject.set(x, "outputEncoding", value.asInstanceOf[js.Any])
      
      inline def setOutputEncodingUndefined: Self = StObject.set(x, "outputEncoding", js.undefined)
      
      inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
      
      inline def setTargetExtension(value: String): Self = StObject.set(x, "targetExtension", value.asInstanceOf[js.Any])
      
      inline def setTargetExtensionUndefined: Self = StObject.set(x, "targetExtension", js.undefined)
    }
  }
  
  type ProcessStringResult[Data] = typings.broccoliPersistentFilter.libStrategiesStrategyMod.ProcessStringResult[Data]
}
