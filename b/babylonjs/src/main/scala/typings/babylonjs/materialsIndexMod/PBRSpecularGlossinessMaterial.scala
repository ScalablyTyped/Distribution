package typings.babylonjs.materialsIndexMod

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/index", "PBRSpecularGlossinessMaterial")
@js.native
class PBRSpecularGlossinessMaterial protected ()
  extends typings.babylonjs.pbrIndexMod.PBRSpecularGlossinessMaterial {
  /**
    * Instantiates a new PBRSpecularGlossinessMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: String, scene: Scene) = this()
}

/* static members */
@JSImport("babylonjs/Materials/index", "PBRSpecularGlossinessMaterial")
@js.native
object PBRSpecularGlossinessMaterial extends js.Object {
  /**
    * Parses a JSON object correponding to the serialize function.
    */
  def Parse(source: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.pbrSpecularGlossinessMaterialMod.PBRSpecularGlossinessMaterial = js.native
}

