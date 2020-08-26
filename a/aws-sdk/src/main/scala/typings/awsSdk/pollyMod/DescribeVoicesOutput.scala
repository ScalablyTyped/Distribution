package typings.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVoicesOutput extends js.Object {
  /**
    * The pagination token to use in the next request to continue the listing of voices. NextToken is returned only if the response is truncated.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pollyMod.NextToken] = js.native
  /**
    * A list of voices with their properties.
    */
  var Voices: js.UndefOr[VoiceList] = js.native
}

object DescribeVoicesOutput {
  @scala.inline
  def apply(): DescribeVoicesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVoicesOutput]
  }
  @scala.inline
  implicit class DescribeVoicesOutputOps[Self <: DescribeVoicesOutput] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setVoicesVarargs(value: Voice*): Self = this.set("Voices", js.Array(value :_*))
    @scala.inline
    def setVoices(value: VoiceList): Self = this.set("Voices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoices: Self = this.set("Voices", js.undefined)
  }
  
}

