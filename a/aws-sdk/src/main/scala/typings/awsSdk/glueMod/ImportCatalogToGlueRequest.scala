package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportCatalogToGlueRequest extends js.Object {
  /**
    * The ID of the catalog to import. Currently, this should be the AWS account ID.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
}

object ImportCatalogToGlueRequest {
  @scala.inline
  def apply(CatalogId: CatalogIdString = null): ImportCatalogToGlueRequest = {
    val __obj = js.Dynamic.literal()
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportCatalogToGlueRequest]
  }
}

