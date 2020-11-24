package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketLoggingOutput extends js.Object {
  
  var LoggingEnabled: js.UndefOr[typings.awsSdk.s3Mod.LoggingEnabled] = js.native
}
object GetBucketLoggingOutput {
  
  @scala.inline
  def apply(): GetBucketLoggingOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketLoggingOutput]
  }
  
  @scala.inline
  implicit class GetBucketLoggingOutputOps[Self <: GetBucketLoggingOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoggingEnabled(value: LoggingEnabled): Self = this.set("LoggingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingEnabled: Self = this.set("LoggingEnabled", js.undefined)
  }
}
