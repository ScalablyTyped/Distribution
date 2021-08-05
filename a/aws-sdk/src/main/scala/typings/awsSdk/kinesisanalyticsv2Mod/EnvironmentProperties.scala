package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentProperties extends StObject {
  
  /**
    * Describes the execution property groups.
    */
  var PropertyGroups: typings.awsSdk.kinesisanalyticsv2Mod.PropertyGroups
}
object EnvironmentProperties {
  
  inline def apply(PropertyGroups: PropertyGroups): EnvironmentProperties = {
    val __obj = js.Dynamic.literal(PropertyGroups = PropertyGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentProperties]
  }
  
  extension [Self <: EnvironmentProperties](x: Self) {
    
    inline def setPropertyGroups(value: PropertyGroups): Self = StObject.set(x, "PropertyGroups", value.asInstanceOf[js.Any])
    
    inline def setPropertyGroupsVarargs(value: PropertyGroup*): Self = StObject.set(x, "PropertyGroups", js.Array(value :_*))
  }
}
