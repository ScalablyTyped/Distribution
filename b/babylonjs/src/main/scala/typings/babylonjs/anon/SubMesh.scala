package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubMesh extends StObject {
  
  var effect: typings.babylonjs.BABYLON.Effect = js.native
  
  var subMesh: Nullable[typings.babylonjs.BABYLON.SubMesh] = js.native
}
object SubMesh {
  
  @scala.inline
  def apply(effect: typings.babylonjs.BABYLON.Effect): SubMesh = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubMesh]
  }
  
  @scala.inline
  implicit class SubMeshMutableBuilder[Self <: SubMesh] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffect(value: typings.babylonjs.BABYLON.Effect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubMesh(value: Nullable[typings.babylonjs.BABYLON.SubMesh]): Self = StObject.set(x, "subMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubMeshNull: Self = StObject.set(x, "subMesh", null)
  }
}
