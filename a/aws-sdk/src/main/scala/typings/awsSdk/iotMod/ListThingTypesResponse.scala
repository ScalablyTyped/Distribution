package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListThingTypesResponse extends js.Object {
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The thing types.
    */
  var thingTypes: js.UndefOr[ThingTypeList] = js.native
}

object ListThingTypesResponse {
  @scala.inline
  def apply(): ListThingTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingTypesResponse]
  }
  @scala.inline
  implicit class ListThingTypesResponseOps[Self <: ListThingTypesResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setThingTypesVarargs(value: ThingTypeDefinition*): Self = this.set("thingTypes", js.Array(value :_*))
    @scala.inline
    def setThingTypes(value: ThingTypeList): Self = this.set("thingTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingTypes: Self = this.set("thingTypes", js.undefined)
  }
  
}

