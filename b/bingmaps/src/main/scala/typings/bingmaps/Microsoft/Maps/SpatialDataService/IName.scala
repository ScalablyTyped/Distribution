package typings.bingmaps.Microsoft.Maps.SpatialDataService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IName extends js.Object {
  /** The culture of the region. */
  var Culture: String = js.native
  /** The name of boundary. Example: "United States" */
  var EntityName: String = js.native
  /** An ID identifying the data provider that supplied the data. */
  var SourceID: String = js.native
}

object IName {
  @scala.inline
  def apply(Culture: String, EntityName: String, SourceID: String): IName = {
    val __obj = js.Dynamic.literal(Culture = Culture.asInstanceOf[js.Any], EntityName = EntityName.asInstanceOf[js.Any], SourceID = SourceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IName]
  }
  @scala.inline
  implicit class INameOps[Self <: IName] (val x: Self) extends AnyVal {
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
    def setCulture(value: String): Self = this.set("Culture", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntityName(value: String): Self = this.set("EntityName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceID(value: String): Self = this.set("SourceID", value.asInstanceOf[js.Any])
  }
  
}

