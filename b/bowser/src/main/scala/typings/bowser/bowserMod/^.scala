package typings.bowser.bowserMod

import typings.bowser.bowserMod.ParserNs.ParsedResult
import typings.bowser.bowserMod.ParserNs.Parser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bowser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Creates a Parser instance
    * @param {string} UA - User agent string
    * @param {boolean} skipParsing
    */
  def getParser(UA: String): Parser = js.native
  def getParser(UA: String, skipParsing: Boolean): Parser = js.native
  /**
    * Creates a Parser instance and runs Parser.getResult immediately
    * @param UA - User agent string
    * @returns {Parser.ParsedResult}
    */
  def parse(UA: String): ParsedResult = js.native
}

