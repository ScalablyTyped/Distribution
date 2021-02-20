package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationDescriptionsMessage extends StObject {
  
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
  implicit class ApplicationDescriptionsMessageMutableBuilder[Self <: ApplicationDescriptionsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplications(value: ApplicationDescriptionList): Self = StObject.set(x, "Applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationsUndefined: Self = StObject.set(x, "Applications", js.undefined)
    
    @scala.inline
    def setApplicationsVarargs(value: ApplicationDescription*): Self = StObject.set(x, "Applications", js.Array(value :_*))
  }
}
