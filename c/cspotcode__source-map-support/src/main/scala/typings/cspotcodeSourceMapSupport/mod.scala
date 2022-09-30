package typings.cspotcodeSourceMapSupport

import typings.cspotcodeSourceMapSupport.cspotcodeSourceMapSupportInts.`3`
import typings.cspotcodeSourceMapSupport.cspotcodeSourceMapSupportStrings.auto
import typings.cspotcodeSourceMapSupport.cspotcodeSourceMapSupportStrings.browser
import typings.cspotcodeSourceMapSupport.cspotcodeSourceMapSupportStrings.node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@cspotcode/source-map-support", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getErrorSource(error: js.Error): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorSource")(error.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def install(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")().asInstanceOf[Unit]
  inline def install(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def mapSourcePosition(position: Position): Position = ^.asInstanceOf[js.Dynamic].applyDynamic("mapSourcePosition")(position.asInstanceOf[js.Any]).asInstanceOf[Position]
  
  inline def resetRetrieveHandlers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetRetrieveHandlers")().asInstanceOf[Unit]
  
  inline def retrieveSourceMap(source: String): UrlAndMap | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("retrieveSourceMap")(source.asInstanceOf[js.Any]).asInstanceOf[UrlAndMap | Null]
  
  inline def uninstall(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstall")().asInstanceOf[Unit]
  
  inline def wrapCallSite(frame: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapCallSite")(frame.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait Options extends StObject {
    
    var emptyCacheBetweenOperations: js.UndefOr[Boolean] = js.undefined
    
    var environment: js.UndefOr[auto | browser | node] = js.undefined
    
    var handleUncaughtExceptions: js.UndefOr[Boolean] = js.undefined
    
    var hookRequire: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback will be called every time we redirect due to `redirectConflictingLibrary`
      * This allows consumers to log helpful warnings if they choose.
      * @param parent NodeJS.Module which made the require() or require.resolve() call
      * @param options options object internally passed to node's `_resolveFilename` hook
      */
    var onConflictingLibraryRedirect: js.UndefOr[
        js.Function5[
          /* request */ String, 
          /* parent */ Any, 
          /* isMain */ Boolean, 
          /* options */ Any, 
          /* redirectedRequest */ String, 
          Unit
        ]
      ] = js.undefined
    
    var overrideRetrieveFile: js.UndefOr[Boolean] = js.undefined
    
    var overrideRetrieveSourceMap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set false to disable redirection of require / import `source-map-support` to `@cspotcode/source-map-support`
      */
    var redirectConflictingLibrary: js.UndefOr[Boolean] = js.undefined
    
    var retrieveFile: js.UndefOr[js.Function1[/* path */ String, String]] = js.undefined
    
    var retrieveSourceMap: js.UndefOr[js.Function1[/* source */ String, UrlAndMap | Null]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEmptyCacheBetweenOperations(value: Boolean): Self = StObject.set(x, "emptyCacheBetweenOperations", value.asInstanceOf[js.Any])
      
      inline def setEmptyCacheBetweenOperationsUndefined: Self = StObject.set(x, "emptyCacheBetweenOperations", js.undefined)
      
      inline def setEnvironment(value: auto | browser | node): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setHandleUncaughtExceptions(value: Boolean): Self = StObject.set(x, "handleUncaughtExceptions", value.asInstanceOf[js.Any])
      
      inline def setHandleUncaughtExceptionsUndefined: Self = StObject.set(x, "handleUncaughtExceptions", js.undefined)
      
      inline def setHookRequire(value: Boolean): Self = StObject.set(x, "hookRequire", value.asInstanceOf[js.Any])
      
      inline def setHookRequireUndefined: Self = StObject.set(x, "hookRequire", js.undefined)
      
      inline def setOnConflictingLibraryRedirect(
        value: (/* request */ String, /* parent */ Any, /* isMain */ Boolean, /* options */ Any, /* redirectedRequest */ String) => Unit
      ): Self = StObject.set(x, "onConflictingLibraryRedirect", js.Any.fromFunction5(value))
      
      inline def setOnConflictingLibraryRedirectUndefined: Self = StObject.set(x, "onConflictingLibraryRedirect", js.undefined)
      
      inline def setOverrideRetrieveFile(value: Boolean): Self = StObject.set(x, "overrideRetrieveFile", value.asInstanceOf[js.Any])
      
      inline def setOverrideRetrieveFileUndefined: Self = StObject.set(x, "overrideRetrieveFile", js.undefined)
      
      inline def setOverrideRetrieveSourceMap(value: Boolean): Self = StObject.set(x, "overrideRetrieveSourceMap", value.asInstanceOf[js.Any])
      
      inline def setOverrideRetrieveSourceMapUndefined: Self = StObject.set(x, "overrideRetrieveSourceMap", js.undefined)
      
      inline def setRedirectConflictingLibrary(value: Boolean): Self = StObject.set(x, "redirectConflictingLibrary", value.asInstanceOf[js.Any])
      
      inline def setRedirectConflictingLibraryUndefined: Self = StObject.set(x, "redirectConflictingLibrary", js.undefined)
      
      inline def setRetrieveFile(value: /* path */ String => String): Self = StObject.set(x, "retrieveFile", js.Any.fromFunction1(value))
      
      inline def setRetrieveFileUndefined: Self = StObject.set(x, "retrieveFile", js.undefined)
      
      inline def setRetrieveSourceMap(value: /* source */ String => UrlAndMap | Null): Self = StObject.set(x, "retrieveSourceMap", js.Any.fromFunction1(value))
      
      inline def setRetrieveSourceMapUndefined: Self = StObject.set(x, "retrieveSourceMap", js.undefined)
    }
  }
  
  trait Position extends StObject {
    
    var column: Double
    
    var line: Double
    
    var source: String
  }
  object Position {
    
    inline def apply(column: Double, line: Double, source: String): Position = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait RawSourceMap extends StObject {
    
    var file: String
    
    var mappings: String
    
    var names: js.Array[String]
    
    var sourceRoot: js.UndefOr[String] = js.undefined
    
    var sources: js.Array[String]
    
    var sourcesContent: js.UndefOr[js.Array[String]] = js.undefined
    
    var version: `3`
  }
  object RawSourceMap {
    
    inline def apply(file: String, mappings: String, names: js.Array[String], sources: js.Array[String]): RawSourceMap = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = 3)
      __obj.asInstanceOf[RawSourceMap]
    }
    
    extension [Self <: RawSourceMap](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesContent(value: js.Array[String]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      inline def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
      
      inline def setSourcesContentVarargs(value: String*): Self = StObject.set(x, "sourcesContent", js.Array(value*))
      
      inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setVersion(value: `3`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait UrlAndMap extends StObject {
    
    var map: String | RawSourceMap
    
    var url: String
  }
  object UrlAndMap {
    
    inline def apply(map: String | RawSourceMap, url: String): UrlAndMap = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlAndMap]
    }
    
    extension [Self <: UrlAndMap](x: Self) {
      
      inline def setMap(value: String | RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
