package typings.bunyanDashBugsnag.bunyanDashBugsnagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bugsnagClient: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Bugsnag.Client */ js.Any
  var errorLevel: js.UndefOr[Double | String] = js.undefined
  var systemInfo: js.UndefOr[js.Array[String]] = js.undefined
  var warningLevel: js.UndefOr[Double | String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    bugsnagClient: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Bugsnag.Client */ js.Any,
    errorLevel: Double | String = null,
    systemInfo: js.Array[String] = null,
    warningLevel: Double | String = null
  ): Options = {
    val __obj = js.Dynamic.literal(bugsnagClient = bugsnagClient.asInstanceOf[js.Any])
    if (errorLevel != null) __obj.updateDynamic("errorLevel")(errorLevel.asInstanceOf[js.Any])
    if (systemInfo != null) __obj.updateDynamic("systemInfo")(systemInfo.asInstanceOf[js.Any])
    if (warningLevel != null) __obj.updateDynamic("warningLevel")(warningLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

