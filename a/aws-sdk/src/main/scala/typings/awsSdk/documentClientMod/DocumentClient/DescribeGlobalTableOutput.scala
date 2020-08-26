package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGlobalTableOutput extends js.Object {
  /**
    * Contains the details of the global table.
    */
  var GlobalTableDescription: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.GlobalTableDescription] = js.native
}

object DescribeGlobalTableOutput {
  @scala.inline
  def apply(): DescribeGlobalTableOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGlobalTableOutput]
  }
  @scala.inline
  implicit class DescribeGlobalTableOutputOps[Self <: DescribeGlobalTableOutput] (val x: Self) extends AnyVal {
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
    def setGlobalTableDescription(value: GlobalTableDescription): Self = this.set("GlobalTableDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalTableDescription: Self = this.set("GlobalTableDescription", js.undefined)
  }
  
}

