package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformProgrammingLanguage extends js.Object {
  /**
    * The name of the programming language.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The version of the programming language.
    */
  var Version: js.UndefOr[String] = js.native
}

object PlatformProgrammingLanguage {
  @scala.inline
  def apply(Name: String = null, Version: String = null): PlatformProgrammingLanguage = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformProgrammingLanguage]
  }
}

