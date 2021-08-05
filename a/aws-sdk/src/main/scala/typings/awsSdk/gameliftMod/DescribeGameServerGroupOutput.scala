package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGameServerGroupOutput extends StObject {
  
  /**
    * An object with the property settings for the requested game server group resource. 
    */
  var GameServerGroup: js.UndefOr[typings.awsSdk.gameliftMod.GameServerGroup] = js.undefined
}
object DescribeGameServerGroupOutput {
  
  inline def apply(): DescribeGameServerGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGameServerGroupOutput]
  }
  
  extension [Self <: DescribeGameServerGroupOutput](x: Self) {
    
    inline def setGameServerGroup(value: GameServerGroup): Self = StObject.set(x, "GameServerGroup", value.asInstanceOf[js.Any])
    
    inline def setGameServerGroupUndefined: Self = StObject.set(x, "GameServerGroup", js.undefined)
  }
}
