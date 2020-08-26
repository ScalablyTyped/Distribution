package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLinkAttributesRequest extends js.Object {
  /**
    * A list of attribute names whose values will be retrieved.
    */
  var AttributeNames: AttributeNameList = js.native
  /**
    * The consistency level at which to retrieve the attributes on a typed link.
    */
  var ConsistencyLevel: js.UndefOr[typings.awsSdk.clouddirectoryMod.ConsistencyLevel] = js.native
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the typed link resides. For more information, see arns or Typed Links.
    */
  var DirectoryArn: Arn = js.native
  /**
    * Allows a typed link specifier to be accepted as input.
    */
  var TypedLinkSpecifier: typings.awsSdk.clouddirectoryMod.TypedLinkSpecifier = js.native
}

object GetLinkAttributesRequest {
  @scala.inline
  def apply(AttributeNames: AttributeNameList, DirectoryArn: Arn, TypedLinkSpecifier: TypedLinkSpecifier): GetLinkAttributesRequest = {
    val __obj = js.Dynamic.literal(AttributeNames = AttributeNames.asInstanceOf[js.Any], DirectoryArn = DirectoryArn.asInstanceOf[js.Any], TypedLinkSpecifier = TypedLinkSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLinkAttributesRequest]
  }
  @scala.inline
  implicit class GetLinkAttributesRequestOps[Self <: GetLinkAttributesRequest] (val x: Self) extends AnyVal {
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
    def setAttributeNamesVarargs(value: AttributeName*): Self = this.set("AttributeNames", js.Array(value :_*))
    @scala.inline
    def setAttributeNames(value: AttributeNameList): Self = this.set("AttributeNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectoryArn(value: Arn): Self = this.set("DirectoryArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypedLinkSpecifier(value: TypedLinkSpecifier): Self = this.set("TypedLinkSpecifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsistencyLevel(value: ConsistencyLevel): Self = this.set("ConsistencyLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsistencyLevel: Self = this.set("ConsistencyLevel", js.undefined)
  }
  
}

