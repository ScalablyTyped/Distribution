package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubnetCidrBlockState extends StObject {
  
  /**
    * The state of a CIDR block.
    */
  var State: js.UndefOr[SubnetCidrBlockStateCode] = js.undefined
  
  /**
    * A message about the status of the CIDR block, if applicable.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
}
object SubnetCidrBlockState {
  
  inline def apply(): SubnetCidrBlockState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetCidrBlockState]
  }
  
  extension [Self <: SubnetCidrBlockState](x: Self) {
    
    inline def setState(value: SubnetCidrBlockStateCode): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
  }
}
