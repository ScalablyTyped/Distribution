package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetrieveTapeRecoveryPointOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the virtual tape for which the recovery point was retrieved.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.native
}
object RetrieveTapeRecoveryPointOutput {
  
  @scala.inline
  def apply(): RetrieveTapeRecoveryPointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrieveTapeRecoveryPointOutput]
  }
  
  @scala.inline
  implicit class RetrieveTapeRecoveryPointOutputMutableBuilder[Self <: RetrieveTapeRecoveryPointOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeARNUndefined: Self = StObject.set(x, "TapeARN", js.undefined)
  }
}
