package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentProperties extends js.Object {
  
  /**
    * Describes the execution property groups.
    */
  var PropertyGroups: typings.awsSdk.kinesisanalyticsv2Mod.PropertyGroups = js.native
}
object EnvironmentProperties {
  
  @scala.inline
  def apply(PropertyGroups: PropertyGroups): EnvironmentProperties = {
    val __obj = js.Dynamic.literal(PropertyGroups = PropertyGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentProperties]
  }
  
  @scala.inline
  implicit class EnvironmentPropertiesOps[Self <: EnvironmentProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPropertyGroupsVarargs(value: PropertyGroup*): Self = this.set("PropertyGroups", js.Array(value :_*))
    
    @scala.inline
    def setPropertyGroups(value: PropertyGroups): Self = this.set("PropertyGroups", value.asInstanceOf[js.Any])
  }
}
