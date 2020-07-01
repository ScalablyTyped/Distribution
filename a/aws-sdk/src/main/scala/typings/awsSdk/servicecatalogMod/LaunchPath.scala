package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchPath extends js.Object {
  /**
    * The identifier of the launch path.
    */
  var Id: js.UndefOr[typings.awsSdk.servicecatalogMod.Id] = js.native
  /**
    * The name of the launch path.
    */
  var Name: js.UndefOr[PortfolioName] = js.native
}

object LaunchPath {
  @scala.inline
  def apply(Id: Id = null, Name: PortfolioName = null): LaunchPath = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchPath]
  }
}

