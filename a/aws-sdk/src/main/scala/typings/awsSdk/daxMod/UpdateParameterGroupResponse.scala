package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateParameterGroupResponse extends StObject {
  
  /**
    * The parameter group that has been modified.
    */
  var ParameterGroup: js.UndefOr[typings.awsSdk.daxMod.ParameterGroup] = js.native
}
object UpdateParameterGroupResponse {
  
  @scala.inline
  def apply(): UpdateParameterGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateParameterGroupResponse]
  }
  
  @scala.inline
  implicit class UpdateParameterGroupResponseMutableBuilder[Self <: UpdateParameterGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterGroup(value: ParameterGroup): Self = StObject.set(x, "ParameterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterGroupUndefined: Self = StObject.set(x, "ParameterGroup", js.undefined)
  }
}
