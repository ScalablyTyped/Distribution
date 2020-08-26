package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDifferencesOutput extends js.Object {
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.codecommitMod.NextToken] = js.native
  /**
    * A data type object that contains information about the differences, including whether the difference is added, modified, or deleted (A, D, M).
    */
  var differences: js.UndefOr[DifferenceList] = js.native
}

object GetDifferencesOutput {
  @scala.inline
  def apply(): GetDifferencesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDifferencesOutput]
  }
  @scala.inline
  implicit class GetDifferencesOutputOps[Self <: GetDifferencesOutput] (val x: Self) extends AnyVal {
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
    def setDifferencesVarargs(value: Difference*): Self = this.set("differences", js.Array(value :_*))
    @scala.inline
    def setDifferences(value: DifferenceList): Self = this.set("differences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDifferences: Self = this.set("differences", js.undefined)
  }
  
}

