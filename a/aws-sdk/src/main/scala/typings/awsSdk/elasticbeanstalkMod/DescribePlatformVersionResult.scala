package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePlatformVersionResult extends js.Object {
  
  /**
    * Detailed information about the platform version.
    */
  var PlatformDescription: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformDescription] = js.native
}
object DescribePlatformVersionResult {
  
  @scala.inline
  def apply(): DescribePlatformVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePlatformVersionResult]
  }
  
  @scala.inline
  implicit class DescribePlatformVersionResultOps[Self <: DescribePlatformVersionResult] (val x: Self) extends AnyVal {
    
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
    def setPlatformDescription(value: PlatformDescription): Self = this.set("PlatformDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformDescription: Self = this.set("PlatformDescription", js.undefined)
  }
}
