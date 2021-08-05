package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FpgaImageState extends StObject {
  
  /**
    * The state. The following are the possible values:    pending - AFI bitstream generation is in progress.    available - The AFI is available for use.    failed - AFI bitstream generation failed.    unavailable - The AFI is no longer available for use.  
    */
  var Code: js.UndefOr[FpgaImageStateCode] = js.undefined
  
  /**
    * If the state is failed, this is the error message.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object FpgaImageState {
  
  inline def apply(): FpgaImageState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FpgaImageState]
  }
  
  extension [Self <: FpgaImageState](x: Self) {
    
    inline def setCode(value: FpgaImageStateCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
