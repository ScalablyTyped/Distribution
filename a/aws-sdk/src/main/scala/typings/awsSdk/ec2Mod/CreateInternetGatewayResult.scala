package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInternetGatewayResult extends StObject {
  
  /**
    * Information about the internet gateway.
    */
  var InternetGateway: js.UndefOr[typings.awsSdk.ec2Mod.InternetGateway] = js.native
}
object CreateInternetGatewayResult {
  
  @scala.inline
  def apply(): CreateInternetGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInternetGatewayResult]
  }
  
  @scala.inline
  implicit class CreateInternetGatewayResultMutableBuilder[Self <: CreateInternetGatewayResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInternetGateway(value: InternetGateway): Self = StObject.set(x, "InternetGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternetGatewayUndefined: Self = StObject.set(x, "InternetGateway", js.undefined)
  }
}
