package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelArchivalOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the virtual tape for which archiving was canceled.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.native
}
object CancelArchivalOutput {
  
  @scala.inline
  def apply(): CancelArchivalOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelArchivalOutput]
  }
  
  @scala.inline
  implicit class CancelArchivalOutputMutableBuilder[Self <: CancelArchivalOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeARNUndefined: Self = StObject.set(x, "TapeARN", js.undefined)
  }
}
