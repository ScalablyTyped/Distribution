package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubnetCidrBlockState extends StObject {
  
  /**
    * The state of a CIDR block.
    */
  var State: js.UndefOr[SubnetCidrBlockStateCode] = js.native
  
  /**
    * A message about the status of the CIDR block, if applicable.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}
object SubnetCidrBlockState {
  
  @scala.inline
  def apply(): SubnetCidrBlockState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetCidrBlockState]
  }
  
  @scala.inline
  implicit class SubnetCidrBlockStateMutableBuilder[Self <: SubnetCidrBlockState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: SubnetCidrBlockStateCode): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
  }
}
