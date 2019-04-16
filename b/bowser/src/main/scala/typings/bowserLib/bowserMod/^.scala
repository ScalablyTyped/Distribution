package typings
package bowserLib.bowserMod

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
  def getParser(UA: java.lang.String): bowserLib.bowserMod.ParserNs.Parser = js.native
  def getParser(UA: java.lang.String, skipParsing: scala.Boolean): bowserLib.bowserMod.ParserNs.Parser = js.native
  /**
    * Creates a Parser instance and runs Parser.getResult immediately
    * @param UA - User agent string
    * @returns {Parser.ParsedResult}
    */
  def parse(UA: java.lang.String): bowserLib.bowserMod.ParserNs.ParsedResult = js.native
}

