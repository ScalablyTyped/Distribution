package typings.bingmaps.Microsoft.Maps.SpatialDataService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IName extends js.Object {
  /** The culture of the region. */
  var Culture: String
  /** The name of boundary. Example: "United States" */
  var EntityName: String
  /** An ID identifying the data provider that supplied the data. */
  var SourceID: String
}

object IName {
  @scala.inline
  def apply(Culture: String, EntityName: String, SourceID: String): IName = {
    val __obj = js.Dynamic.literal(Culture = Culture.asInstanceOf[js.Any], EntityName = EntityName.asInstanceOf[js.Any], SourceID = SourceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IName]
  }
}

