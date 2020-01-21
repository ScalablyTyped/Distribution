package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTestGridProjectResult extends js.Object {
  /**
    * The project, including updated information.
    */
  var testGridProject: js.UndefOr[TestGridProject] = js.native
}

object UpdateTestGridProjectResult {
  @scala.inline
  def apply(testGridProject: TestGridProject = null): UpdateTestGridProjectResult = {
    val __obj = js.Dynamic.literal()
    if (testGridProject != null) __obj.updateDynamic("testGridProject")(testGridProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTestGridProjectResult]
  }
}

