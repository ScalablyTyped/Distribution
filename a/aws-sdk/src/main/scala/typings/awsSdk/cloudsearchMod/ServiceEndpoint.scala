package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceEndpoint extends StObject {
  
  var Endpoint: js.UndefOr[ServiceUrl] = js.undefined
}
object ServiceEndpoint {
  
  @scala.inline
  def apply(): ServiceEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceEndpoint]
  }
  
  @scala.inline
  implicit class ServiceEndpointMutableBuilder[Self <: ServiceEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: ServiceUrl): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
  }
}
