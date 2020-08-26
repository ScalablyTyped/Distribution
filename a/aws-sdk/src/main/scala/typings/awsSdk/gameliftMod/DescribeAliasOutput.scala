package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAliasOutput extends js.Object {
  /**
    * The requested alias resource.
    */
  var Alias: js.UndefOr[typings.awsSdk.gameliftMod.Alias] = js.native
}

object DescribeAliasOutput {
  @scala.inline
  def apply(): DescribeAliasOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAliasOutput]
  }
  @scala.inline
  implicit class DescribeAliasOutputOps[Self <: DescribeAliasOutput] (val x: Self) extends AnyVal {
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
    def setAlias(value: Alias): Self = this.set("Alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("Alias", js.undefined)
  }
  
}

