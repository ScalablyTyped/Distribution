package typings.azdata.mod.window

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WizardPageChangeInfo extends js.Object {
  /**
    * The page number that the wizard changed from
    */
  var lastPage: Double
  /**
    * The new page number or undefined if the user is closing the wizard
    */
  var newPage: Double
}

object WizardPageChangeInfo {
  @scala.inline
  def apply(lastPage: Double, newPage: Double): WizardPageChangeInfo = {
    val __obj = js.Dynamic.literal(lastPage = lastPage.asInstanceOf[js.Any], newPage = newPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[WizardPageChangeInfo]
  }
}

