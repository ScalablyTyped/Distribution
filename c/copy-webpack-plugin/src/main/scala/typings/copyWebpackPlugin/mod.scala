package typings.copyWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.copyWebpackPlugin.anon.AbsoluteFilename
import typings.copyWebpackPlugin.anon.Data
import typings.copyWebpackPlugin.anon.Filename
import typings.copyWebpackPlugin.anon.FnCall
import typings.globby.mod.Options
import typings.node.bufferMod.global.Buffer
import typings.std.Record
import typings.std.ReturnType
import typings.webpack.mod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** @typedef {import("schema-utils/declarations/validate").Schema} Schema */
  /** @typedef {import("webpack").Compiler} Compiler */
  /** @typedef {import("webpack").Compilation} Compilation */
  /** @typedef {import("webpack").WebpackError} WebpackError */
  /** @typedef {import("webpack").Asset} Asset */
  /** @typedef {import("globby").Options} GlobbyOptions */
  /** @typedef {import("globby").GlobEntry} GlobEntry */
  /** @typedef {ReturnType<Compilation["getLogger"]>} WebpackLogger */
  /** @typedef {ReturnType<Compilation["getCache"]>} CacheFacade */
  /** @typedef {ReturnType<ReturnType<Compilation["getCache"]>["getLazyHashedEtag"]>} Etag */
  /** @typedef {ReturnType<Compilation["fileSystemInfo"]["mergeSnapshots"]>} Snapshot */
  /**
    * @typedef {boolean} Force
    */
  /**
    * @typedef {Object} CopiedResult
    * @property {string} sourceFilename
    * @property {string} absoluteFilename
    * @property {string} filename
    * @property {Asset["source"]} source
    * @property {Force | undefined} force
    * @property {Record<string, any>} info
    */
  /**
    * @typedef {string} StringPattern
    */
  /**
    * @typedef {boolean} NoErrorOnMissing
    */
  /**
    * @typedef {string} Context
    */
  /**
    * @typedef {string} From
    */
  /**
    * @callback ToFunction
    * @param {{ context: string, absoluteFilename?: string }} pathData
    * @return {string | Promise<string>}
    */
  /**
    * @typedef {string | ToFunction} To
    */
  /**
    * @typedef {"dir" | "file" | "template"} ToType
    */
  /**
    * @callback TransformerFunction
    * @param {Buffer} input
    * @param {string} absoluteFilename
    * @returns {string | Buffer | Promise<string> | Promise<Buffer>}
    */
  /**
    * @typedef {{ keys: { [key: string]: any } } | { keys: ((defaultCacheKeys: { [key: string]: any }, absoluteFilename: string) => Promise<{ [key: string]: any }>) }} TransformerCacheObject
    */
  /**
    * @typedef {Object} TransformerObject
    * @property {TransformerFunction} transformer
    * @property {boolean | TransformerCacheObject} [cache]
    */
  /**
    * @typedef {TransformerFunction | TransformerObject} Transform
    */
  /**
    * @callback Filter
    * @param {string} filepath
    * @returns {boolean | Promise<boolean>}
    */
  /**
    * @callback TransformAllFunction
    * @param {{ data: Buffer, sourceFilename: string, absoluteFilename: string }[]} data
    * @returns {string | Buffer | Promise<string> | Promise<Buffer>}
    */
  /**
    * @typedef { Record<string, any> | ((item: { absoluteFilename: string, sourceFilename: string, filename: string, toType: ToType }) => Record<string, any>) } Info
    */
  /**
    * @typedef {Object} ObjectPattern
    * @property {From} from
    * @property {GlobbyOptions} [globOptions]
    * @property {Context} [context]
    * @property {To} [to]
    * @property {ToType} [toType]
    * @property {Info} [info]
    * @property {Filter} [filter]
    * @property {Transform} [transform]
    * @property {TransformAllFunction} [transformAll]
    * @property {Force} [force]
    * @property {number} [priority]
    * @property {NoErrorOnMissing} [noErrorOnMissing]
    */
  /**
    * @typedef {StringPattern | ObjectPattern} Pattern
    */
  /**
    * @typedef {Object} AdditionalOptions
    * @property {number} [concurrency]
    */
  /**
    * @typedef {Object} PluginOptions
    * @property {Pattern[]} patterns
    * @property {AdditionalOptions} [options]
    */
  @JSImport("copy-webpack-plugin", JSImport.Namespace)
  @js.native
  /**
    * @param {PluginOptions} [options]
    */
  open class ^ ()
    extends StObject
       with CopyPlugin {
    def this(options: PluginOptions) = this()
    
    /**
      * @param {Compiler} compiler
      */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
    
    /**
      * @private
      * @type {AdditionalOptions}
      */
    /* private */ /* CompleteClass */
    var options: Any = js.native
    
    /**
      * @private
      * @type {Pattern[]}
      */
    /* private */ /* CompleteClass */
    var patterns: Any = js.native
  }
  @JSImport("copy-webpack-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @private
    * @param {Compilation} compilation
    * @param {Snapshot} snapshot
    * @returns {Promise<boolean | undefined>}
    */
  /* static member */
  @JSImport("copy-webpack-plugin", "checkSnapshotValid")
  @js.native
  def checkSnapshotValid: Any = js.native
  inline def checkSnapshotValid_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkSnapshotValid")(x.asInstanceOf[js.Any])
  
  /**
    * @private
    * @param {Compilation} compilation
    * @param {number} startTime
    * @param {string} dependency
    * @returns {Promise<Snapshot | undefined>}
    */
  /* static member */
  @JSImport("copy-webpack-plugin", "createSnapshot")
  @js.native
  def createSnapshot: Any = js.native
  inline def createSnapshot_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createSnapshot")(x.asInstanceOf[js.Any])
  
  /**
    * @private
    * @param {Compiler} compiler
    * @param {Compilation} compilation
    * @param {Buffer} source
    * @returns {string}
    */
  /* static member */
  @JSImport("copy-webpack-plugin", "getContentHash")
  @js.native
  def getContentHash: Any = js.native
  inline def getContentHash_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getContentHash")(x.asInstanceOf[js.Any])
  
  /**
    * @private
    * @param {typeof import("globby").globby} globby
    * @param {Compiler} compiler
    * @param {Compilation} compilation
    * @param {WebpackLogger} logger
    * @param {CacheFacade} cache
    * @param {ObjectPattern & { context: string }} inputPattern
    * @param {number} index
    * @returns {Promise<Array<CopiedResult | undefined> | undefined>}
    */
  /* static member */
  @JSImport("copy-webpack-plugin", "runPattern")
  @js.native
  def runPattern: Any = js.native
  inline def runPattern_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runPattern")(x.asInstanceOf[js.Any])
  
  trait AdditionalOptions extends StObject {
    
    var concurrency: js.UndefOr[Double] = js.undefined
  }
  object AdditionalOptions {
    
    inline def apply(): AdditionalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdditionalOptions]
    }
    
    extension [Self <: AdditionalOptions](x: Self) {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
    }
  }
  
  type Asset = typings.webpack.mod.Asset
  
  type CacheFacade = ReturnType[js.Function1[/* name */ String, typings.webpack.mod.CacheFacade]]
  
  type Compilation = typings.webpack.mod.Compilation
  
  type Compiler = typings.webpack.mod.Compiler
  
  type Context = String
  
  trait CopiedResult extends StObject {
    
    var absoluteFilename: String
    
    var filename: String
    
    var force: js.UndefOr[Force] = js.undefined
    
    var info: Record[String, Any]
    
    var source: Source
    
    var sourceFilename: String
  }
  object CopiedResult {
    
    inline def apply(
      absoluteFilename: String,
      filename: String,
      info: Record[String, Any],
      source: Source,
      sourceFilename: String
    ): CopiedResult = {
      val __obj = js.Dynamic.literal(absoluteFilename = absoluteFilename.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceFilename = sourceFilename.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopiedResult]
    }
    
    extension [Self <: CopiedResult](x: Self) {
      
      inline def setAbsoluteFilename(value: String): Self = StObject.set(x, "absoluteFilename", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setForce(value: Force): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setInfo(value: Record[String, Any]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceFilename(value: String): Self = StObject.set(x, "sourceFilename", value.asInstanceOf[js.Any])
    }
  }
  
  /** @typedef {import("schema-utils/declarations/validate").Schema} Schema */
  /** @typedef {import("webpack").Compiler} Compiler */
  /** @typedef {import("webpack").Compilation} Compilation */
  /** @typedef {import("webpack").WebpackError} WebpackError */
  /** @typedef {import("webpack").Asset} Asset */
  /** @typedef {import("globby").Options} GlobbyOptions */
  /** @typedef {import("globby").GlobEntry} GlobEntry */
  /** @typedef {ReturnType<Compilation["getLogger"]>} WebpackLogger */
  /** @typedef {ReturnType<Compilation["getCache"]>} CacheFacade */
  /** @typedef {ReturnType<ReturnType<Compilation["getCache"]>["getLazyHashedEtag"]>} Etag */
  /** @typedef {ReturnType<Compilation["fileSystemInfo"]["mergeSnapshots"]>} Snapshot */
  /**
    * @typedef {boolean} Force
    */
  /**
    * @typedef {Object} CopiedResult
    * @property {string} sourceFilename
    * @property {string} absoluteFilename
    * @property {string} filename
    * @property {Asset["source"]} source
    * @property {Force | undefined} force
    * @property {Record<string, any>} info
    */
  /**
    * @typedef {string} StringPattern
    */
  /**
    * @typedef {boolean} NoErrorOnMissing
    */
  /**
    * @typedef {string} Context
    */
  /**
    * @typedef {string} From
    */
  /**
    * @callback ToFunction
    * @param {{ context: string, absoluteFilename?: string }} pathData
    * @return {string | Promise<string>}
    */
  /**
    * @typedef {string | ToFunction} To
    */
  /**
    * @typedef {"dir" | "file" | "template"} ToType
    */
  /**
    * @callback TransformerFunction
    * @param {Buffer} input
    * @param {string} absoluteFilename
    * @returns {string | Buffer | Promise<string> | Promise<Buffer>}
    */
  /**
    * @typedef {{ keys: { [key: string]: any } } | { keys: ((defaultCacheKeys: { [key: string]: any }, absoluteFilename: string) => Promise<{ [key: string]: any }>) }} TransformerCacheObject
    */
  /**
    * @typedef {Object} TransformerObject
    * @property {TransformerFunction} transformer
    * @property {boolean | TransformerCacheObject} [cache]
    */
  /**
    * @typedef {TransformerFunction | TransformerObject} Transform
    */
  /**
    * @callback Filter
    * @param {string} filepath
    * @returns {boolean | Promise<boolean>}
    */
  /**
    * @callback TransformAllFunction
    * @param {{ data: Buffer, sourceFilename: string, absoluteFilename: string }[]} data
    * @returns {string | Buffer | Promise<string> | Promise<Buffer>}
    */
  /**
    * @typedef { Record<string, any> | ((item: { absoluteFilename: string, sourceFilename: string, filename: string, toType: ToType }) => Record<string, any>) } Info
    */
  /**
    * @typedef {Object} ObjectPattern
    * @property {From} from
    * @property {GlobbyOptions} [globOptions]
    * @property {Context} [context]
    * @property {To} [to]
    * @property {ToType} [toType]
    * @property {Info} [info]
    * @property {Filter} [filter]
    * @property {Transform} [transform]
    * @property {TransformAllFunction} [transformAll]
    * @property {Force} [force]
    * @property {number} [priority]
    * @property {NoErrorOnMissing} [noErrorOnMissing]
    */
  /**
    * @typedef {StringPattern | ObjectPattern} Pattern
    */
  /**
    * @typedef {Object} AdditionalOptions
    * @property {number} [concurrency]
    */
  /**
    * @typedef {Object} PluginOptions
    * @property {Pattern[]} patterns
    * @property {AdditionalOptions} [options]
    */
  trait CopyPlugin extends StObject {
    
    /**
      * @param {Compiler} compiler
      */
    @JSName("apply")
    def apply(compiler: Compiler): Unit
    
    /**
      * @private
      * @type {AdditionalOptions}
      */
    /* private */ var options: Any
    
    /**
      * @private
      * @type {Pattern[]}
      */
    /* private */ var patterns: Any
  }
  object CopyPlugin {
    
    inline def apply(apply: Compiler => Unit, options: Any, patterns: Any): CopyPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), options = options.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyPlugin]
    }
    
    extension [Self <: CopyPlugin](x: Self) {
      
      inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPatterns(value: Any): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    }
  }
  
  type Etag = ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(name : string): webpack.webpack.CacheFacade>['getLazyHashedEtag'] */ js.Any
  ]
  
  type Filter = js.Function1[/* filepath */ String, Boolean | js.Promise[Boolean]]
  
  type Force = Boolean
  
  type From = String
  
  type GlobEntry = typings.globby.mod.GlobEntry
  
  type GlobbyOptions = Options
  
  type Info = (Record[String, Any]) | (js.Function1[/* item */ Filename, Record[String, Any]])
  
  type NoErrorOnMissing = Boolean
  
  trait ObjectPattern extends StObject {
    
    var context: js.UndefOr[String] = js.undefined
    
    var filter: js.UndefOr[Filter] = js.undefined
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var from: From
    
    var globOptions: js.UndefOr[Options] = js.undefined
    
    var info: js.UndefOr[Info] = js.undefined
    
    var noErrorOnMissing: js.UndefOr[Boolean] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var to: js.UndefOr[To] = js.undefined
    
    var toType: js.UndefOr[ToType] = js.undefined
    
    var transform: js.UndefOr[Transform] = js.undefined
    
    var transformAll: js.UndefOr[TransformAllFunction] = js.undefined
  }
  object ObjectPattern {
    
    inline def apply(from: From): ObjectPattern = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectPattern]
    }
    
    extension [Self <: ObjectPattern](x: Self) {
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setFilter(value: /* filepath */ String => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setFrom(value: From): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setGlobOptions(value: Options): Self = StObject.set(x, "globOptions", value.asInstanceOf[js.Any])
      
      inline def setGlobOptionsUndefined: Self = StObject.set(x, "globOptions", js.undefined)
      
      inline def setInfo(value: Info): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoFunction1(value: /* item */ Filename => Record[String, Any]): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setNoErrorOnMissing(value: Boolean): Self = StObject.set(x, "noErrorOnMissing", value.asInstanceOf[js.Any])
      
      inline def setNoErrorOnMissingUndefined: Self = StObject.set(x, "noErrorOnMissing", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setTo(value: To): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToFunction1(value: /* pathData */ AbsoluteFilename => String | js.Promise[String]): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
      
      inline def setToType(value: ToType): Self = StObject.set(x, "toType", value.asInstanceOf[js.Any])
      
      inline def setToTypeUndefined: Self = StObject.set(x, "toType", js.undefined)
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformAll(value: /* data */ js.Array[Data] => String | Buffer | (js.Promise[Buffer | String])): Self = StObject.set(x, "transformAll", js.Any.fromFunction1(value))
      
      inline def setTransformAllUndefined: Self = StObject.set(x, "transformAll", js.undefined)
      
      inline def setTransformFunction2(
        value: (/* input */ Buffer, /* absoluteFilename */ String) => String | Buffer | (js.Promise[Buffer | String])
      ): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  type Pattern = StringPattern | ObjectPattern
  
  trait PluginOptions extends StObject {
    
    var options: js.UndefOr[AdditionalOptions] = js.undefined
    
    var patterns: js.Array[Pattern]
  }
  object PluginOptions {
    
    inline def apply(patterns: js.Array[Pattern]): PluginOptions = {
      val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginOptions]
    }
    
    extension [Self <: PluginOptions](x: Self) {
      
      inline def setOptions(value: AdditionalOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsVarargs(value: Pattern*): Self = StObject.set(x, "patterns", js.Array(value*))
    }
  }
  
  type Schema = typings.schemaUtils.declarationsValidateMod.Schema
  
  type Snapshot = ReturnType[
    js.Function2[
      /* snapshot1 */ typings.webpack.mod.Snapshot, 
      /* snapshot2 */ typings.webpack.mod.Snapshot, 
      typings.webpack.mod.Snapshot
    ]
  ]
  
  type StringPattern = String
  
  type To = String | ToFunction
  
  type ToFunction = js.Function1[/* pathData */ AbsoluteFilename, String | js.Promise[String]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.copyWebpackPlugin.copyWebpackPluginStrings.dir
    - typings.copyWebpackPlugin.copyWebpackPluginStrings.file
    - typings.copyWebpackPlugin.copyWebpackPluginStrings.template
  */
  trait ToType extends StObject
  object ToType {
    
    inline def dir: typings.copyWebpackPlugin.copyWebpackPluginStrings.dir = "dir".asInstanceOf[typings.copyWebpackPlugin.copyWebpackPluginStrings.dir]
    
    inline def file: typings.copyWebpackPlugin.copyWebpackPluginStrings.file = "file".asInstanceOf[typings.copyWebpackPlugin.copyWebpackPluginStrings.file]
    
    inline def template: typings.copyWebpackPlugin.copyWebpackPluginStrings.template = "template".asInstanceOf[typings.copyWebpackPlugin.copyWebpackPluginStrings.template]
  }
  
  type Transform = TransformerFunction | TransformerObject
  
  type TransformAllFunction = js.Function1[/* data */ js.Array[Data], String | Buffer | (js.Promise[Buffer | String])]
  
  /* Rewritten from type alias, can be one of: 
    - typings.copyWebpackPlugin.anon.Keys
    - typings.copyWebpackPlugin.anon.`0`
  */
  trait TransformerCacheObject extends StObject
  object TransformerCacheObject {
    
    inline def `0`(keys: (StringDictionary[Any], String) => js.Promise[StringDictionary[Any]]): typings.copyWebpackPlugin.anon.`0` = {
      val __obj = js.Dynamic.literal(keys = js.Any.fromFunction2(keys))
      __obj.asInstanceOf[typings.copyWebpackPlugin.anon.`0`]
    }
    
    inline def Keys(keys: StringDictionary[Any]): typings.copyWebpackPlugin.anon.Keys = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.copyWebpackPlugin.anon.Keys]
    }
  }
  
  type TransformerFunction = js.Function2[
    /* input */ Buffer, 
    /* absoluteFilename */ String, 
    String | Buffer | (js.Promise[Buffer | String])
  ]
  
  trait TransformerObject extends StObject {
    
    var cache: js.UndefOr[Boolean | TransformerCacheObject] = js.undefined
    
    def transformer(input: Buffer, absoluteFilename: String): String | Buffer | (js.Promise[Buffer | String])
    @JSName("transformer")
    var transformer_Original: TransformerFunction
  }
  object TransformerObject {
    
    inline def apply(
      transformer: (/* input */ Buffer, /* absoluteFilename */ String) => String | Buffer | (js.Promise[Buffer | String])
    ): TransformerObject = {
      val __obj = js.Dynamic.literal(transformer = js.Any.fromFunction2(transformer))
      __obj.asInstanceOf[TransformerObject]
    }
    
    extension [Self <: TransformerObject](x: Self) {
      
      inline def setCache(value: Boolean | TransformerCacheObject): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setTransformer(
        value: (/* input */ Buffer, /* absoluteFilename */ String) => String | Buffer | (js.Promise[Buffer | String])
      ): Self = StObject.set(x, "transformer", js.Any.fromFunction2(value))
    }
  }
  
  type WebpackError = typings.webpack.mod.WebpackError
  
  type WebpackLogger = ReturnType[FnCall]
}
