package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportEntitiesOptions extends js.Object {
  var asString: Boolean
    // default true
  var includeMetadata: Boolean
}

object ExportEntitiesOptions {
  @scala.inline
  def apply(asString: Boolean, includeMetadata: Boolean): ExportEntitiesOptions = {
    val __obj = js.Dynamic.literal(asString = asString.asInstanceOf[js.Any], includeMetadata = includeMetadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExportEntitiesOptions]
  }
}

