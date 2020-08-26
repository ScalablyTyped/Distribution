package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedLinkSpecifier extends js.Object {
  /**
    * Identifies the attribute value to update.
    */
  var IdentityAttributeValues: AttributeNameAndValueList = js.native
  /**
    * Identifies the source object that the typed link will attach to.
    */
  var SourceObjectReference: ObjectReference = js.native
  /**
    * Identifies the target object that the typed link will attach to.
    */
  var TargetObjectReference: ObjectReference = js.native
  /**
    * Identifies the typed link facet that is associated with the typed link.
    */
  var TypedLinkFacet: TypedLinkSchemaAndFacetName = js.native
}

object TypedLinkSpecifier {
  @scala.inline
  def apply(
    IdentityAttributeValues: AttributeNameAndValueList,
    SourceObjectReference: ObjectReference,
    TargetObjectReference: ObjectReference,
    TypedLinkFacet: TypedLinkSchemaAndFacetName
  ): TypedLinkSpecifier = {
    val __obj = js.Dynamic.literal(IdentityAttributeValues = IdentityAttributeValues.asInstanceOf[js.Any], SourceObjectReference = SourceObjectReference.asInstanceOf[js.Any], TargetObjectReference = TargetObjectReference.asInstanceOf[js.Any], TypedLinkFacet = TypedLinkFacet.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLinkSpecifier]
  }
  @scala.inline
  implicit class TypedLinkSpecifierOps[Self <: TypedLinkSpecifier] (val x: Self) extends AnyVal {
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
    def setIdentityAttributeValuesVarargs(value: AttributeNameAndValue*): Self = this.set("IdentityAttributeValues", js.Array(value :_*))
    @scala.inline
    def setIdentityAttributeValues(value: AttributeNameAndValueList): Self = this.set("IdentityAttributeValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceObjectReference(value: ObjectReference): Self = this.set("SourceObjectReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetObjectReference(value: ObjectReference): Self = this.set("TargetObjectReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypedLinkFacet(value: TypedLinkSchemaAndFacetName): Self = this.set("TypedLinkFacet", value.asInstanceOf[js.Any])
  }
  
}

