package typings.colorHash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorHash extends js.Object {
  /**
    * Returns the hash in hex.
    *
    * @param input string to hash
    * @returns hex with #
    */
  def hex(input: String): String = js.native
  /**
    * Returns the hash in [h, s, l].
    * Note that H ∈ [0, 360); S ∈ [0, 1]; L ∈ [0, 1];
    *
    * @param input string to hash
    * @returns [h, s, l]
    */
  def hsl(input: String): ColorValueArray = js.native
  /**
    * Returns the hash in [r, g, b].
    * Note that R, G, B ∈ [0, 255]
    *
    * @param input string to hash
    * @returns [r, g, b]
    */
  def rgb(input: String): ColorValueArray = js.native
}

object ColorHash {
  @scala.inline
  def apply(hex: String => String, hsl: String => ColorValueArray, rgb: String => ColorValueArray): ColorHash = {
    val __obj = js.Dynamic.literal(hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), rgb = js.Any.fromFunction1(rgb))
    __obj.asInstanceOf[ColorHash]
  }
  @scala.inline
  implicit class ColorHashOps[Self <: ColorHash] (val x: Self) extends AnyVal {
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
    def setHex(value: String => String): Self = this.set("hex", js.Any.fromFunction1(value))
    @scala.inline
    def setHsl(value: String => ColorValueArray): Self = this.set("hsl", js.Any.fromFunction1(value))
    @scala.inline
    def setRgb(value: String => ColorValueArray): Self = this.set("rgb", js.Any.fromFunction1(value))
  }
  
}

