package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTapeOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the deleted virtual tape.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.undefined
}
object DeleteTapeOutput {
  
  @scala.inline
  def apply(): DeleteTapeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTapeOutput]
  }
  
  @scala.inline
  implicit class DeleteTapeOutputMutableBuilder[Self <: DeleteTapeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeARNUndefined: Self = StObject.set(x, "TapeARN", js.undefined)
  }
}
