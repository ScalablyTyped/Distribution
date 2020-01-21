package typings.awsSdkClientLambdaNode.typesFunctionCodeLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionCodeLocation extends js.Object {
  /**
    * <p>The presigned URL you can use to download the function's .zip file that you previously uploaded. The URL is valid for up to 10 minutes.</p>
    */
  var Location: js.UndefOr[String] = js.undefined
  /**
    * <p>The repository from which you can download the function.</p>
    */
  var RepositoryType: js.UndefOr[String] = js.undefined
}

object FunctionCodeLocation {
  @scala.inline
  def apply(Location: String = null, RepositoryType: String = null): FunctionCodeLocation = {
    val __obj = js.Dynamic.literal()
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    if (RepositoryType != null) __obj.updateDynamic("RepositoryType")(RepositoryType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionCodeLocation]
  }
}

