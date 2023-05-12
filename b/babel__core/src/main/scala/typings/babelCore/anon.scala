package typings.babelCore

import typings.babelCore.babelCoreBooleans.`true`
import typings.babelCore.babelCoreStrings.current
import typings.babelCore.babelCoreStrings.tp
import typings.babelCore.mod.TransformOptions
import typings.babelParser.anon.ParseResultFile
import typings.babelParser.mod.ParserOptions
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Android extends StObject {
    
    var android: js.UndefOr[String] = js.undefined
    
    var browsers: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var chrome: js.UndefOr[String] = js.undefined
    
    var deno: js.UndefOr[String] = js.undefined
    
    var edge: js.UndefOr[String] = js.undefined
    
    var electron: js.UndefOr[String] = js.undefined
    
    var esmodules: js.UndefOr[Boolean] = js.undefined
    
    var firefox: js.UndefOr[String] = js.undefined
    
    var ie: js.UndefOr[String] = js.undefined
    
    var ios: js.UndefOr[String] = js.undefined
    
    var node: js.UndefOr[(Omit[String, current]) | current | `true`] = js.undefined
    
    var opera: js.UndefOr[String] = js.undefined
    
    var rhino: js.UndefOr[String] = js.undefined
    
    var safari: js.UndefOr[(Omit[String, tp]) | tp] = js.undefined
    
    var samsung: js.UndefOr[String] = js.undefined
  }
  object Android {
    
    inline def apply(): Android = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Android]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Android] (val x: Self) extends AnyVal {
      
      inline def setAndroid(value: String): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setAndroidUndefined: Self = StObject.set(x, "android", js.undefined)
      
      inline def setBrowsers(value: String | js.Array[String]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      inline def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
      
      inline def setBrowsersVarargs(value: String*): Self = StObject.set(x, "browsers", js.Array(value*))
      
      inline def setChrome(value: String): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      inline def setChromeUndefined: Self = StObject.set(x, "chrome", js.undefined)
      
      inline def setDeno(value: String): Self = StObject.set(x, "deno", value.asInstanceOf[js.Any])
      
      inline def setDenoUndefined: Self = StObject.set(x, "deno", js.undefined)
      
      inline def setEdge(value: String): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
      
      inline def setElectron(value: String): Self = StObject.set(x, "electron", value.asInstanceOf[js.Any])
      
      inline def setElectronUndefined: Self = StObject.set(x, "electron", js.undefined)
      
      inline def setEsmodules(value: Boolean): Self = StObject.set(x, "esmodules", value.asInstanceOf[js.Any])
      
      inline def setEsmodulesUndefined: Self = StObject.set(x, "esmodules", js.undefined)
      
      inline def setFirefox(value: String): Self = StObject.set(x, "firefox", value.asInstanceOf[js.Any])
      
      inline def setFirefoxUndefined: Self = StObject.set(x, "firefox", js.undefined)
      
      inline def setIe(value: String): Self = StObject.set(x, "ie", value.asInstanceOf[js.Any])
      
      inline def setIeUndefined: Self = StObject.set(x, "ie", js.undefined)
      
      inline def setIos(value: String): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
      
      inline def setNode(value: (Omit[String, current]) | current | `true`): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setOpera(value: String): Self = StObject.set(x, "opera", value.asInstanceOf[js.Any])
      
      inline def setOperaUndefined: Self = StObject.set(x, "opera", js.undefined)
      
      inline def setRhino(value: String): Self = StObject.set(x, "rhino", value.asInstanceOf[js.Any])
      
      inline def setRhinoUndefined: Self = StObject.set(x, "rhino", js.undefined)
      
      inline def setSafari(value: (Omit[String, tp]) | tp): Self = StObject.set(x, "safari", value.asInstanceOf[js.Any])
      
      inline def setSafariUndefined: Self = StObject.set(x, "safari", js.undefined)
      
      inline def setSamsung(value: String): Self = StObject.set(x, "samsung", value.asInstanceOf[js.Any])
      
      inline def setSamsungUndefined: Self = StObject.set(x, "samsung", js.undefined)
    }
  }
  
  trait Exported extends StObject {
    
    var exported: js.Array[js.Object]
    
    var specifiers: js.Array[js.Object]
  }
  object Exported {
    
    inline def apply(exported: js.Array[js.Object], specifiers: js.Array[js.Object]): Exported = {
      val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exported]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Exported] (val x: Self) extends AnyVal {
      
      inline def setExported(value: js.Array[js.Object]): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
      
      inline def setExportedVarargs(value: js.Object*): Self = StObject.set(x, "exported", js.Array(value*))
      
      inline def setSpecifiers(value: js.Array[js.Object]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
      
      inline def setSpecifiersVarargs(value: js.Object*): Self = StObject.set(x, "specifiers", js.Array(value*))
    }
  }
  
  trait File extends StObject {
    
    var file: String
    
    var mappings: String
    
    var names: js.Array[String]
    
    var sourceRoot: js.UndefOr[String] = js.undefined
    
    var sources: js.Array[String]
    
    var sourcesContent: js.UndefOr[js.Array[String]] = js.undefined
    
    var version: Double
  }
  object File {
    
    inline def apply(
      file: String,
      mappings: String,
      names: js.Array[String],
      sources: js.Array[String],
      version: Double
    ): File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
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
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(input: String): ParseResultFile = js.native
    def apply(input: String, options: ParserOptions): ParseResultFile = js.native
  }
  
  trait Loc extends StObject {
    
    var loc: js.Object
    
    var message: String
    
    var `type`: String
  }
  object Loc {
    
    inline def apply(loc: js.Object, message: String, `type`: String): Loc = {
      val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Loc]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Loc] (val x: Self) extends AnyVal {
      
      inline def setLoc(value: js.Object): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<@babel/core.@babel/core.PartialConfig> */
  trait ReadonlyPartialConfig extends StObject {
    
    val babelignore: js.UndefOr[String] = js.undefined
    
    val babelrc: js.UndefOr[String] = js.undefined
    
    val config: js.UndefOr[String] = js.undefined
    
    def hasFilesystemConfig(): Boolean
    
    val options: TransformOptions
  }
  object ReadonlyPartialConfig {
    
    inline def apply(hasFilesystemConfig: () => Boolean, options: TransformOptions): ReadonlyPartialConfig = {
      val __obj = js.Dynamic.literal(hasFilesystemConfig = js.Any.fromFunction0(hasFilesystemConfig), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyPartialConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyPartialConfig] (val x: Self) extends AnyVal {
      
      inline def setBabelignore(value: String): Self = StObject.set(x, "babelignore", value.asInstanceOf[js.Any])
      
      inline def setBabelignoreUndefined: Self = StObject.set(x, "babelignore", js.undefined)
      
      inline def setBabelrc(value: String): Self = StObject.set(x, "babelrc", value.asInstanceOf[js.Any])
      
      inline def setBabelrcUndefined: Self = StObject.set(x, "babelrc", js.undefined)
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setHasFilesystemConfig(value: () => Boolean): Self = StObject.set(x, "hasFilesystemConfig", js.Any.fromFunction0(value))
      
      inline def setOptions(value: TransformOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait Request extends StObject {
    
    /**
      * The file that the user requested, e.g. `"@babel/env"`
      */
    var request: String
    
    /**
      * The full path of the resolved file, e.g. `"/tmp/node_modules/@babel/preset-env/lib/index.js"`
      */
    var resolved: String
  }
  object Request {
    
    inline def apply(request: String, resolved: String): Request = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResolved(value: String): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    }
  }
}
