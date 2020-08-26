package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDimensionsResponse extends js.Object {
  /**
    * A list of the names of the defined dimensions. Use DescribeDimension to get details for a dimension.
    */
  var dimensionNames: js.UndefOr[DimensionNames] = js.native
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDimensionsResponse {
  @scala.inline
  def apply(): ListDimensionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDimensionsResponse]
  }
  @scala.inline
  implicit class ListDimensionsResponseOps[Self <: ListDimensionsResponse] (val x: Self) extends AnyVal {
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
    def setDimensionNamesVarargs(value: DimensionName*): Self = this.set("dimensionNames", js.Array(value :_*))
    @scala.inline
    def setDimensionNames(value: DimensionNames): Self = this.set("dimensionNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionNames: Self = this.set("dimensionNames", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

