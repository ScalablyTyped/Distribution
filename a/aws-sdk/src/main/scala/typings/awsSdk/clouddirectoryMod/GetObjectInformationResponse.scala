package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetObjectInformationResponse extends js.Object {
  /**
    * The ObjectIdentifier of the specified object.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.native
  /**
    * The facets attached to the specified object. Although the response does not include minor version information, the most recently applied minor version of each Facet is in effect. See GetAppliedSchemaVersion for details.
    */
  var SchemaFacets: js.UndefOr[SchemaFacetList] = js.native
}

object GetObjectInformationResponse {
  @scala.inline
  def apply(ObjectIdentifier: ObjectIdentifier = null, SchemaFacets: SchemaFacetList = null): GetObjectInformationResponse = {
    val __obj = js.Dynamic.literal()
    if (ObjectIdentifier != null) __obj.updateDynamic("ObjectIdentifier")(ObjectIdentifier.asInstanceOf[js.Any])
    if (SchemaFacets != null) __obj.updateDynamic("SchemaFacets")(SchemaFacets.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectInformationResponse]
  }
}

