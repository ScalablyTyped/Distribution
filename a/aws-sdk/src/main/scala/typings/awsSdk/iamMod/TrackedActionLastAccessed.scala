package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackedActionLastAccessed extends StObject {
  
  /**
    * The name of the tracked action to which access was attempted. Tracked actions are actions that report activity to IAM.
    */
  var ActionName: js.UndefOr[stringType] = js.undefined
  
  var LastAccessedEntity: js.UndefOr[arnType] = js.undefined
  
  /**
    * The Region from which the authenticated entity (user or role) last attempted to access the tracked action. Amazon Web Services does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var LastAccessedRegion: js.UndefOr[stringType] = js.undefined
  
  /**
    * The date and time, in ISO 8601 date-time format, when an authenticated entity most recently attempted to access the tracked service. Amazon Web Services does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var LastAccessedTime: js.UndefOr[js.Date] = js.undefined
}
object TrackedActionLastAccessed {
  
  inline def apply(): TrackedActionLastAccessed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackedActionLastAccessed]
  }
  
  extension [Self <: TrackedActionLastAccessed](x: Self) {
    
    inline def setActionName(value: stringType): Self = StObject.set(x, "ActionName", value.asInstanceOf[js.Any])
    
    inline def setActionNameUndefined: Self = StObject.set(x, "ActionName", js.undefined)
    
    inline def setLastAccessedEntity(value: arnType): Self = StObject.set(x, "LastAccessedEntity", value.asInstanceOf[js.Any])
    
    inline def setLastAccessedEntityUndefined: Self = StObject.set(x, "LastAccessedEntity", js.undefined)
    
    inline def setLastAccessedRegion(value: stringType): Self = StObject.set(x, "LastAccessedRegion", value.asInstanceOf[js.Any])
    
    inline def setLastAccessedRegionUndefined: Self = StObject.set(x, "LastAccessedRegion", js.undefined)
    
    inline def setLastAccessedTime(value: js.Date): Self = StObject.set(x, "LastAccessedTime", value.asInstanceOf[js.Any])
    
    inline def setLastAccessedTimeUndefined: Self = StObject.set(x, "LastAccessedTime", js.undefined)
  }
}
