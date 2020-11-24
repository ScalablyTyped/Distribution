package typings.babylonjs.fresnelParametersMod

import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.typesMod.DeepImmutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/fresnelParameters", "FresnelParameters")
@js.native
/**
  * Creates a new FresnelParameters object.
  *
  * @param options provide your own settings to optionally to override defaults
  */
class FresnelParameters () extends js.Object {
  def this(options: IFresnelParametersCreationOptions) = this()
  
  var _isEnabled: js.Any = js.native
  
  /**
    * Define bias applied to computed fresnel term
    */
  var bias: Double = js.native
  
  /**
    * Determines equality between FresnelParameters objects
    * @param otherFresnelParameters defines the second operand
    * @returns true if the power, bias, leftColor, rightColor and isEnabled values are equal to the given ones
    */
  def equals(otherFresnelParameters: DeepImmutable[FresnelParameters]): Boolean = js.native
  
  /**
    * Define if the fresnel effect is enable or not.
    */
  def isEnabled: Boolean = js.native
  def isEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Define the color used on edges (grazing angle)
    */
  var leftColor: Color3 = js.native
  
  /**
    * Defined the power exponent applied to fresnel term
    */
  var power: Double = js.native
  
  /**
    * Define the color used on center
    */
  var rightColor: Color3 = js.native
  
  /**
    * Serializes the current fresnel parameters to a JSON representation.
    * @return the JSON serialization
    */
  def serialize(): IFresnelParametersSerialized = js.native
}
/* static members */
@JSImport("babylonjs/Materials/fresnelParameters", "FresnelParameters")
@js.native
object FresnelParameters extends js.Object {
  
  /**
    * Parse a JSON object and deserialize it to a new Fresnel parameter object.
    * @param parsedFresnelParameters Define the JSON representation
    * @returns the parsed parameters
    */
  def Parse(parsedFresnelParameters: IFresnelParametersSerialized): FresnelParameters = js.native
}
