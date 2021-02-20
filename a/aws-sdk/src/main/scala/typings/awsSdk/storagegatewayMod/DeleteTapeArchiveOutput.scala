package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTapeArchiveOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the virtual tape that was deleted from the virtual tape shelf (VTS).
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.native
}
object DeleteTapeArchiveOutput {
  
  @scala.inline
  def apply(): DeleteTapeArchiveOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTapeArchiveOutput]
  }
  
  @scala.inline
  implicit class DeleteTapeArchiveOutputMutableBuilder[Self <: DeleteTapeArchiveOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeARNUndefined: Self = StObject.set(x, "TapeARN", js.undefined)
  }
}
