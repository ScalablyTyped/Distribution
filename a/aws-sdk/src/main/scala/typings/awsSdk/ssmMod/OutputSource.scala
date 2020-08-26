package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputSource extends js.Object {
  /**
    * The ID of the output source, for example the URL of an S3 bucket.
    */
  var OutputSourceId: js.UndefOr[typings.awsSdk.ssmMod.OutputSourceId] = js.native
  /**
    * The type of source where the association execution details are stored, for example, Amazon S3.
    */
  var OutputSourceType: js.UndefOr[typings.awsSdk.ssmMod.OutputSourceType] = js.native
}

object OutputSource {
  @scala.inline
  def apply(): OutputSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputSource]
  }
  @scala.inline
  implicit class OutputSourceOps[Self <: OutputSource] (val x: Self) extends AnyVal {
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
    def setOutputSourceId(value: OutputSourceId): Self = this.set("OutputSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputSourceId: Self = this.set("OutputSourceId", js.undefined)
    @scala.inline
    def setOutputSourceType(value: OutputSourceType): Self = this.set("OutputSourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputSourceType: Self = this.set("OutputSourceType", js.undefined)
  }
  
}

