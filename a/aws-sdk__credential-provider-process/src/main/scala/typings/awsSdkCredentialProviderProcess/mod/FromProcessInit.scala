package typings.awsSdkCredentialProviderProcess.mod

import typings.awsSdkSharedIniFileLoader.mod.SharedConfigFiles
import typings.awsSdkSharedIniFileLoader.mod.SharedConfigInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromProcessInit extends SharedConfigInit {
  /**
    * A promise that will be resolved with loaded and parsed credentials files.
    * Used to avoid loading shared config files multiple times.
    */
  var loadedConfig: js.UndefOr[js.Promise[SharedConfigFiles]] = js.native
  /**
    * The configuration profile to use.
    */
  var profile: js.UndefOr[String] = js.native
}

object FromProcessInit {
  @scala.inline
  def apply(): FromProcessInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromProcessInit]
  }
  @scala.inline
  implicit class FromProcessInitOps[Self <: FromProcessInit] (val x: Self) extends AnyVal {
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
    def setLoadedConfig(value: js.Promise[SharedConfigFiles]): Self = this.set("loadedConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadedConfig: Self = this.set("loadedConfig", js.undefined)
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
  }
  
}

