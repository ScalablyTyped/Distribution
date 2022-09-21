package typings.webpackCdYQfbEx

import org.scalablytyped.runtime.StringDictionary
import typings.webpackCdYQfbEx.anon.BuildMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dllReferencePluginDTsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.webpackCdYQfbEx.anon.Context
    - typings.webpackCdYQfbEx.anon.Content
  */
  trait DllReferencePluginOptions extends StObject
  object DllReferencePluginOptions {
    
    inline def Content(content: DllReferencePluginOptionsContent, name: String): typings.webpackCdYQfbEx.anon.Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.webpackCdYQfbEx.anon.Content]
    }
    
    inline def Context(manifest: DllReferencePluginOptionsManifest | String): typings.webpackCdYQfbEx.anon.Context = {
      val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.webpackCdYQfbEx.anon.Context]
    }
  }
  
  type DllReferencePluginOptionsContent = /**
  	 * Module info
  	 */
  StringDictionary[BuildMeta]
  
  trait DllReferencePluginOptionsManifest extends StObject {
    
    /**
    	 * The mappings from request to module info
    	 */
    var content: DllReferencePluginOptionsContent
    
    /**
    	 * The name where the dll is exposed (external name)
    	 */
    var name: js.UndefOr[String] = js.undefined
    
    /**
    	 * The type how the dll is exposed (external type)
    	 */
    var `type`: js.UndefOr[DllReferencePluginOptionsSourceType] = js.undefined
  }
  object DllReferencePluginOptionsManifest {
    
    inline def apply(content: DllReferencePluginOptionsContent): DllReferencePluginOptionsManifest = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[DllReferencePluginOptionsManifest]
    }
    
    extension [Self <: DllReferencePluginOptionsManifest](x: Self) {
      
      inline def setContent(value: DllReferencePluginOptionsContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setType(value: DllReferencePluginOptionsSourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`var`
    - typings.webpackCdYQfbEx.webpackCdYQfbExStrings.assign
    - typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`this`
    - typings.webpackCdYQfbEx.webpackCdYQfbExStrings.window
    - typings.webpackCdYQfbEx.webpackCdYQfbExStrings.global
    - typings.webpackCdYQfbEx.webpackCdYQfbExStrings.commonjs
    - typings.webpackCdYQfbEx.webpackCdYQfbExStrings.commonjs2
    - typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`commonjs-module`
    - typings.webpackCdYQfbEx.webpackCdYQfbExStrings.amd
    - typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`amd-require`
    - typings.webpackCdYQfbEx.webpackCdYQfbExStrings.umd
    - typings.webpackCdYQfbEx.webpackCdYQfbExStrings.umd2
    - typings.webpackCdYQfbEx.webpackCdYQfbExStrings.jsonp
  */
  trait DllReferencePluginOptionsSourceType extends StObject
  object DllReferencePluginOptionsSourceType {
    
    inline def amd: typings.webpackCdYQfbEx.webpackCdYQfbExStrings.amd = "amd".asInstanceOf[typings.webpackCdYQfbEx.webpackCdYQfbExStrings.amd]
    
    inline def `amd-require`: typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`amd-require` = "amd-require".asInstanceOf[typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`amd-require`]
    
    inline def assign: typings.webpackCdYQfbEx.webpackCdYQfbExStrings.assign = "assign".asInstanceOf[typings.webpackCdYQfbEx.webpackCdYQfbExStrings.assign]
    
    inline def commonjs: typings.webpackCdYQfbEx.webpackCdYQfbExStrings.commonjs = "commonjs".asInstanceOf[typings.webpackCdYQfbEx.webpackCdYQfbExStrings.commonjs]
    
    inline def `commonjs-module`: typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`commonjs-module` = "commonjs-module".asInstanceOf[typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`commonjs-module`]
    
    inline def commonjs2: typings.webpackCdYQfbEx.webpackCdYQfbExStrings.commonjs2 = "commonjs2".asInstanceOf[typings.webpackCdYQfbEx.webpackCdYQfbExStrings.commonjs2]
    
    inline def global: typings.webpackCdYQfbEx.webpackCdYQfbExStrings.global = "global".asInstanceOf[typings.webpackCdYQfbEx.webpackCdYQfbExStrings.global]
    
    inline def jsonp: typings.webpackCdYQfbEx.webpackCdYQfbExStrings.jsonp = "jsonp".asInstanceOf[typings.webpackCdYQfbEx.webpackCdYQfbExStrings.jsonp]
    
    inline def `this`: typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`this` = "this".asInstanceOf[typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`this`]
    
    inline def umd: typings.webpackCdYQfbEx.webpackCdYQfbExStrings.umd = "umd".asInstanceOf[typings.webpackCdYQfbEx.webpackCdYQfbExStrings.umd]
    
    inline def umd2: typings.webpackCdYQfbEx.webpackCdYQfbExStrings.umd2 = "umd2".asInstanceOf[typings.webpackCdYQfbEx.webpackCdYQfbExStrings.umd2]
    
    inline def `var`: typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`var` = "var".asInstanceOf[typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`var`]
    
    inline def window: typings.webpackCdYQfbEx.webpackCdYQfbExStrings.window = "window".asInstanceOf[typings.webpackCdYQfbEx.webpackCdYQfbExStrings.window]
  }
}
