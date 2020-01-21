package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FacetAttribute extends js.Object {
  /**
    * A facet attribute consists of either a definition or a reference. This structure contains the attribute definition. See Attribute References for more information.
    */
  var AttributeDefinition: js.UndefOr[FacetAttributeDefinition] = js.native
  /**
    * An attribute reference that is associated with the attribute. See Attribute References for more information.
    */
  var AttributeReference: js.UndefOr[FacetAttributeReference] = js.native
  /**
    * The name of the facet attribute.
    */
  var Name: AttributeName = js.native
  /**
    * The required behavior of the FacetAttribute.
    */
  var RequiredBehavior: js.UndefOr[RequiredAttributeBehavior] = js.native
}

object FacetAttribute {
  @scala.inline
  def apply(
    Name: AttributeName,
    AttributeDefinition: FacetAttributeDefinition = null,
    AttributeReference: FacetAttributeReference = null,
    RequiredBehavior: RequiredAttributeBehavior = null
  ): FacetAttribute = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (AttributeDefinition != null) __obj.updateDynamic("AttributeDefinition")(AttributeDefinition.asInstanceOf[js.Any])
    if (AttributeReference != null) __obj.updateDynamic("AttributeReference")(AttributeReference.asInstanceOf[js.Any])
    if (RequiredBehavior != null) __obj.updateDynamic("RequiredBehavior")(RequiredBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetAttribute]
  }
}

