package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CubeMap information grouping all the data for each faces as well as the cubemap size.
  */
trait CubeMapInfo extends js.Object {
  /**
    * The pixel array for the back face.
    * This is stored in format, left to right, up to down format.
    */
  var back: Nullable[stdLib.ArrayBufferView]
  /**
    * The pixel array for the down face.
    * This is stored in format, left to right, up to down format.
    */
  var down: Nullable[stdLib.ArrayBufferView]
  /**
    * The format of the texture.
    *
    * RGBA, RGB.
    */
  var format: scala.Double
  /**
    * The pixel array for the front face.
    * This is stored in format, left to right, up to down format.
    */
  var front: Nullable[stdLib.ArrayBufferView]
  /**
    * Specifies whether the texture is in gamma space.
    */
  var gammaSpace: scala.Boolean
  /**
    * The pixel array for the left face.
    * This is stored in format, left to right, up to down format.
    */
  var left: Nullable[stdLib.ArrayBufferView]
  /**
    * The pixel array for the right face.
    * This is stored in format, left to right, up to down format.
    */
  var right: Nullable[stdLib.ArrayBufferView]
  /**
    * The size of the cubemap stored.
    *
    * Each faces will be size * size pixels.
    */
  var size: scala.Double
  /**
    * The type of the texture data.
    *
    * UNSIGNED_INT, FLOAT.
    */
  var `type`: scala.Double
  /**
    * The pixel array for the up face.
    * This is stored in format, left to right, up to down format.
    */
  var up: Nullable[stdLib.ArrayBufferView]
}

object CubeMapInfo {
  @scala.inline
  def apply(
    back: Nullable[stdLib.ArrayBufferView],
    down: Nullable[stdLib.ArrayBufferView],
    format: scala.Double,
    front: Nullable[stdLib.ArrayBufferView],
    gammaSpace: scala.Boolean,
    left: Nullable[stdLib.ArrayBufferView],
    right: Nullable[stdLib.ArrayBufferView],
    size: scala.Double,
    `type`: scala.Double,
    up: Nullable[stdLib.ArrayBufferView]
  ): CubeMapInfo = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("back")(back.asInstanceOf[js.Any])
    __obj.updateDynamic("down")(down.asInstanceOf[js.Any])
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("front")(front.asInstanceOf[js.Any])
    __obj.updateDynamic("gammaSpace")(gammaSpace)
    __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("up")(up.asInstanceOf[js.Any])
    __obj.asInstanceOf[CubeMapInfo]
  }
}

