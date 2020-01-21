package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSchemaAsJsonResponse extends js.Object {
  /**
    * The JSON representation of the schema document.
    */
  var Document: js.UndefOr[SchemaJsonDocument] = js.native
  /**
    * The name of the retrieved schema.
    */
  var Name: js.UndefOr[SchemaName] = js.native
}

object GetSchemaAsJsonResponse {
  @scala.inline
  def apply(Document: SchemaJsonDocument = null, Name: SchemaName = null): GetSchemaAsJsonResponse = {
    val __obj = js.Dynamic.literal()
    if (Document != null) __obj.updateDynamic("Document")(Document.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSchemaAsJsonResponse]
  }
}

