package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevisionInfo extends js.Object {
  
  /**
    * Information about an application revision, including usage details and associated deployment groups.
    */
  var genericRevisionInfo: js.UndefOr[GenericRevisionInfo] = js.native
  
  /**
    * Information about the location and type of an application revision.
    */
  var revisionLocation: js.UndefOr[RevisionLocation] = js.native
}
object RevisionInfo {
  
  @scala.inline
  def apply(): RevisionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionInfo]
  }
  
  @scala.inline
  implicit class RevisionInfoOps[Self <: RevisionInfo] (val x: Self) extends AnyVal {
    
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
    def setGenericRevisionInfo(value: GenericRevisionInfo): Self = this.set("genericRevisionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenericRevisionInfo: Self = this.set("genericRevisionInfo", js.undefined)
    
    @scala.inline
    def setRevisionLocation(value: RevisionLocation): Self = this.set("revisionLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionLocation: Self = this.set("revisionLocation", js.undefined)
  }
}
