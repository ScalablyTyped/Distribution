package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTestGridUrlResult extends js.Object {
  /**
    * The number of seconds the URL from CreateTestGridUrlResult$url stays active.
    */
  var expires: js.UndefOr[DateTime] = js.native
  /**
    * A signed URL, expiring in CreateTestGridUrlRequest$expiresInSeconds seconds, to be passed to a RemoteWebDriver. 
    */
  var url: js.UndefOr[String] = js.native
}

object CreateTestGridUrlResult {
  @scala.inline
  def apply(): CreateTestGridUrlResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTestGridUrlResult]
  }
  @scala.inline
  implicit class CreateTestGridUrlResultOps[Self <: CreateTestGridUrlResult] (val x: Self) extends AnyVal {
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
    def setExpires(value: DateTime): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

