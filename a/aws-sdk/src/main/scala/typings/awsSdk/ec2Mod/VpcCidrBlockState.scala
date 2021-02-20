package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcCidrBlockState extends StObject {
  
  /**
    * The state of the CIDR block.
    */
  var State: js.UndefOr[VpcCidrBlockStateCode] = js.native
  
  /**
    * A message about the status of the CIDR block, if applicable.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}
object VpcCidrBlockState {
  
  @scala.inline
  def apply(): VpcCidrBlockState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcCidrBlockState]
  }
  
  @scala.inline
  implicit class VpcCidrBlockStateMutableBuilder[Self <: VpcCidrBlockState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: VpcCidrBlockStateCode): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
  }
}
