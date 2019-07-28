package typings.bingmaps.MicrosoftNs.MapsNs.SpatialDataServiceNs

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
    val __obj = js.Dynamic.literal(Culture = Culture, EntityName = EntityName, SourceID = SourceID)
  
    __obj.asInstanceOf[IName]
  }
}

