package typings.babylonjs.BABYLON

import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CubeMapInfo extends js.Object {
  /**
    * The pixel array for the back face.
    * This is stored in format, left to right, up to down format.
    */
  var back: Nullable[ArrayBufferView]
  /**
    * The pixel array for the down face.
    * This is stored in format, left to right, up to down format.
    */
  var down: Nullable[ArrayBufferView]
  /**
    * The format of the texture.
    *
    * RGBA, RGB.
    */
  var format: Double
  /**
    * The pixel array for the front face.
    * This is stored in format, left to right, up to down format.
    */
  var front: Nullable[ArrayBufferView]
  /**
    * Specifies whether the texture is in gamma space.
    */
  var gammaSpace: Boolean
  /**
    * The pixel array for the left face.
    * This is stored in format, left to right, up to down format.
    */
  var left: Nullable[ArrayBufferView]
  /**
    * The pixel array for the right face.
    * This is stored in format, left to right, up to down format.
    */
  var right: Nullable[ArrayBufferView]
  /**
    * The size of the cubemap stored.
    *
    * Each faces will be size * size pixels.
    */
  var size: Double
  /**
    * The type of the texture data.
    *
    * UNSIGNED_INT, FLOAT.
    */
  var `type`: Double
  /**
    * The pixel array for the up face.
    * This is stored in format, left to right, up to down format.
    */
  var up: Nullable[ArrayBufferView]
}

object CubeMapInfo {
  @scala.inline
  def apply(
    format: Double,
    gammaSpace: Boolean,
    size: Double,
    `type`: Double,
    back: Nullable[ArrayBufferView] = null,
    down: Nullable[ArrayBufferView] = null,
    front: Nullable[ArrayBufferView] = null,
    left: Nullable[ArrayBufferView] = null,
    right: Nullable[ArrayBufferView] = null,
    up: Nullable[ArrayBufferView] = null
  ): CubeMapInfo = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], gammaSpace = gammaSpace.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (back != null) __obj.updateDynamic("back")(back.asInstanceOf[js.Any])
    if (down != null) __obj.updateDynamic("down")(down.asInstanceOf[js.Any])
    if (front != null) __obj.updateDynamic("front")(front.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (up != null) __obj.updateDynamic("up")(up.asInstanceOf[js.Any])
    __obj.asInstanceOf[CubeMapInfo]
  }
}

