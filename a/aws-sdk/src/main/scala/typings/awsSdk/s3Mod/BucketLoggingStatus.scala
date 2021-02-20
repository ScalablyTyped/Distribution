package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketLoggingStatus extends StObject {
  
  var LoggingEnabled: js.UndefOr[typings.awsSdk.s3Mod.LoggingEnabled] = js.native
}
object BucketLoggingStatus {
  
  @scala.inline
  def apply(): BucketLoggingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketLoggingStatus]
  }
  
  @scala.inline
  implicit class BucketLoggingStatusMutableBuilder[Self <: BucketLoggingStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoggingEnabled(value: LoggingEnabled): Self = StObject.set(x, "LoggingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingEnabledUndefined: Self = StObject.set(x, "LoggingEnabled", js.undefined)
  }
}
