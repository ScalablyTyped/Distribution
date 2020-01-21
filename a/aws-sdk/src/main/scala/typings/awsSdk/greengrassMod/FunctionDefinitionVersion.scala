package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionDefinitionVersion extends js.Object {
  /**
    * The default configuration that applies to all Lambda functions in this function definition version. Individual Lambda functions can override these settings.
    */
  var DefaultConfig: js.UndefOr[FunctionDefaultConfig] = js.native
  /**
    * A list of Lambda functions in this function definition version.
    */
  var Functions: js.UndefOr[listOfFunction] = js.native
}

object FunctionDefinitionVersion {
  @scala.inline
  def apply(DefaultConfig: FunctionDefaultConfig = null, Functions: listOfFunction = null): FunctionDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    if (DefaultConfig != null) __obj.updateDynamic("DefaultConfig")(DefaultConfig.asInstanceOf[js.Any])
    if (Functions != null) __obj.updateDynamic("Functions")(Functions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDefinitionVersion]
  }
}

