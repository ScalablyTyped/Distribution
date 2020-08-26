package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAliasInput extends js.Object {
  /**
    * The unique identifier for the fleet alias that you want to retrieve. You can use either the alias ID or ARN value. 
    */
  var AliasId: AliasIdOrArn = js.native
}

object DescribeAliasInput {
  @scala.inline
  def apply(AliasId: AliasIdOrArn): DescribeAliasInput = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAliasInput]
  }
  @scala.inline
  implicit class DescribeAliasInputOps[Self <: DescribeAliasInput] (val x: Self) extends AnyVal {
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
    def setAliasId(value: AliasIdOrArn): Self = this.set("AliasId", value.asInstanceOf[js.Any])
  }
  
}

