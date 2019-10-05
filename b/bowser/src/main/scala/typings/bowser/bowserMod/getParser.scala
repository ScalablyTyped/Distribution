package typings.bowser.bowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bowser", "getParser")
@js.native
object getParser extends js.Object {
  /**
    * Creates a Parser instance
    * @param {string} UA - User agent string
    * @param {boolean} skipParsing
    */
  def apply(UA: String): typings.bowser.bowserMod.Parser.Parser = js.native
  def apply(UA: String, skipParsing: Boolean): typings.bowser.bowserMod.Parser.Parser = js.native
}

