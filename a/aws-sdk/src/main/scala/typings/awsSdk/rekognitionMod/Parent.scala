package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parent extends js.Object {
  /**
    * The name of the parent label.
    */
  var Name: js.UndefOr[String] = js.native
}

object Parent {
  @scala.inline
  def apply(Name: String = null): Parent = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parent]
  }
}

