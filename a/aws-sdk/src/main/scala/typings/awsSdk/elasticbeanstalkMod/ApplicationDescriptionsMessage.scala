package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationDescriptionsMessage extends StObject {
  
  /**
    * This parameter contains a list of ApplicationDescription.
    */
  var Applications: js.UndefOr[ApplicationDescriptionList] = js.undefined
}
object ApplicationDescriptionsMessage {
  
  inline def apply(): ApplicationDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationDescriptionsMessage]
  }
  
  extension [Self <: ApplicationDescriptionsMessage](x: Self) {
    
    inline def setApplications(value: ApplicationDescriptionList): Self = StObject.set(x, "Applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "Applications", js.undefined)
    
    inline def setApplicationsVarargs(value: ApplicationDescription*): Self = StObject.set(x, "Applications", js.Array(value :_*))
  }
}
