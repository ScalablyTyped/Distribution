package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceState extends StObject {
  
  /**
    * The state of the instance as a 16-bit unsigned integer.  The high byte is all of the bits between 2^8 and (2^16)-1, which equals decimal values between 256 and 65,535. These numerical values are used for internal purposes and should be ignored. The low byte is all of the bits between 2^0 and (2^8)-1, which equals decimal values between 0 and 255.  The valid values for instance-state-code will all be in the range of the low byte and they are:    0 : pending     16 : running     32 : shutting-down     48 : terminated     64 : stopping     80 : stopped    You can ignore the high byte value by zeroing out all of the bits above 2^8 or 256 in decimal.
    */
  var Code: js.UndefOr[Integer] = js.native
  
  /**
    * The current state of the instance.
    */
  var Name: js.UndefOr[InstanceStateName] = js.native
}
object InstanceState {
  
  @scala.inline
  def apply(): InstanceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceState]
  }
  
  @scala.inline
  implicit class InstanceStateMutableBuilder[Self <: InstanceState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Integer): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setName(value: InstanceStateName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
