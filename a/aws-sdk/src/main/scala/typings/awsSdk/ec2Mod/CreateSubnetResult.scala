package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSubnetResult extends StObject {
  
  /**
    * Information about the subnet.
    */
  var Subnet: js.UndefOr[typings.awsSdk.ec2Mod.Subnet] = js.undefined
}
object CreateSubnetResult {
  
  @scala.inline
  def apply(): CreateSubnetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSubnetResult]
  }
  
  @scala.inline
  implicit class CreateSubnetResultMutableBuilder[Self <: CreateSubnetResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubnet(value: Subnet): Self = StObject.set(x, "Subnet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetUndefined: Self = StObject.set(x, "Subnet", js.undefined)
  }
}
