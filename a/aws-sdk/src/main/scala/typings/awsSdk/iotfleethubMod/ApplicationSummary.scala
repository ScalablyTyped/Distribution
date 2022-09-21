package typings.awsSdk.iotfleethubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationSummary extends StObject {
  
  /**
    * The date (in Unix epoch time) when the web application was created.
    */
  var applicationCreationDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * An optional description of the web application.
    */
  var applicationDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * The unique Id of the web application.
    */
  var applicationId: Id
  
  /**
    * The date (in Unix epoch time) when the web application was last updated.
    */
  var applicationLastUpdateDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the web application.
    */
  var applicationName: Name
  
  /**
    * The current state of the web application.
    */
  var applicationState: js.UndefOr[ApplicationState] = js.undefined
  
  /**
    * The URL of the web application.
    */
  var applicationUrl: Url
}
object ApplicationSummary {
  
  inline def apply(applicationId: Id, applicationName: Name, applicationUrl: Url): ApplicationSummary = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], applicationName = applicationName.asInstanceOf[js.Any], applicationUrl = applicationUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSummary]
  }
  
  extension [Self <: ApplicationSummary](x: Self) {
    
    inline def setApplicationCreationDate(value: Timestamp): Self = StObject.set(x, "applicationCreationDate", value.asInstanceOf[js.Any])
    
    inline def setApplicationCreationDateUndefined: Self = StObject.set(x, "applicationCreationDate", js.undefined)
    
    inline def setApplicationDescription(value: Description): Self = StObject.set(x, "applicationDescription", value.asInstanceOf[js.Any])
    
    inline def setApplicationDescriptionUndefined: Self = StObject.set(x, "applicationDescription", js.undefined)
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationLastUpdateDate(value: Timestamp): Self = StObject.set(x, "applicationLastUpdateDate", value.asInstanceOf[js.Any])
    
    inline def setApplicationLastUpdateDateUndefined: Self = StObject.set(x, "applicationLastUpdateDate", js.undefined)
    
    inline def setApplicationName(value: Name): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationState(value: ApplicationState): Self = StObject.set(x, "applicationState", value.asInstanceOf[js.Any])
    
    inline def setApplicationStateUndefined: Self = StObject.set(x, "applicationState", js.undefined)
    
    inline def setApplicationUrl(value: Url): Self = StObject.set(x, "applicationUrl", value.asInstanceOf[js.Any])
  }
}
