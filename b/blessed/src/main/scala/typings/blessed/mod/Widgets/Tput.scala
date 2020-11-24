package typings.blessed.mod.Widgets

import typings.blessed.anon.Bools
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blessed", "Widgets.Tput")
@js.native
class Tput protected () extends IHasOptions[TputsOptions] {
  def this(opts: TputsOptions) = this()
  
  var debug: Boolean = js.native
  
  var error: Error = js.native
  
  var extended: Boolean = js.native
  
  var padding: Boolean = js.native
  
  def parseTerminfo(data: js.Any, file: String): Bools = js.native
  
  var printf: Boolean = js.native
  
  def readTerminfo(term: String): String = js.native
  
  def setup(): Unit = js.native
  
  def term(is: js.Any): Boolean = js.native
  
  var termcap: String = js.native
  
  var termcapFile: String = js.native
  
  var terminal: String = js.native
  
  var terminfoFile: String = js.native
  
  var terminfoPrefix: String = js.native
}
