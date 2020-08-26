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
  def apply(): LaunchPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchPath]
  }
  @scala.inline
  implicit class LaunchPathOps[Self <: LaunchPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: Id): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setName(value: PortfolioName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

