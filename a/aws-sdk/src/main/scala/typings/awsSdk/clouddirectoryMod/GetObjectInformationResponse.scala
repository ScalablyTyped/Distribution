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
  def apply(): GetObjectInformationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectInformationResponse]
  }
  @scala.inline
  implicit class GetObjectInformationResponseOps[Self <: GetObjectInformationResponse] (val x: Self) extends AnyVal {
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
    def setObjectIdentifier(value: ObjectIdentifier): Self = this.set("ObjectIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectIdentifier: Self = this.set("ObjectIdentifier", js.undefined)
    @scala.inline
    def setSchemaFacetsVarargs(value: SchemaFacet*): Self = this.set("SchemaFacets", js.Array(value :_*))
    @scala.inline
    def setSchemaFacets(value: SchemaFacetList): Self = this.set("SchemaFacets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaFacets: Self = this.set("SchemaFacets", js.undefined)
  }
  
}

