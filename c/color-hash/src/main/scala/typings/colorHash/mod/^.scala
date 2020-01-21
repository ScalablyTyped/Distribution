package typings.colorHash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-hash", JSImport.Namespace)
@js.native
class ^ () extends ColorHash {
  def this(options: ColorHashOptions) = this()
  /**
    * Returns the hash in hex.
    *
    * @param input string to hash
    * @returns hex with #
    */
  /* CompleteClass */
  override def hex(input: String): String = js.native
  /**
    * Returns the hash in [h, s, l].
    * Note that H ∈ [0, 360); S ∈ [0, 1]; L ∈ [0, 1];
    *
    * @param input string to hash
    * @returns [h, s, l]
    */
  /* CompleteClass */
  override def hsl(input: String): ColorValueArray = js.native
  /**
    * Returns the hash in [r, g, b].
    * Note that R, G, B ∈ [0, 255]
    *
    * @param input string to hash
    * @returns [r, g, b]
    */
  /* CompleteClass */
  override def rgb(input: String): ColorValueArray = js.native
}

