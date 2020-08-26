package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListExportsOutput extends js.Object {
  /**
    * The output for the ListExports action.
    */
  var Exports: js.UndefOr[typings.awsSdk.cloudformationMod.Exports] = js.native
  /**
    * If the output exceeds 100 exported output values, a string that identifies the next page of exports. If there is no additional page, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
}

object ListExportsOutput {
  @scala.inline
  def apply(): ListExportsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExportsOutput]
  }
  @scala.inline
  implicit class ListExportsOutputOps[Self <: ListExportsOutput] (val x: Self) extends AnyVal {
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
    def setExportsVarargs(value: Export*): Self = this.set("Exports", js.Array(value :_*))
    @scala.inline
    def setExports(value: Exports): Self = this.set("Exports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExports: Self = this.set("Exports", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

