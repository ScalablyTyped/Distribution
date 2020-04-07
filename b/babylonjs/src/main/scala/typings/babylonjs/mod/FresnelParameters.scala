package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "FresnelParameters")
@js.native
class FresnelParameters ()
  extends typings.babylonjs.legacyMod.FresnelParameters

/* static members */
@JSImport("babylonjs", "FresnelParameters")
@js.native
object FresnelParameters extends js.Object {
  /**
    * Parse a JSON object and deserialize it to a new Fresnel parameter object.
    * @param parsedFresnelParameters Define the JSON representation
    * @returns the parsed parameters
    */
  def Parse(parsedFresnelParameters: js.Any): typings.babylonjs.fresnelParametersMod.FresnelParameters = js.native
}

