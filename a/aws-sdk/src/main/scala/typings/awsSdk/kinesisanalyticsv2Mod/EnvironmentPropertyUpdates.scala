package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentPropertyUpdates extends StObject {
  
  /**
    * Describes updates to the execution property groups.
    */
  var PropertyGroups: typings.awsSdk.kinesisanalyticsv2Mod.PropertyGroups
}
object EnvironmentPropertyUpdates {
  
  inline def apply(PropertyGroups: PropertyGroups): EnvironmentPropertyUpdates = {
    val __obj = js.Dynamic.literal(PropertyGroups = PropertyGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentPropertyUpdates]
  }
  
  extension [Self <: EnvironmentPropertyUpdates](x: Self) {
    
    inline def setPropertyGroups(value: PropertyGroups): Self = StObject.set(x, "PropertyGroups", value.asInstanceOf[js.Any])
    
    inline def setPropertyGroupsVarargs(value: PropertyGroup*): Self = StObject.set(x, "PropertyGroups", js.Array(value*))
  }
}
