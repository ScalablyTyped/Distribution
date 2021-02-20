package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketLoggingOutput extends StObject {
  
  var LoggingEnabled: js.UndefOr[typings.awsSdk.s3Mod.LoggingEnabled] = js.native
}
object GetBucketLoggingOutput {
  
  @scala.inline
  def apply(): GetBucketLoggingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketLoggingOutput]
  }
  
  @scala.inline
  implicit class GetBucketLoggingOutputMutableBuilder[Self <: GetBucketLoggingOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoggingEnabled(value: LoggingEnabled): Self = StObject.set(x, "LoggingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingEnabledUndefined: Self = StObject.set(x, "LoggingEnabled", js.undefined)
  }
}
