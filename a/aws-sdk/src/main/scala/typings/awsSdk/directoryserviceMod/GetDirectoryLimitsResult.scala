package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDirectoryLimitsResult extends js.Object {
  
  /**
    * A DirectoryLimits object that contains the directory limits for the current rRegion.
    */
  var DirectoryLimits: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryLimits] = js.native
}
object GetDirectoryLimitsResult {
  
  @scala.inline
  def apply(): GetDirectoryLimitsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDirectoryLimitsResult]
  }
  
  @scala.inline
  implicit class GetDirectoryLimitsResultOps[Self <: GetDirectoryLimitsResult] (val x: Self) extends AnyVal {
    
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
    def setDirectoryLimits(value: DirectoryLimits): Self = this.set("DirectoryLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoryLimits: Self = this.set("DirectoryLimits", js.undefined)
  }
}
