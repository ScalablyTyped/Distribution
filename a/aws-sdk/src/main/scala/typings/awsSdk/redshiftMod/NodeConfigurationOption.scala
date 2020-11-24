package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeConfigurationOption extends js.Object {
  
  /**
    * The estimated disk utilizaton percentage.
    */
  var EstimatedDiskUtilizationPercent: js.UndefOr[DoubleOptional] = js.native
  
  /**
    * The category of the node configuration recommendation.
    */
  var Mode: js.UndefOr[typings.awsSdk.redshiftMod.Mode] = js.native
  
  /**
    * The node type, such as, "ds2.8xlarge".
    */
  var NodeType: js.UndefOr[String] = js.native
  
  /**
    * The number of nodes.
    */
  var NumberOfNodes: js.UndefOr[Integer] = js.native
}
object NodeConfigurationOption {
  
  @scala.inline
  def apply(): NodeConfigurationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeConfigurationOption]
  }
  
  @scala.inline
  implicit class NodeConfigurationOptionOps[Self <: NodeConfigurationOption] (val x: Self) extends AnyVal {
    
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
    def setEstimatedDiskUtilizationPercent(value: DoubleOptional): Self = this.set("EstimatedDiskUtilizationPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedDiskUtilizationPercent: Self = this.set("EstimatedDiskUtilizationPercent", js.undefined)
    
    @scala.inline
    def setMode(value: Mode): Self = this.set("Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("Mode", js.undefined)
    
    @scala.inline
    def setNodeType(value: String): Self = this.set("NodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeType: Self = this.set("NodeType", js.undefined)
    
    @scala.inline
    def setNumberOfNodes(value: Integer): Self = this.set("NumberOfNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfNodes: Self = this.set("NumberOfNodes", js.undefined)
  }
}
