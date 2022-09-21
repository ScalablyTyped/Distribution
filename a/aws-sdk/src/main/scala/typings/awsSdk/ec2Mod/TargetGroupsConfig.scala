package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetGroupsConfig extends StObject {
  
  /**
    * One or more target groups.
    */
  var TargetGroups: js.UndefOr[typings.awsSdk.ec2Mod.TargetGroups] = js.undefined
}
object TargetGroupsConfig {
  
  inline def apply(): TargetGroupsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGroupsConfig]
  }
  
  extension [Self <: TargetGroupsConfig](x: Self) {
    
    inline def setTargetGroups(value: TargetGroups): Self = StObject.set(x, "TargetGroups", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupsUndefined: Self = StObject.set(x, "TargetGroups", js.undefined)
    
    inline def setTargetGroupsVarargs(value: TargetGroup*): Self = StObject.set(x, "TargetGroups", js.Array(value*))
  }
}
