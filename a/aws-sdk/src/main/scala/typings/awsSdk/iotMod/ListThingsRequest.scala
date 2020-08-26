package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListThingsRequest extends js.Object {
  /**
    * The attribute name used to search for things.
    */
  var attributeName: js.UndefOr[AttributeName] = js.native
  /**
    * The attribute value used to search for things.
    */
  var attributeValue: js.UndefOr[AttributeValue] = js.native
  /**
    * The maximum number of results to return in this operation.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.native
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The name of the thing type used to search for things.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.native
}

object ListThingsRequest {
  @scala.inline
  def apply(): ListThingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingsRequest]
  }
  @scala.inline
  implicit class ListThingsRequestOps[Self <: ListThingsRequest] (val x: Self) extends AnyVal {
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
    def setAttributeName(value: AttributeName): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeName: Self = this.set("attributeName", js.undefined)
    @scala.inline
    def setAttributeValue(value: AttributeValue): Self = this.set("attributeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeValue: Self = this.set("attributeValue", js.undefined)
    @scala.inline
    def setMaxResults(value: RegistryMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setThingTypeName(value: ThingTypeName): Self = this.set("thingTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingTypeName: Self = this.set("thingTypeName", js.undefined)
  }
  
}

