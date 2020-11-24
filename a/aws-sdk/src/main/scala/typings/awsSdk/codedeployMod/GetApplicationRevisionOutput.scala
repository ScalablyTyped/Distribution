package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetApplicationRevisionOutput extends js.Object {
  
  /**
    * The name of the application that corresponds to the revision.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.native
  
  /**
    * Additional information about the revision, including type and location.
    */
  var revision: js.UndefOr[RevisionLocation] = js.native
  
  /**
    * General information about the revision.
    */
  var revisionInfo: js.UndefOr[GenericRevisionInfo] = js.native
}
object GetApplicationRevisionOutput {
  
  @scala.inline
  def apply(): GetApplicationRevisionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApplicationRevisionOutput]
  }
  
  @scala.inline
  implicit class GetApplicationRevisionOutputOps[Self <: GetApplicationRevisionOutput] (val x: Self) extends AnyVal {
    
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
    def setApplicationName(value: ApplicationName): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationName: Self = this.set("applicationName", js.undefined)
    
    @scala.inline
    def setRevision(value: RevisionLocation): Self = this.set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevision: Self = this.set("revision", js.undefined)
    
    @scala.inline
    def setRevisionInfo(value: GenericRevisionInfo): Self = this.set("revisionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionInfo: Self = this.set("revisionInfo", js.undefined)
  }
}
