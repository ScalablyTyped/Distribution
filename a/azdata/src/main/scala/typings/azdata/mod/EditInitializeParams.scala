package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditInitializeParams extends IEditSessionOperationParams {
  var filters: EditInitializeFiltering
  var objectName: String
  var objectType: String
  var queryString: String
  var schemaName: String
}

object EditInitializeParams {
  @scala.inline
  def apply(
    filters: EditInitializeFiltering,
    objectName: String,
    objectType: String,
    ownerUri: String,
    queryString: String,
    schemaName: String
  ): EditInitializeParams = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], objectName = objectName.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], schemaName = schemaName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditInitializeParams]
  }
}

