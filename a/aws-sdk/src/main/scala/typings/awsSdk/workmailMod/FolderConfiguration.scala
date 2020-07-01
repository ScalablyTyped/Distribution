package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FolderConfiguration extends js.Object {
  /**
    * The action to take on the folder contents at the end of the folder configuration period.
    */
  var Action: RetentionAction = js.native
  /**
    * The folder name.
    */
  var Name: FolderName = js.native
  /**
    * The period of time at which the folder configuration action is applied.
    */
  var Period: js.UndefOr[RetentionPeriod] = js.native
}

object FolderConfiguration {
  @scala.inline
  def apply(Action: RetentionAction, Name: FolderName, Period: js.UndefOr[RetentionPeriod] = js.undefined): FolderConfiguration = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (!js.isUndefined(Period)) __obj.updateDynamic("Period")(Period.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderConfiguration]
  }
}

