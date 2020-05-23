package typings.babylonjs.proceduralsIndexMod.babylonjsAbstractSceneAugmentingMod

import typings.babylonjs.proceduralTextureMod.ProceduralTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractScene extends js.Object {
  /**
    * The list of procedural textures added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_use_procedural_textures
    */
  var proceduralTextures: js.Array[ProceduralTexture]
}

object AbstractScene {
  @scala.inline
  def apply(proceduralTextures: js.Array[ProceduralTexture]): AbstractScene = {
    val __obj = js.Dynamic.literal(proceduralTextures = proceduralTextures.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractScene]
  }
}

