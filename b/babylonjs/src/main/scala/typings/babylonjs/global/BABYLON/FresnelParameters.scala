package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IFresnelParametersCreationOptions
import typings.babylonjs.BABYLON.IFresnelParametersSerialized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.FresnelParameters")
@js.native
/**
  * Creates a new FresnelParameters object.
  *
  * @param options provide your own settings to optionally to override defaults
  */
class FresnelParameters ()
  extends typings.babylonjs.BABYLON.FresnelParameters {
  def this(options: IFresnelParametersCreationOptions) = this()
}
/* static members */
object FresnelParameters {
  
  /**
    * Parse a JSON object and deserialize it to a new Fresnel parameter object.
    * @param parsedFresnelParameters Define the JSON representation
    * @returns the parsed parameters
    */
  @JSGlobal("BABYLON.FresnelParameters.Parse")
  @js.native
  def Parse(parsedFresnelParameters: IFresnelParametersSerialized): typings.babylonjs.BABYLON.FresnelParameters = js.native
}
