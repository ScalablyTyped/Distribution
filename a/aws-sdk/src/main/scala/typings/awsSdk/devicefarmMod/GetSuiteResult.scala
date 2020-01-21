package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSuiteResult extends js.Object {
  /**
    * A collection of one or more tests.
    */
  var suite: js.UndefOr[Suite] = js.native
}

object GetSuiteResult {
  @scala.inline
  def apply(suite: Suite = null): GetSuiteResult = {
    val __obj = js.Dynamic.literal()
    if (suite != null) __obj.updateDynamic("suite")(suite.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSuiteResult]
  }
}

