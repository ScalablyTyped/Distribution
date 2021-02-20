package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FollowModeScheduleActionStartSettings extends StObject {
  
  /**
    * Identifies whether this action starts relative to the start or relative to the end of the reference action.
    */
  var FollowPoint: typings.awsSdk.medialiveMod.FollowPoint = js.native
  
  /**
    * The action name of another action that this one refers to.
    */
  var ReferenceActionName: string = js.native
}
object FollowModeScheduleActionStartSettings {
  
  @scala.inline
  def apply(FollowPoint: FollowPoint, ReferenceActionName: string): FollowModeScheduleActionStartSettings = {
    val __obj = js.Dynamic.literal(FollowPoint = FollowPoint.asInstanceOf[js.Any], ReferenceActionName = ReferenceActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowModeScheduleActionStartSettings]
  }
  
  @scala.inline
  implicit class FollowModeScheduleActionStartSettingsMutableBuilder[Self <: FollowModeScheduleActionStartSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFollowPoint(value: FollowPoint): Self = StObject.set(x, "FollowPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceActionName(value: string): Self = StObject.set(x, "ReferenceActionName", value.asInstanceOf[js.Any])
  }
}
