package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateParameterGroupResponse extends StObject {
  
  /**
    * Represents the output of a CreateParameterGroup action.
    */
  var ParameterGroup: js.UndefOr[typings.awsSdk.daxMod.ParameterGroup] = js.native
}
object CreateParameterGroupResponse {
  
  @scala.inline
  def apply(): CreateParameterGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateParameterGroupResponse]
  }
  
  @scala.inline
  implicit class CreateParameterGroupResponseMutableBuilder[Self <: CreateParameterGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterGroup(value: ParameterGroup): Self = StObject.set(x, "ParameterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterGroupUndefined: Self = StObject.set(x, "ParameterGroup", js.undefined)
  }
}
