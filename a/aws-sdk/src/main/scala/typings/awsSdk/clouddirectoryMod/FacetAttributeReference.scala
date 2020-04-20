package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FacetAttributeReference extends js.Object {
  /**
    * The target attribute name that is associated with the facet reference. See Attribute References for more information.
    */
  var TargetAttributeName: AttributeName = js.native
  /**
    * The target facet name that is associated with the facet reference. See Attribute References for more information.
    */
  var TargetFacetName: FacetName = js.native
}

object FacetAttributeReference {
  @scala.inline
  def apply(TargetAttributeName: AttributeName, TargetFacetName: FacetName): FacetAttributeReference = {
    val __obj = js.Dynamic.literal(TargetAttributeName = TargetAttributeName.asInstanceOf[js.Any], TargetFacetName = TargetFacetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetAttributeReference]
  }
}

