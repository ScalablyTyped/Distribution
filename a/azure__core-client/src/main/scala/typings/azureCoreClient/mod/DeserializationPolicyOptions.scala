package typings.azureCoreClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeserializationPolicyOptions extends StObject {
  
  /**
    * Configures the expected content types for the deserialization of
    * JSON and XML response bodies.
    */
  var expectedContentTypes: js.UndefOr[DeserializationContentTypes] = js.undefined
  
  /**
    * A function that is able to parse XML. Required for XML support.
    */
  var parseXML: js.UndefOr[
    js.Function2[/* str */ String, /* opts */ js.UndefOr[XmlOptions], js.Promise[Any]]
  ] = js.undefined
  
  /**
    * Configures behavior of xml parser and builder.
    */
  var serializerOptions: js.UndefOr[SerializerOptions] = js.undefined
}
object DeserializationPolicyOptions {
  
  inline def apply(): DeserializationPolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeserializationPolicyOptions]
  }
  
  extension [Self <: DeserializationPolicyOptions](x: Self) {
    
    inline def setExpectedContentTypes(value: DeserializationContentTypes): Self = StObject.set(x, "expectedContentTypes", value.asInstanceOf[js.Any])
    
    inline def setExpectedContentTypesUndefined: Self = StObject.set(x, "expectedContentTypes", js.undefined)
    
    inline def setParseXML(value: (/* str */ String, /* opts */ js.UndefOr[XmlOptions]) => js.Promise[Any]): Self = StObject.set(x, "parseXML", js.Any.fromFunction2(value))
    
    inline def setParseXMLUndefined: Self = StObject.set(x, "parseXML", js.undefined)
    
    inline def setSerializerOptions(value: SerializerOptions): Self = StObject.set(x, "serializerOptions", value.asInstanceOf[js.Any])
    
    inline def setSerializerOptionsUndefined: Self = StObject.set(x, "serializerOptions", js.undefined)
  }
}
