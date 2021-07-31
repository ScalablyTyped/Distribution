package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDefaultVpcResult extends StObject {
  
  /**
    * Information about the VPC.
    */
  var Vpc: js.UndefOr[typings.awsSdk.ec2Mod.Vpc] = js.undefined
}
object CreateDefaultVpcResult {
  
  @scala.inline
  def apply(): CreateDefaultVpcResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDefaultVpcResult]
  }
  
  @scala.inline
  implicit class CreateDefaultVpcResultMutableBuilder[Self <: CreateDefaultVpcResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpc(value: Vpc): Self = StObject.set(x, "Vpc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcUndefined: Self = StObject.set(x, "Vpc", js.undefined)
  }
}
