package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListScriptsInput extends js.Object {
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.native
  /**
    * A token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.native
}

object ListScriptsInput {
  @scala.inline
  def apply(): ListScriptsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListScriptsInput]
  }
  @scala.inline
  implicit class ListScriptsInputOps[Self <: ListScriptsInput] (val x: Self) extends AnyVal {
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
    def setLimit(value: PositiveInteger): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNextToken(value: NonEmptyString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

