package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTestResult extends js.Object {
  /**
    * A test condition that is evaluated.
    */
  var test: js.UndefOr[Test] = js.native
}

object GetTestResult {
  @scala.inline
  def apply(test: Test = null): GetTestResult = {
    val __obj = js.Dynamic.literal()
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTestResult]
  }
}

