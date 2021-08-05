package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTerminologyResponse extends StObject {
  
  /**
    * The data location of the custom terminology being retrieved. The custom terminology file is returned in a presigned url that has a 30 minute expiration.
    */
  var TerminologyDataLocation: js.UndefOr[typings.awsSdk.translateMod.TerminologyDataLocation] = js.undefined
  
  /**
    * The properties of the custom terminology being retrieved.
    */
  var TerminologyProperties: js.UndefOr[typings.awsSdk.translateMod.TerminologyProperties] = js.undefined
}
object GetTerminologyResponse {
  
  inline def apply(): GetTerminologyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTerminologyResponse]
  }
  
  extension [Self <: GetTerminologyResponse](x: Self) {
    
    inline def setTerminologyDataLocation(value: TerminologyDataLocation): Self = StObject.set(x, "TerminologyDataLocation", value.asInstanceOf[js.Any])
    
    inline def setTerminologyDataLocationUndefined: Self = StObject.set(x, "TerminologyDataLocation", js.undefined)
    
    inline def setTerminologyProperties(value: TerminologyProperties): Self = StObject.set(x, "TerminologyProperties", value.asInstanceOf[js.Any])
    
    inline def setTerminologyPropertiesUndefined: Self = StObject.set(x, "TerminologyProperties", js.undefined)
  }
}
