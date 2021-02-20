package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackedActionLastAccessed extends StObject {
  
  /**
    * The name of the tracked action to which access was attempted. Tracked actions are actions that report activity to IAM.
    */
  var ActionName: js.UndefOr[stringType] = js.native
  
  var LastAccessedEntity: js.UndefOr[arnType] = js.native
  
  /**
    * The Region from which the authenticated entity (user or role) last attempted to access the tracked action. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var LastAccessedRegion: js.UndefOr[stringType] = js.native
  
  /**
    * The date and time, in ISO 8601 date-time format, when an authenticated entity most recently attempted to access the tracked service. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var LastAccessedTime: js.UndefOr[dateType] = js.native
}
object TrackedActionLastAccessed {
  
  @scala.inline
  def apply(): TrackedActionLastAccessed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackedActionLastAccessed]
  }
  
  @scala.inline
  implicit class TrackedActionLastAccessedMutableBuilder[Self <: TrackedActionLastAccessed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionName(value: stringType): Self = StObject.set(x, "ActionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNameUndefined: Self = StObject.set(x, "ActionName", js.undefined)
    
    @scala.inline
    def setLastAccessedEntity(value: arnType): Self = StObject.set(x, "LastAccessedEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAccessedEntityUndefined: Self = StObject.set(x, "LastAccessedEntity", js.undefined)
    
    @scala.inline
    def setLastAccessedRegion(value: stringType): Self = StObject.set(x, "LastAccessedRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAccessedRegionUndefined: Self = StObject.set(x, "LastAccessedRegion", js.undefined)
    
    @scala.inline
    def setLastAccessedTime(value: dateType): Self = StObject.set(x, "LastAccessedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAccessedTimeUndefined: Self = StObject.set(x, "LastAccessedTime", js.undefined)
  }
}
