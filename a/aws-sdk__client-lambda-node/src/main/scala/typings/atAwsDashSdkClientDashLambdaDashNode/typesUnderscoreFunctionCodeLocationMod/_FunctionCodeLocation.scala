package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreFunctionCodeLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _FunctionCodeLocation extends js.Object {
  /**
    * <p>The presigned URL you can use to download the function's .zip file that you previously uploaded. The URL is valid for up to 10 minutes.</p>
    */
  var Location: js.UndefOr[String] = js.undefined
  /**
    * <p>The repository from which you can download the function.</p>
    */
  var RepositoryType: js.UndefOr[String] = js.undefined
}

object _FunctionCodeLocation {
  @scala.inline
  def apply(Location: String = null, RepositoryType: String = null): _FunctionCodeLocation = {
    val __obj = js.Dynamic.literal()
    if (Location != null) __obj.updateDynamic("Location")(Location)
    if (RepositoryType != null) __obj.updateDynamic("RepositoryType")(RepositoryType)
    __obj.asInstanceOf[_FunctionCodeLocation]
  }
}

