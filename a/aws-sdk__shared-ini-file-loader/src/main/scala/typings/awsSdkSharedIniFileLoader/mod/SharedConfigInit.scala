package typings.awsSdkSharedIniFileLoader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedConfigInit extends js.Object {
  /**
    * The path at which to locate the ini config file. Defaults to the value of
    * the `AWS_CONFIG_FILE` environment variable (if defined) or
    * `~/.aws/config` otherwise.
    */
  var configFilepath: js.UndefOr[String] = js.native
  /**
    * The path at which to locate the ini credentials file. Defaults to the
    * value of the `AWS_SHARED_CREDENTIALS_FILE` environment variable (if
    * defined) or `~/.aws/credentials` otherwise.
    */
  var filepath: js.UndefOr[String] = js.native
}

object SharedConfigInit {
  @scala.inline
  def apply(): SharedConfigInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedConfigInit]
  }
  @scala.inline
  implicit class SharedConfigInitOps[Self <: SharedConfigInit] (val x: Self) extends AnyVal {
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
    def setConfigFilepath(value: String): Self = this.set("configFilepath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigFilepath: Self = this.set("configFilepath", js.undefined)
    @scala.inline
    def setFilepath(value: String): Self = this.set("filepath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilepath: Self = this.set("filepath", js.undefined)
  }
  
}

