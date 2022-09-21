package typings.vegaLite8ozrbXDH.dataDTsMod

import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonDataFormat
  extends StObject
     with DataFormatBase
     with DataFormat {
  
  /**
    * The JSON property containing the desired data.
    * This parameter can be used when the loaded JSON file may have surrounding structure or meta-data.
    * For example `"property": "values.features"` is equivalent to retrieving `json.values.features`
    * from the loaded JSON object.
    */
  var property: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_JsonDataFormat: js.UndefOr[json] = js.undefined
}
object JsonDataFormat {
  
  inline def apply(): JsonDataFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonDataFormat]
  }
  
  extension [Self <: JsonDataFormat](x: Self) {
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setType(value: json): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
