package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MissionProfileListItem extends StObject {
  
  /**
    * ARN of a mission profile.
    */
  var missionProfileArn: js.UndefOr[MissionProfileArn] = js.undefined
  
  /**
    * UUID of a mission profile.
    */
  var missionProfileId: js.UndefOr[String] = js.undefined
  
  /**
    * Name of a mission profile.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Region of a mission profile.
    */
  var region: js.UndefOr[String] = js.undefined
}
object MissionProfileListItem {
  
  inline def apply(): MissionProfileListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MissionProfileListItem]
  }
  
  extension [Self <: MissionProfileListItem](x: Self) {
    
    inline def setMissionProfileArn(value: MissionProfileArn): Self = StObject.set(x, "missionProfileArn", value.asInstanceOf[js.Any])
    
    inline def setMissionProfileArnUndefined: Self = StObject.set(x, "missionProfileArn", js.undefined)
    
    inline def setMissionProfileId(value: String): Self = StObject.set(x, "missionProfileId", value.asInstanceOf[js.Any])
    
    inline def setMissionProfileIdUndefined: Self = StObject.set(x, "missionProfileId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
