package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionManagerOutputUrl extends js.Object {
  
  /**
    * Reserved for future use.
    */
  var CloudWatchOutputUrl: js.UndefOr[SessionManagerCloudWatchOutputUrl] = js.native
  
  /**
    * Reserved for future use.
    */
  var S3OutputUrl: js.UndefOr[SessionManagerS3OutputUrl] = js.native
}
object SessionManagerOutputUrl {
  
  @scala.inline
  def apply(): SessionManagerOutputUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionManagerOutputUrl]
  }
  
  @scala.inline
  implicit class SessionManagerOutputUrlOps[Self <: SessionManagerOutputUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCloudWatchOutputUrl(value: SessionManagerCloudWatchOutputUrl): Self = this.set("CloudWatchOutputUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchOutputUrl: Self = this.set("CloudWatchOutputUrl", js.undefined)
    
    @scala.inline
    def setS3OutputUrl(value: SessionManagerS3OutputUrl): Self = this.set("S3OutputUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3OutputUrl: Self = this.set("S3OutputUrl", js.undefined)
  }
}
