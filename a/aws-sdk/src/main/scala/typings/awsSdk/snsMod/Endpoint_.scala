package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Endpoint_ extends StObject {
  
  /**
    * Attributes for endpoint.
    */
  var Attributes: js.UndefOr[MapStringToString] = js.native
  
  /**
    * EndpointArn for mobile app and device.
    */
  var EndpointArn: js.UndefOr[String] = js.native
}
object Endpoint_ {
  
  @scala.inline
  def apply(): Endpoint_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint_]
  }
  
  @scala.inline
  implicit class Endpoint_MutableBuilder[Self <: Endpoint_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: MapStringToString): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setEndpointArn(value: String): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointArnUndefined: Self = StObject.set(x, "EndpointArn", js.undefined)
  }
}
