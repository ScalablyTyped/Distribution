package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupConfigurationOutput extends StObject {
  
  /**
    * The configuration associated with the specified group.
    */
  var GroupConfiguration: js.UndefOr[typings.awsSdk.resourcegroupsMod.GroupConfiguration] = js.undefined
}
object GetGroupConfigurationOutput {
  
  @scala.inline
  def apply(): GetGroupConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupConfigurationOutput]
  }
  
  @scala.inline
  implicit class GetGroupConfigurationOutputMutableBuilder[Self <: GetGroupConfigurationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupConfiguration(value: GroupConfiguration): Self = StObject.set(x, "GroupConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupConfigurationUndefined: Self = StObject.set(x, "GroupConfiguration", js.undefined)
  }
}
