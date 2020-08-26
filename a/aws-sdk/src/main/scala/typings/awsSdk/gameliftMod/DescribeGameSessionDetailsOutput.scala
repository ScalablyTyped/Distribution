package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGameSessionDetailsOutput extends js.Object {
  /**
    * A collection of objects containing game session properties and the protection policy currently in force for each session matching the request.
    */
  var GameSessionDetails: js.UndefOr[GameSessionDetailList] = js.native
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}

object DescribeGameSessionDetailsOutput {
  @scala.inline
  def apply(): DescribeGameSessionDetailsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGameSessionDetailsOutput]
  }
  @scala.inline
  implicit class DescribeGameSessionDetailsOutputOps[Self <: DescribeGameSessionDetailsOutput] (val x: Self) extends AnyVal {
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
    def setGameSessionDetailsVarargs(value: GameSessionDetail*): Self = this.set("GameSessionDetails", js.Array(value :_*))
    @scala.inline
    def setGameSessionDetails(value: GameSessionDetailList): Self = this.set("GameSessionDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGameSessionDetails: Self = this.set("GameSessionDetails", js.undefined)
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

