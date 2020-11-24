package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrePassConfiguration extends js.Object {
  
  /**
    * Binds the material data.
    * @param effect defines the effect to update
    * @param scene defines the scene the material belongs to.
    * @param mesh The mesh
    * @param world World matrix of this mesh
    * @param isFrozen Is the material frozen
    */
  def bindForSubMesh(effect: Effect, scene: Scene, mesh: Mesh, world: Matrix, isFrozen: Boolean): Unit = js.native
  
  /**
    * Previous bones of meshes carrying this material
    * Used for computing velocity
    */
  var previousBones: NumberDictionary[Float32Array] = js.native
  
  /**
    * Previous view project matrix
    * Used for computing velocity
    */
  var previousViewProjection: Matrix = js.native
  
  /**
    * Previous world matrices of meshes carrying this material
    * Used for computing velocity
    */
  var previousWorldMatrices: NumberDictionary[Matrix] = js.native
}
object PrePassConfiguration {
  
  @scala.inline
  def apply(
    bindForSubMesh: (Effect, Scene, Mesh, Matrix, Boolean) => Unit,
    previousBones: NumberDictionary[Float32Array],
    previousViewProjection: Matrix,
    previousWorldMatrices: NumberDictionary[Matrix]
  ): PrePassConfiguration = {
    val __obj = js.Dynamic.literal(bindForSubMesh = js.Any.fromFunction5(bindForSubMesh), previousBones = previousBones.asInstanceOf[js.Any], previousViewProjection = previousViewProjection.asInstanceOf[js.Any], previousWorldMatrices = previousWorldMatrices.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrePassConfiguration]
  }
  
  @scala.inline
  implicit class PrePassConfigurationOps[Self <: PrePassConfiguration] (val x: Self) extends AnyVal {
    
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
    def setBindForSubMesh(value: (Effect, Scene, Mesh, Matrix, Boolean) => Unit): Self = this.set("bindForSubMesh", js.Any.fromFunction5(value))
    
    @scala.inline
    def setPreviousBones(value: NumberDictionary[Float32Array]): Self = this.set("previousBones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousViewProjection(value: Matrix): Self = this.set("previousViewProjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousWorldMatrices(value: NumberDictionary[Matrix]): Self = this.set("previousWorldMatrices", value.asInstanceOf[js.Any])
  }
}
