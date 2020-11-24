package typings.awsSdk.migrationhubconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHomeRegionResult extends js.Object {
  
  /**
    * The name of the home region of the calling account.
    */
  var HomeRegion: js.UndefOr[typings.awsSdk.migrationhubconfigMod.HomeRegion] = js.native
}
object GetHomeRegionResult {
  
  @scala.inline
  def apply(): GetHomeRegionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHomeRegionResult]
  }
  
  @scala.inline
  implicit class GetHomeRegionResultOps[Self <: GetHomeRegionResult] (val x: Self) extends AnyVal {
    
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
    def setHomeRegion(value: HomeRegion): Self = this.set("HomeRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomeRegion: Self = this.set("HomeRegion", js.undefined)
  }
}
