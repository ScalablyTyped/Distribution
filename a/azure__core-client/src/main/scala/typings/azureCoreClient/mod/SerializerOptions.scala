package typings.azureCoreClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializerOptions extends StObject {
  
  /**
    * Normally additional properties are included in the result object, even if there is no mapper for them.
    * This flag disables this behavior when true. It is used when parsing headers to avoid polluting the result object.
    */
  var ignoreUnknownProperties: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Options to configure xml parser/builder behavior.
    */
  var xml: XmlOptions
}
object SerializerOptions {
  
  inline def apply(xml: XmlOptions): SerializerOptions = {
    val __obj = js.Dynamic.literal(xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SerializerOptions] (val x: Self) extends AnyVal {
    
    inline def setIgnoreUnknownProperties(value: Boolean): Self = StObject.set(x, "ignoreUnknownProperties", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnknownPropertiesUndefined: Self = StObject.set(x, "ignoreUnknownProperties", js.undefined)
    
    inline def setXml(value: XmlOptions): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
  }
}
