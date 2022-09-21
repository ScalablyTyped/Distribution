package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationComponentDetailsResponse extends StObject {
  
  /**
    *  Detailed information about an application component. 
    */
  var applicationComponentDetail: js.UndefOr[ApplicationComponentDetail] = js.undefined
  
  /**
    *  The associated application group as defined in AWS Application Discovery Service. 
    */
  var associatedApplications: js.UndefOr[AssociatedApplications] = js.undefined
  
  /**
    *  A list of the IDs of the servers on which the application component is running. 
    */
  var associatedServerIds: js.UndefOr[AssociatedServerIDs] = js.undefined
  
  /**
    *  Set to true if the application component belongs to more than one application group. 
    */
  var moreApplicationResource: js.UndefOr[Boolean] = js.undefined
}
object GetApplicationComponentDetailsResponse {
  
  inline def apply(): GetApplicationComponentDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApplicationComponentDetailsResponse]
  }
  
  extension [Self <: GetApplicationComponentDetailsResponse](x: Self) {
    
    inline def setApplicationComponentDetail(value: ApplicationComponentDetail): Self = StObject.set(x, "applicationComponentDetail", value.asInstanceOf[js.Any])
    
    inline def setApplicationComponentDetailUndefined: Self = StObject.set(x, "applicationComponentDetail", js.undefined)
    
    inline def setAssociatedApplications(value: AssociatedApplications): Self = StObject.set(x, "associatedApplications", value.asInstanceOf[js.Any])
    
    inline def setAssociatedApplicationsUndefined: Self = StObject.set(x, "associatedApplications", js.undefined)
    
    inline def setAssociatedApplicationsVarargs(value: AssociatedApplication*): Self = StObject.set(x, "associatedApplications", js.Array(value*))
    
    inline def setAssociatedServerIds(value: AssociatedServerIDs): Self = StObject.set(x, "associatedServerIds", value.asInstanceOf[js.Any])
    
    inline def setAssociatedServerIdsUndefined: Self = StObject.set(x, "associatedServerIds", js.undefined)
    
    inline def setAssociatedServerIdsVarargs(value: String*): Self = StObject.set(x, "associatedServerIds", js.Array(value*))
    
    inline def setMoreApplicationResource(value: Boolean): Self = StObject.set(x, "moreApplicationResource", value.asInstanceOf[js.Any])
    
    inline def setMoreApplicationResourceUndefined: Self = StObject.set(x, "moreApplicationResource", js.undefined)
  }
}
