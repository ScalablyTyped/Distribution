package typings.babylonjs.mod

import typings.babylonjs.fresnelParametersMod.IFresnelParametersCreationOptions
import typings.babylonjs.fresnelParametersMod.IFresnelParametersSerialized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "FresnelParameters")
@js.native
/**
  * Creates a new FresnelParameters object.
  *
  * @param options provide your own settings to optionally to override defaults
  */
class FresnelParameters ()
  extends typings.babylonjs.legacyMod.FresnelParameters {
  def this(options: IFresnelParametersCreationOptions) = this()
}
/* static members */
object FresnelParameters {
  
  /**
    * Parse a JSON object and deserialize it to a new Fresnel parameter object.
    * @param parsedFresnelParameters Define the JSON representation
    * @returns the parsed parameters
    */
  @JSImport("babylonjs", "FresnelParameters.Parse")
  @js.native
  def Parse(parsedFresnelParameters: IFresnelParametersSerialized): typings.babylonjs.fresnelParametersMod.FresnelParameters = js.native
}
