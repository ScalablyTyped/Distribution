package typings.csvParse.es5Mod

import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("csv-parse/lib/es5", "Parser")
@js.native
class Parser protected () extends Transform {
  def this(options: Options) = this()
  
  def __push(line: js.Any): js.Any = js.native
  
  def __write(chars: js.Any, end: js.Any, callback: js.Any): js.Any = js.native
  
  val info: Info = js.native
  
  val options: Options = js.native
}
