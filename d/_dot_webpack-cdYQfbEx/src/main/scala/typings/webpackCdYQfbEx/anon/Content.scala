package typings.webpackCdYQfbEx.anon

import typings.webpackCdYQfbEx.dllReferencePluginDTsMod.DllReferencePluginOptions
import typings.webpackCdYQfbEx.dllReferencePluginDTsMod.DllReferencePluginOptionsContent
import typings.webpackCdYQfbEx.dllReferencePluginDTsMod.DllReferencePluginOptionsSourceType
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`object`
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.require
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content
  extends StObject
     with DllReferencePluginOptions {
  
  /**
  			 * The mappings from request to module info
  			 */
  var content: DllReferencePluginOptionsContent
  
  /**
  			 * (absolute path) context of requests in the manifest (or content property)
  			 */
  var context: js.UndefOr[String] = js.undefined
  
  /**
  			 * Extensions used to resolve modules in the dll bundle (only used when using 'scope')
  			 */
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  			 * The name where the dll is exposed (external name)
  			 */
  var name: String
  
  /**
  			 * Prefix which is used for accessing the content of the dll
  			 */
  var scope: js.UndefOr[String] = js.undefined
  
  /**
  			 * How the dll is exposed (libraryTarget)
  			 */
  var sourceType: js.UndefOr[DllReferencePluginOptionsSourceType] = js.undefined
  
  /**
  			 * The way how the export of the dll bundle is used
  			 */
  var `type`: js.UndefOr[require | `object`] = js.undefined
}
object Content {
  
  inline def apply(content: DllReferencePluginOptionsContent, name: String): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setContent(value: DllReferencePluginOptionsContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSourceType(value: DllReferencePluginOptionsSourceType): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    inline def setType(value: require | `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
