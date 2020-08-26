package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAttributesRequest extends js.Object {
  /**
    * The names of the attributes.
    */
  var AttributeNames: js.UndefOr[AttributeNameList] = js.native
  /**
    * Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If true, any data previously written to SimpleDB will be returned. Otherwise, results will be consistent eventually, and the client may not see data that was written immediately before your read.
    */
  var ConsistentRead: js.UndefOr[Boolean] = js.native
  /**
    * The name of the domain in which to perform the operation.
    */
  var DomainName: String = js.native
  /**
    * The name of the item.
    */
  var ItemName: String = js.native
}

object GetAttributesRequest {
  @scala.inline
  def apply(DomainName: String, ItemName: String): GetAttributesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ItemName = ItemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAttributesRequest]
  }
  @scala.inline
  implicit class GetAttributesRequestOps[Self <: GetAttributesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDomainName(value: String): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemName(value: String): Self = this.set("ItemName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributeNamesVarargs(value: String*): Self = this.set("AttributeNames", js.Array(value :_*))
    @scala.inline
    def setAttributeNames(value: AttributeNameList): Self = this.set("AttributeNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeNames: Self = this.set("AttributeNames", js.undefined)
    @scala.inline
    def setConsistentRead(value: Boolean): Self = this.set("ConsistentRead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsistentRead: Self = this.set("ConsistentRead", js.undefined)
  }
  
}

