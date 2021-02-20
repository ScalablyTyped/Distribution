package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTerminologyResponse extends StObject {
  
  /**
    * The data location of the custom terminology being retrieved. The custom terminology file is returned in a presigned url that has a 30 minute expiration.
    */
  var TerminologyDataLocation: js.UndefOr[typings.awsSdk.translateMod.TerminologyDataLocation] = js.native
  
  /**
    * The properties of the custom terminology being retrieved.
    */
  var TerminologyProperties: js.UndefOr[typings.awsSdk.translateMod.TerminologyProperties] = js.native
}
object GetTerminologyResponse {
  
  @scala.inline
  def apply(): GetTerminologyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTerminologyResponse]
  }
  
  @scala.inline
  implicit class GetTerminologyResponseMutableBuilder[Self <: GetTerminologyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTerminologyDataLocation(value: TerminologyDataLocation): Self = StObject.set(x, "TerminologyDataLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminologyDataLocationUndefined: Self = StObject.set(x, "TerminologyDataLocation", js.undefined)
    
    @scala.inline
    def setTerminologyProperties(value: TerminologyProperties): Self = StObject.set(x, "TerminologyProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminologyPropertiesUndefined: Self = StObject.set(x, "TerminologyProperties", js.undefined)
  }
}
