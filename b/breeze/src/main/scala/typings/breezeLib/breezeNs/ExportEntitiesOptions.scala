package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportEntitiesOptions extends js.Object {
  var asString: scala.Boolean
    // default true
  var includeMetadata: scala.Boolean
}

object ExportEntitiesOptions {
  @scala.inline
  def apply(asString: scala.Boolean, includeMetadata: scala.Boolean): ExportEntitiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asString")(asString)
    __obj.updateDynamic("includeMetadata")(includeMetadata)
    __obj.asInstanceOf[ExportEntitiesOptions]
  }
}

