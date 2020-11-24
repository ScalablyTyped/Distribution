package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameter extends js.Object {
  
  /**
    * A range of values within which the parameter can be set.
    */
  var AllowedValues: js.UndefOr[String] = js.native
  
  /**
    * The conditions under which changes to this parameter can be applied. For example, requires-reboot indicates that a new value for this parameter will only take effect if a node is rebooted.
    */
  var ChangeType: js.UndefOr[typings.awsSdk.daxMod.ChangeType] = js.native
  
  /**
    * The data type of the parameter. For example, integer:
    */
  var DataType: js.UndefOr[String] = js.native
  
  /**
    * A description of the parameter
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Whether the customer is allowed to modify the parameter.
    */
  var IsModifiable: js.UndefOr[typings.awsSdk.daxMod.IsModifiable] = js.native
  
  /**
    * A list of node types, and specific parameter values for each node.
    */
  var NodeTypeSpecificValues: js.UndefOr[NodeTypeSpecificValueList] = js.native
  
  /**
    * The name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.native
  
  /**
    * Determines whether the parameter can be applied to any nodes, or only nodes of a particular type.
    */
  var ParameterType: js.UndefOr[typings.awsSdk.daxMod.ParameterType] = js.native
  
  /**
    * The value for the parameter.
    */
  var ParameterValue: js.UndefOr[String] = js.native
  
  /**
    * How the parameter is defined. For example, system denotes a system-defined parameter.
    */
  var Source: js.UndefOr[String] = js.native
}
object Parameter {
  
  @scala.inline
  def apply(): Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameter]
  }
  
  @scala.inline
  implicit class ParameterOps[Self <: Parameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowedValues(value: String): Self = this.set("AllowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedValues: Self = this.set("AllowedValues", js.undefined)
    
    @scala.inline
    def setChangeType(value: ChangeType): Self = this.set("ChangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeType: Self = this.set("ChangeType", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = this.set("DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("DataType", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setIsModifiable(value: IsModifiable): Self = this.set("IsModifiable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsModifiable: Self = this.set("IsModifiable", js.undefined)
    
    @scala.inline
    def setNodeTypeSpecificValuesVarargs(value: NodeTypeSpecificValue*): Self = this.set("NodeTypeSpecificValues", js.Array(value :_*))
    
    @scala.inline
    def setNodeTypeSpecificValues(value: NodeTypeSpecificValueList): Self = this.set("NodeTypeSpecificValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeTypeSpecificValues: Self = this.set("NodeTypeSpecificValues", js.undefined)
    
    @scala.inline
    def setParameterName(value: String): Self = this.set("ParameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterName: Self = this.set("ParameterName", js.undefined)
    
    @scala.inline
    def setParameterType(value: ParameterType): Self = this.set("ParameterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterType: Self = this.set("ParameterType", js.undefined)
    
    @scala.inline
    def setParameterValue(value: String): Self = this.set("ParameterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterValue: Self = this.set("ParameterValue", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
  }
}
