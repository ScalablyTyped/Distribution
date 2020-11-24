package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationDescriptionsMessage extends js.Object {
  
  /**
    * This parameter contains a list of ApplicationDescription.
    */
  var Applications: js.UndefOr[ApplicationDescriptionList] = js.native
}
object ApplicationDescriptionsMessage {
  
  @scala.inline
  def apply(): ApplicationDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationDescriptionsMessage]
  }
  
  @scala.inline
  implicit class ApplicationDescriptionsMessageOps[Self <: ApplicationDescriptionsMessage] (val x: Self) extends AnyVal {
    
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
    def setApplicationsVarargs(value: ApplicationDescription*): Self = this.set("Applications", js.Array(value :_*))
    
    @scala.inline
    def setApplications(value: ApplicationDescriptionList): Self = this.set("Applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplications: Self = this.set("Applications", js.undefined)
  }
}
