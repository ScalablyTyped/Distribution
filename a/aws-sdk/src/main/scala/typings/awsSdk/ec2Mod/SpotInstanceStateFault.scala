package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotInstanceStateFault extends StObject {
  
  /**
    * The reason code for the Spot Instance state change.
    */
  var Code: js.UndefOr[String] = js.native
  
  /**
    * The message for the Spot Instance state change.
    */
  var Message: js.UndefOr[String] = js.native
}
object SpotInstanceStateFault {
  
  @scala.inline
  def apply(): SpotInstanceStateFault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotInstanceStateFault]
  }
  
  @scala.inline
  implicit class SpotInstanceStateFaultMutableBuilder[Self <: SpotInstanceStateFault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
