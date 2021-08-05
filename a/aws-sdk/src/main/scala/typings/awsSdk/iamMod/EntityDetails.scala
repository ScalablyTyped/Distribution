package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityDetails extends StObject {
  
  /**
    * The EntityInfo object that contains details about the entity (user or role).
    */
  var EntityInfo: typings.awsSdk.iamMod.EntityInfo
  
  /**
    * The date and time, in ISO 8601 date-time format, when the authenticated entity last attempted to access AWS. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var LastAuthenticated: js.UndefOr[dateType] = js.undefined
}
object EntityDetails {
  
  inline def apply(EntityInfo: EntityInfo): EntityDetails = {
    val __obj = js.Dynamic.literal(EntityInfo = EntityInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityDetails]
  }
  
  extension [Self <: EntityDetails](x: Self) {
    
    inline def setEntityInfo(value: EntityInfo): Self = StObject.set(x, "EntityInfo", value.asInstanceOf[js.Any])
    
    inline def setLastAuthenticated(value: dateType): Self = StObject.set(x, "LastAuthenticated", value.asInstanceOf[js.Any])
    
    inline def setLastAuthenticatedUndefined: Self = StObject.set(x, "LastAuthenticated", js.undefined)
  }
}
