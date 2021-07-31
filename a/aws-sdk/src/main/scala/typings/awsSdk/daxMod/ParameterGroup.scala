package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterGroup extends StObject {
  
  /**
    * A description of the parameter group.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.undefined
}
object ParameterGroup {
  
  @scala.inline
  def apply(): ParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterGroup]
  }
  
  @scala.inline
  implicit class ParameterGroupMutableBuilder[Self <: ParameterGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterGroupNameUndefined: Self = StObject.set(x, "ParameterGroupName", js.undefined)
  }
}
