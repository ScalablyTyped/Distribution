package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialSource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the source.
    */
  var SourceArn: TrialSourceArn = js.native
  /**
    * The source job type.
    */
  var SourceType: js.UndefOr[typings.awsSdk.sagemakerMod.SourceType] = js.native
}

object TrialSource {
  @scala.inline
  def apply(SourceArn: TrialSourceArn): TrialSource = {
    val __obj = js.Dynamic.literal(SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialSource]
  }
  @scala.inline
  implicit class TrialSourceOps[Self <: TrialSource] (val x: Self) extends AnyVal {
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
    def setSourceArn(value: TrialSourceArn): Self = this.set("SourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceType(value: SourceType): Self = this.set("SourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("SourceType", js.undefined)
  }
  
}

