package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMLTransformsResponse extends js.Object {
  /**
    * A pagination token, if more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * A list of machine learning transforms.
    */
  var Transforms: TransformList = js.native
}

object GetMLTransformsResponse {
  @scala.inline
  def apply(Transforms: TransformList): GetMLTransformsResponse = {
    val __obj = js.Dynamic.literal(Transforms = Transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMLTransformsResponse]
  }
  @scala.inline
  implicit class GetMLTransformsResponseOps[Self <: GetMLTransformsResponse] (val x: Self) extends AnyVal {
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
    def setTransformsVarargs(value: MLTransform*): Self = this.set("Transforms", js.Array(value :_*))
    @scala.inline
    def setTransforms(value: TransformList): Self = this.set("Transforms", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

