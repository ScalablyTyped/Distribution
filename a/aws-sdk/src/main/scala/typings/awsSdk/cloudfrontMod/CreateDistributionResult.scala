package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDistributionResult extends js.Object {
  /**
    * The distribution's information.
    */
  var Distribution: js.UndefOr[typings.awsSdk.cloudfrontMod.Distribution] = js.native
  /**
    * The current version of the distribution created.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * The fully qualified URI of the new distribution resource just created.
    */
  var Location: js.UndefOr[String] = js.native
}

object CreateDistributionResult {
  @scala.inline
  def apply(): CreateDistributionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDistributionResult]
  }
  @scala.inline
  implicit class CreateDistributionResultOps[Self <: CreateDistributionResult] (val x: Self) extends AnyVal {
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
    def setDistribution(value: Distribution): Self = this.set("Distribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistribution: Self = this.set("Distribution", js.undefined)
    @scala.inline
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
  }
  
}

