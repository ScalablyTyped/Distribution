package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDefaultSubnetResult extends StObject {
  
  /**
    * Information about the subnet.
    */
  var Subnet: js.UndefOr[typings.awsSdk.ec2Mod.Subnet] = js.undefined
}
object CreateDefaultSubnetResult {
  
  inline def apply(): CreateDefaultSubnetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDefaultSubnetResult]
  }
  
  extension [Self <: CreateDefaultSubnetResult](x: Self) {
    
    inline def setSubnet(value: Subnet): Self = StObject.set(x, "Subnet", value.asInstanceOf[js.Any])
    
    inline def setSubnetUndefined: Self = StObject.set(x, "Subnet", js.undefined)
  }
}
