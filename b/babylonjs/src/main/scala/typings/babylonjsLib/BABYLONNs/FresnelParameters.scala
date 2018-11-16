package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This represents all the required information to add a fresnel effect on a material:
     * @see http://doc.babylonjs.com/how_to/how_to_use_fresnelparameters
     */
@JSGlobal("BABYLON.FresnelParameters")
@js.native
class FresnelParameters () extends js.Object {
  var _isEnabled: js.Any = js.native
  /**
           * Define bias applied to computed fresnel term
           */
  var bias: scala.Double = js.native
  /**
           * Define if the fresnel effect is enable or not.
           */
  var isEnabled: scala.Boolean = js.native
  /**
           * Define the color used on edges (grazing angle)
           */
  var leftColor: Color3 = js.native
  /**
           * Defined the power exponent applied to fresnel term
           */
  var power: scala.Double = js.native
  /**
           * Define the color used on center
           */
  var rightColor: Color3 = js.native
  /**
           * Serializes the current fresnel parameters to a JSON representation.
           * @return the JSON serialization
           */
  def serialize(): js.Any = js.native
}

/**
     * This represents all the required information to add a fresnel effect on a material:
     * @see http://doc.babylonjs.com/how_to/how_to_use_fresnelparameters
     */
@JSGlobal("BABYLON.FresnelParameters")
@js.native
object FresnelParameters extends js.Object {
  /**
           * Parse a JSON object and deserialize it to a new Fresnel parameter object.
           * @param parsedFresnelParameters Define the JSON representation
           * @returns the parsed parameters
           */
  def Parse(parsedFresnelParameters: js.Any): babylonjsLib.BABYLONNs.FresnelParameters = js.native
}

