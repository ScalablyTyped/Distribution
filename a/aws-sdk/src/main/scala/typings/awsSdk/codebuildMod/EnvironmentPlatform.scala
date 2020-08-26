package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentPlatform extends js.Object {
  /**
    * The list of programming languages that are available for the specified platform.
    */
  var languages: js.UndefOr[EnvironmentLanguages] = js.native
  /**
    * The platform's name.
    */
  var platform: js.UndefOr[PlatformType] = js.native
}

object EnvironmentPlatform {
  @scala.inline
  def apply(): EnvironmentPlatform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentPlatform]
  }
  @scala.inline
  implicit class EnvironmentPlatformOps[Self <: EnvironmentPlatform] (val x: Self) extends AnyVal {
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
    def setLanguagesVarargs(value: EnvironmentLanguage*): Self = this.set("languages", js.Array(value :_*))
    @scala.inline
    def setLanguages(value: EnvironmentLanguages): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
    @scala.inline
    def setPlatform(value: PlatformType): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
  }
  
}

