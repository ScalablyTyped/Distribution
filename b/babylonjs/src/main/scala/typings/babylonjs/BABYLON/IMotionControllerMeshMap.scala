package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMotionControllerMeshMap extends js.Object {
  
  /**
    * the mesh that defines the maximum value mesh position.
    */
  var maxMesh: js.UndefOr[AbstractMesh] = js.native
  
  /**
    * the mesh that defines the minimum value mesh position.
    */
  var minMesh: js.UndefOr[AbstractMesh] = js.native
  
  /**
    * The mesh that will be changed when axis value changes
    */
  var valueMesh: js.UndefOr[AbstractMesh] = js.native
}
object IMotionControllerMeshMap {
  
  @scala.inline
  def apply(): IMotionControllerMeshMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMotionControllerMeshMap]
  }
  
  @scala.inline
  implicit class IMotionControllerMeshMapOps[Self <: IMotionControllerMeshMap] (val x: Self) extends AnyVal {
    
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
    def setMaxMesh(value: AbstractMesh): Self = this.set("maxMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxMesh: Self = this.set("maxMesh", js.undefined)
    
    @scala.inline
    def setMinMesh(value: AbstractMesh): Self = this.set("minMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinMesh: Self = this.set("minMesh", js.undefined)
    
    @scala.inline
    def setValueMesh(value: AbstractMesh): Self = this.set("valueMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueMesh: Self = this.set("valueMesh", js.undefined)
  }
}
