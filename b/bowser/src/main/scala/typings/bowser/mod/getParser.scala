package typings.bowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bowser", "getParser")
@js.native
object getParser extends js.Object {
  
  /**
    * Creates a Parser instance
    * @param {string} UA - User agent string
    * @param {boolean} skipParsing
    */
  def apply(UA: String): typings.bowser.mod.Parser.Parser = js.native
  def apply(UA: String, skipParsing: Boolean): typings.bowser.mod.Parser.Parser = js.native
}
