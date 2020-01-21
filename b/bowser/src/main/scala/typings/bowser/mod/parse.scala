package typings.bowser.mod

import typings.bowser.mod.Parser.ParsedResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bowser", "parse")
@js.native
object parse extends js.Object {
  /**
    * Creates a Parser instance and runs Parser.getResult immediately
    * @param UA - User agent string
    * @returns {Parser.ParsedResult}
    */
  def apply(UA: String): ParsedResult = js.native
}

