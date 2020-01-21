package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTestGridProjectResult extends js.Object {
  /**
    * A TestGridProject.
    */
  var testGridProject: js.UndefOr[TestGridProject] = js.native
}

object GetTestGridProjectResult {
  @scala.inline
  def apply(testGridProject: TestGridProject = null): GetTestGridProjectResult = {
    val __obj = js.Dynamic.literal()
    if (testGridProject != null) __obj.updateDynamic("testGridProject")(testGridProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTestGridProjectResult]
  }
}

