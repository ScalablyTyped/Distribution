package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignTapePoolOutput extends StObject {
  
  /**
    * The unique Amazon Resource Names (ARN) of the virtual tape that was added to the tape pool.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.native
}
object AssignTapePoolOutput {
  
  @scala.inline
  def apply(): AssignTapePoolOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignTapePoolOutput]
  }
  
  @scala.inline
  implicit class AssignTapePoolOutputMutableBuilder[Self <: AssignTapePoolOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeARNUndefined: Self = StObject.set(x, "TapeARN", js.undefined)
  }
}
