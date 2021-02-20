package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FpgaImageState extends StObject {
  
  /**
    * The state. The following are the possible values:    pending - AFI bitstream generation is in progress.    available - The AFI is available for use.    failed - AFI bitstream generation failed.    unavailable - The AFI is no longer available for use.  
    */
  var Code: js.UndefOr[FpgaImageStateCode] = js.native
  
  /**
    * If the state is failed, this is the error message.
    */
  var Message: js.UndefOr[String] = js.native
}
object FpgaImageState {
  
  @scala.inline
  def apply(): FpgaImageState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FpgaImageState]
  }
  
  @scala.inline
  implicit class FpgaImageStateMutableBuilder[Self <: FpgaImageState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: FpgaImageStateCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
