package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateParameterGroupRequest extends StObject {
  
  /**
    * A description of the parameter group.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The name of the parameter group to apply to all of the clusters in this replication group.
    */
  var ParameterGroupName: String = js.native
}
object CreateParameterGroupRequest {
  
  @scala.inline
  def apply(ParameterGroupName: String): CreateParameterGroupRequest = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParameterGroupRequest]
  }
  
  @scala.inline
  implicit class CreateParameterGroupRequestMutableBuilder[Self <: CreateParameterGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
  }
}
