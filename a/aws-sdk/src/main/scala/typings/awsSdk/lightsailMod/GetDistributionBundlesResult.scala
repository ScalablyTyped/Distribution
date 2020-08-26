package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDistributionBundlesResult extends js.Object {
  /**
    * An object that describes a distribution bundle.
    */
  var bundles: js.UndefOr[DistributionBundleList] = js.native
}

object GetDistributionBundlesResult {
  @scala.inline
  def apply(): GetDistributionBundlesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionBundlesResult]
  }
  @scala.inline
  implicit class GetDistributionBundlesResultOps[Self <: GetDistributionBundlesResult] (val x: Self) extends AnyVal {
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
    def setBundlesVarargs(value: DistributionBundle*): Self = this.set("bundles", js.Array(value :_*))
    @scala.inline
    def setBundles(value: DistributionBundleList): Self = this.set("bundles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundles: Self = this.set("bundles", js.undefined)
  }
  
}

