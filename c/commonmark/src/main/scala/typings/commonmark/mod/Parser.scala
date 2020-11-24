package typings.commonmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("commonmark", "Parser")
@js.native
/**
  * Constructs a new Parser
  */
class Parser () extends js.Object {
  def this(options: ParserOptions) = this()
  
  def parse(input: String): Node = js.native
}
