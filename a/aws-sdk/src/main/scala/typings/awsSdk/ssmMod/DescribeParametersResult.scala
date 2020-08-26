package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeParametersResult extends js.Object {
  /**
    * The token to use when requesting the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * Parameters returned by the request.
    */
  var Parameters: js.UndefOr[ParameterMetadataList] = js.native
}

object DescribeParametersResult {
  @scala.inline
  def apply(): DescribeParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeParametersResult]
  }
  @scala.inline
  implicit class DescribeParametersResultOps[Self <: DescribeParametersResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setParametersVarargs(value: ParameterMetadata*): Self = this.set("Parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: ParameterMetadataList): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
  }
  
}

