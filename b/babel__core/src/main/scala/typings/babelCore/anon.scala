package typings.babelCore

import typings.babelCore.mod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Exported extends StObject {
    
    var exported: js.Array[js.Object]
    
    var specifiers: js.Array[js.Object]
  }
  object Exported {
    
    inline def apply(exported: js.Array[js.Object], specifiers: js.Array[js.Object]): Exported = {
      val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exported]
    }
    
    extension [Self <: Exported](x: Self) {
      
      inline def setExported(value: js.Array[js.Object]): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
      
      inline def setExportedVarargs(value: js.Object*): Self = StObject.set(x, "exported", js.Array(value :_*))
      
      inline def setSpecifiers(value: js.Array[js.Object]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
      
      inline def setSpecifiersVarargs(value: js.Object*): Self = StObject.set(x, "specifiers", js.Array(value :_*))
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
    
    extension [Self <: File](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesContent(value: js.Array[String]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      inline def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
      
      inline def setSourcesContentVarargs(value: String*): Self = StObject.set(x, "sourcesContent", js.Array(value :_*))
      
      inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value :_*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
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
    
    extension [Self <: Loc](x: Self) {
      
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
    
    extension [Self <: ReadonlyPartialConfig](x: Self) {
      
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
    
    extension [Self <: Request](x: Self) {
      
      inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResolved(value: String): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    }
  }
}
