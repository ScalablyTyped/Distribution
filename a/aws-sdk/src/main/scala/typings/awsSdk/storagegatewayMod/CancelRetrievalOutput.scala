package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelRetrievalOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the virtual tape for which retrieval was canceled.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.native
}
object CancelRetrievalOutput {
  
  @scala.inline
  def apply(): CancelRetrievalOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelRetrievalOutput]
  }
  
  @scala.inline
  implicit class CancelRetrievalOutputMutableBuilder[Self <: CancelRetrievalOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeARNUndefined: Self = StObject.set(x, "TapeARN", js.undefined)
  }
}
