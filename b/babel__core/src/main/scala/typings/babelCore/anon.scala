package typings.babelCore

import typings.babelCore.mod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Exported extends StObject {
    
    var exported: js.Array[js.Object] = js.native
    
    var specifiers: js.Array[js.Object] = js.native
  }
  object Exported {
    
    @scala.inline
    def apply(exported: js.Array[js.Object], specifiers: js.Array[js.Object]): Exported = {
      val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exported]
    }
    
    @scala.inline
    implicit class ExportedMutableBuilder[Self <: Exported] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExported(value: js.Array[js.Object]): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportedVarargs(value: js.Object*): Self = StObject.set(x, "exported", js.Array(value :_*))
      
      @scala.inline
      def setSpecifiers(value: js.Array[js.Object]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecifiersVarargs(value: js.Object*): Self = StObject.set(x, "specifiers", js.Array(value :_*))
    }
  }
  
  @js.native
  trait File extends StObject {
    
    var file: String = js.native
    
    var mappings: String = js.native
    
    var names: js.Array[String] = js.native
    
    var sourceRoot: js.UndefOr[String] = js.native
    
    var sources: js.Array[String] = js.native
    
    var sourcesContent: js.UndefOr[js.Array[String]] = js.native
    
    var version: Double = js.native
  }
  object File {
    
    @scala.inline
    def apply(
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
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
      
      @scala.inline
      def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      @scala.inline
      def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesContent(value: js.Array[String]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
      
      @scala.inline
      def setSourcesContentVarargs(value: String*): Self = StObject.set(x, "sourcesContent", js.Array(value :_*))
      
      @scala.inline
      def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Loc extends StObject {
    
    var loc: js.Object = js.native
    
    var message: String = js.native
    
    var `type`: String = js.native
  }
  object Loc {
    
    @scala.inline
    def apply(loc: js.Object, message: String, `type`: String): Loc = {
      val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Loc]
    }
    
    @scala.inline
    implicit class LocMutableBuilder[Self <: Loc] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoc(value: js.Object): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<@babel/core.@babel/core.PartialConfig> */
  @js.native
  trait ReadonlyPartialConfig extends StObject {
    
    val babelignore: js.UndefOr[String] = js.native
    
    val babelrc: js.UndefOr[String] = js.native
    
    val config: js.UndefOr[String] = js.native
    
    def hasFilesystemConfig(): Boolean = js.native
    
    val options: TransformOptions = js.native
  }
  object ReadonlyPartialConfig {
    
    @scala.inline
    def apply(hasFilesystemConfig: () => Boolean, options: TransformOptions): ReadonlyPartialConfig = {
      val __obj = js.Dynamic.literal(hasFilesystemConfig = js.Any.fromFunction0(hasFilesystemConfig), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyPartialConfig]
    }
    
    @scala.inline
    implicit class ReadonlyPartialConfigMutableBuilder[Self <: ReadonlyPartialConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBabelignore(value: String): Self = StObject.set(x, "babelignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBabelignoreUndefined: Self = StObject.set(x, "babelignore", js.undefined)
      
      @scala.inline
      def setBabelrc(value: String): Self = StObject.set(x, "babelrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBabelrcUndefined: Self = StObject.set(x, "babelrc", js.undefined)
      
      @scala.inline
      def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setHasFilesystemConfig(value: () => Boolean): Self = StObject.set(x, "hasFilesystemConfig", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOptions(value: TransformOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Request extends StObject {
    
    /**
      * The file that the user requested, e.g. `"@babel/env"`
      */
    var request: String = js.native
    
    /**
      * The full path of the resolved file, e.g. `"/tmp/node_modules/@babel/preset-env/lib/index.js"`
      */
    var resolved: String = js.native
  }
  object Request {
    
    @scala.inline
    def apply(request: String, resolved: String): Request = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolved(value: String): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    }
  }
}
