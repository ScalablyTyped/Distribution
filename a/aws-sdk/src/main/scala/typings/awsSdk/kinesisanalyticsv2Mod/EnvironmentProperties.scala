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
  
  @scala.inline
  def apply(PropertyGroups: PropertyGroups): EnvironmentProperties = {
    val __obj = js.Dynamic.literal(PropertyGroups = PropertyGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentProperties]
  }
  
  @scala.inline
  implicit class EnvironmentPropertiesMutableBuilder[Self <: EnvironmentProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyGroups(value: PropertyGroups): Self = StObject.set(x, "PropertyGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyGroupsVarargs(value: PropertyGroup*): Self = StObject.set(x, "PropertyGroups", js.Array(value :_*))
  }
}
