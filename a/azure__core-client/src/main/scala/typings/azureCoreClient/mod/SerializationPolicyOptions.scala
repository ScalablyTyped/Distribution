package typings.azureCoreClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializationPolicyOptions extends StObject {
  
  /**
    * Configures behavior of xml parser and builder.
    */
  var serializerOptions: js.UndefOr[SerializerOptions] = js.undefined
  
  /**
    * A function that is able to write XML. Required for XML support.
    */
  var stringifyXML: js.UndefOr[js.Function2[/* obj */ Any, /* opts */ js.UndefOr[XmlOptions], String]] = js.undefined
}
object SerializationPolicyOptions {
  
  inline def apply(): SerializationPolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializationPolicyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SerializationPolicyOptions] (val x: Self) extends AnyVal {
    
    inline def setSerializerOptions(value: SerializerOptions): Self = StObject.set(x, "serializerOptions", value.asInstanceOf[js.Any])
    
    inline def setSerializerOptionsUndefined: Self = StObject.set(x, "serializerOptions", js.undefined)
    
    inline def setStringifyXML(value: (/* obj */ Any, /* opts */ js.UndefOr[XmlOptions]) => String): Self = StObject.set(x, "stringifyXML", js.Any.fromFunction2(value))
    
    inline def setStringifyXMLUndefined: Self = StObject.set(x, "stringifyXML", js.undefined)
  }
}
