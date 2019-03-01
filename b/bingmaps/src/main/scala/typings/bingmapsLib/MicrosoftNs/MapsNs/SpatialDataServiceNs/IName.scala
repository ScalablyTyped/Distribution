package typings
package bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IName extends js.Object {
  /** The culture of the region. */
  var Culture: java.lang.String
  /** The name of boundary. Example: "United States" */
  var EntityName: java.lang.String
  /** An ID identifying the data provider that supplied the data. */
  var SourceID: java.lang.String
}

object IName {
  @scala.inline
  def apply(Culture: java.lang.String, EntityName: java.lang.String, SourceID: java.lang.String): IName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Culture")(Culture)
    __obj.updateDynamic("EntityName")(EntityName)
    __obj.updateDynamic("SourceID")(SourceID)
    __obj.asInstanceOf[IName]
  }
}

