package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOutcomesResult extends js.Object {
  /**
    * The next page token for subsequent requests.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The outcomes. 
    */
  var outcomes: js.UndefOr[OutcomeList] = js.native
}

object GetOutcomesResult {
  @scala.inline
  def apply(): GetOutcomesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOutcomesResult]
  }
  @scala.inline
  implicit class GetOutcomesResultOps[Self <: GetOutcomesResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setOutcomesVarargs(value: Outcome*): Self = this.set("outcomes", js.Array(value :_*))
    @scala.inline
    def setOutcomes(value: OutcomeList): Self = this.set("outcomes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutcomes: Self = this.set("outcomes", js.undefined)
  }
  
}

