package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportedEnvironmentVariable extends js.Object {
  /**
    *  The name of this exported environment variable. 
    */
  var name: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The value assigned to this exported environment variable.    During a build, the value of a variable is available starting with the install phase. It can be updated between the start of the install phase and the end of the post_build phase. After the post_build phase ends, the value of exported variables cannot change. 
    */
  var value: js.UndefOr[String] = js.native
}

object ExportedEnvironmentVariable {
  @scala.inline
  def apply(name: NonEmptyString = null, value: String = null): ExportedEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportedEnvironmentVariable]
  }
}

