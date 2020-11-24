package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeMaterialOptimizer extends js.Object {
  
  /**
    * Function used to optimize a NodeMaterial graph
    * @param vertexOutputNodes defines the list of output nodes for the vertex shader
    * @param fragmentOutputNodes defines the list of output nodes for the fragment shader
    */
  def optimize(vertexOutputNodes: js.Array[NodeMaterialBlock], fragmentOutputNodes: js.Array[NodeMaterialBlock]): Unit = js.native
}
object NodeMaterialOptimizer {
  
  @scala.inline
  def apply(optimize: (js.Array[NodeMaterialBlock], js.Array[NodeMaterialBlock]) => Unit): NodeMaterialOptimizer = {
    val __obj = js.Dynamic.literal(optimize = js.Any.fromFunction2(optimize))
    __obj.asInstanceOf[NodeMaterialOptimizer]
  }
  
  @scala.inline
  implicit class NodeMaterialOptimizerOps[Self <: NodeMaterialOptimizer] (val x: Self) extends AnyVal {
    
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
    def setOptimize(value: (js.Array[NodeMaterialBlock], js.Array[NodeMaterialBlock]) => Unit): Self = this.set("optimize", js.Any.fromFunction2(value))
  }
}
