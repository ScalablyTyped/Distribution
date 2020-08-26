package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRegionsResult extends js.Object {
  /**
    * An array of key-value pairs containing information about your get regions request.
    */
  var regions: js.UndefOr[RegionList] = js.native
}

object GetRegionsResult {
  @scala.inline
  def apply(): GetRegionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRegionsResult]
  }
  @scala.inline
  implicit class GetRegionsResultOps[Self <: GetRegionsResult] (val x: Self) extends AnyVal {
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
    def setRegionsVarargs(value: Region*): Self = this.set("regions", js.Array(value :_*))
    @scala.inline
    def setRegions(value: RegionList): Self = this.set("regions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
  }
  
}

