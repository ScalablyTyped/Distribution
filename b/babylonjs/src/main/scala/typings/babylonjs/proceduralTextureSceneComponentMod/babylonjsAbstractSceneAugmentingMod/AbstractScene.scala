package typings.babylonjs.proceduralTextureSceneComponentMod.babylonjsAbstractSceneAugmentingMod

import typings.babylonjs.proceduralTextureMod.ProceduralTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractScene extends js.Object {
  
  /**
    * The list of procedural textures added to the scene
    * @see https://doc.babylonjs.com/how_to/how_to_use_procedural_textures
    */
  var proceduralTextures: js.Array[ProceduralTexture] = js.native
}
object AbstractScene {
  
  @scala.inline
  def apply(proceduralTextures: js.Array[ProceduralTexture]): AbstractScene = {
    val __obj = js.Dynamic.literal(proceduralTextures = proceduralTextures.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractScene]
  }
  
  @scala.inline
  implicit class AbstractSceneOps[Self <: AbstractScene] (val x: Self) extends AnyVal {
    
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
    def setProceduralTexturesVarargs(value: ProceduralTexture*): Self = this.set("proceduralTextures", js.Array(value :_*))
    
    @scala.inline
    def setProceduralTextures(value: js.Array[ProceduralTexture]): Self = this.set("proceduralTextures", value.asInstanceOf[js.Any])
  }
}
