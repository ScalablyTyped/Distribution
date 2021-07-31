package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentPropertyDescriptions extends StObject {
  
  /**
    * Describes the execution property groups.
    */
  var PropertyGroupDescriptions: js.UndefOr[PropertyGroups] = js.undefined
}
object EnvironmentPropertyDescriptions {
  
  @scala.inline
  def apply(): EnvironmentPropertyDescriptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentPropertyDescriptions]
  }
  
  @scala.inline
  implicit class EnvironmentPropertyDescriptionsMutableBuilder[Self <: EnvironmentPropertyDescriptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPropertyGroupDescriptions(value: PropertyGroups): Self = StObject.set(x, "PropertyGroupDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyGroupDescriptionsUndefined: Self = StObject.set(x, "PropertyGroupDescriptions", js.undefined)
    
    @scala.inline
    def setPropertyGroupDescriptionsVarargs(value: PropertyGroup*): Self = StObject.set(x, "PropertyGroupDescriptions", js.Array(value :_*))
  }
}
