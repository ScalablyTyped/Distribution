package typings.azureCoreClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeserializationContentTypes extends StObject {
  
  /**
    * The content-types that indicate that an operation response should be deserialized as JSON.
    * Defaults to [ "application/json", "text/json" ].
    */
  var json: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The content-types that indicate that an operation response should be deserialized as XML.
    * Defaults to [ "application/xml", "application/atom+xml" ].
    */
  var xml: js.UndefOr[js.Array[String]] = js.undefined
}
object DeserializationContentTypes {
  
  inline def apply(): DeserializationContentTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeserializationContentTypes]
  }
  
  extension [Self <: DeserializationContentTypes](x: Self) {
    
    inline def setJson(value: js.Array[String]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setJsonVarargs(value: String*): Self = StObject.set(x, "json", js.Array(value*))
    
    inline def setXml(value: js.Array[String]): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    
    inline def setXmlUndefined: Self = StObject.set(x, "xml", js.undefined)
    
    inline def setXmlVarargs(value: String*): Self = StObject.set(x, "xml", js.Array(value*))
  }
}
