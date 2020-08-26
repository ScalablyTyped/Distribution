package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAttachTypedLink extends js.Object {
  /**
    * A set of attributes that are associated with the typed link.
    */
  var Attributes: AttributeNameAndValueList = js.native
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

object BatchAttachTypedLink {
  @scala.inline
  def apply(
    Attributes: AttributeNameAndValueList,
    SourceObjectReference: ObjectReference,
    TargetObjectReference: ObjectReference,
    TypedLinkFacet: TypedLinkSchemaAndFacetName
  ): BatchAttachTypedLink = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], SourceObjectReference = SourceObjectReference.asInstanceOf[js.Any], TargetObjectReference = TargetObjectReference.asInstanceOf[js.Any], TypedLinkFacet = TypedLinkFacet.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAttachTypedLink]
  }
  @scala.inline
  implicit class BatchAttachTypedLinkOps[Self <: BatchAttachTypedLink] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: AttributeNameAndValue*): Self = this.set("Attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: AttributeNameAndValueList): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceObjectReference(value: ObjectReference): Self = this.set("SourceObjectReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetObjectReference(value: ObjectReference): Self = this.set("TargetObjectReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypedLinkFacet(value: TypedLinkSchemaAndFacetName): Self = this.set("TypedLinkFacet", value.asInstanceOf[js.Any])
  }
  
}

