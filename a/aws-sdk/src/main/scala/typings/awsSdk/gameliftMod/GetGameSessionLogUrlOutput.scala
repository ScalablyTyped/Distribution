package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGameSessionLogUrlOutput extends js.Object {
  
  /**
    * Location of the requested game session logs, available for download. This URL is valid for 15 minutes, after which S3 will reject any download request using this URL. You can request a new URL any time within the 14-day period that the logs are retained.
    */
  var PreSignedUrl: js.UndefOr[NonZeroAndMaxString] = js.native
}
object GetGameSessionLogUrlOutput {
  
  @scala.inline
  def apply(): GetGameSessionLogUrlOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGameSessionLogUrlOutput]
  }
  
  @scala.inline
  implicit class GetGameSessionLogUrlOutputOps[Self <: GetGameSessionLogUrlOutput] (val x: Self) extends AnyVal {
    
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
    def setPreSignedUrl(value: NonZeroAndMaxString): Self = this.set("PreSignedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreSignedUrl: Self = this.set("PreSignedUrl", js.undefined)
  }
}
