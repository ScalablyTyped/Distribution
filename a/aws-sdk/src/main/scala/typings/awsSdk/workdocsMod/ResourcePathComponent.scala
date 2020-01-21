package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcePathComponent extends js.Object {
  /**
    * The ID of the resource path.
    */
  var Id: js.UndefOr[IdType] = js.native
  /**
    * The name of the resource path.
    */
  var Name: js.UndefOr[ResourceNameType] = js.native
}

object ResourcePathComponent {
  @scala.inline
  def apply(Id: IdType = null, Name: ResourceNameType = null): ResourcePathComponent = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcePathComponent]
  }
}

