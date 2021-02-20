package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TapeRecoveryPointInfo extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the virtual tape.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.native
  
  /**
    * The time when the point-in-time view of the virtual tape was replicated for later recovery. The default timestamp format of the tape recovery point time is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
    */
  var TapeRecoveryPointTime: js.UndefOr[Time] = js.native
  
  /**
    * The size, in bytes, of the virtual tapes to recover.
    */
  var TapeSizeInBytes: js.UndefOr[TapeSize] = js.native
  
  /**
    * The status of the virtual tapes.
    */
  var TapeStatus: js.UndefOr[TapeRecoveryPointStatus] = js.native
}
object TapeRecoveryPointInfo {
  
  @scala.inline
  def apply(): TapeRecoveryPointInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TapeRecoveryPointInfo]
  }
  
  @scala.inline
  implicit class TapeRecoveryPointInfoMutableBuilder[Self <: TapeRecoveryPointInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeARNUndefined: Self = StObject.set(x, "TapeARN", js.undefined)
    
    @scala.inline
    def setTapeRecoveryPointTime(value: Time): Self = StObject.set(x, "TapeRecoveryPointTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeRecoveryPointTimeUndefined: Self = StObject.set(x, "TapeRecoveryPointTime", js.undefined)
    
    @scala.inline
    def setTapeSizeInBytes(value: TapeSize): Self = StObject.set(x, "TapeSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeSizeInBytesUndefined: Self = StObject.set(x, "TapeSizeInBytes", js.undefined)
    
    @scala.inline
    def setTapeStatus(value: TapeRecoveryPointStatus): Self = StObject.set(x, "TapeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapeStatusUndefined: Self = StObject.set(x, "TapeStatus", js.undefined)
  }
}
