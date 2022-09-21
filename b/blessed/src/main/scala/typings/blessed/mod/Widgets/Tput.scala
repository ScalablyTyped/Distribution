package typings.blessed.mod.Widgets

import typings.blessed.anon.Bools
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blessed", "Widgets.Tput")
@js.native
open class Tput protected ()
  extends StObject
     with IHasOptions[TputsOptions] {
  def this(opts: TputsOptions) = this()
  
  var debug: Boolean = js.native
  
  var error: js.Error = js.native
  
  var extended: Boolean = js.native
  
  /* CompleteClass */
  var options: TputsOptions = js.native
  
  var padding: Boolean = js.native
  
  def parseTerminfo(data: Any, file: String): Bools = js.native
  
  var printf: Boolean = js.native
  
  def readTerminfo(term: String): String = js.native
  
  def setup(): Unit = js.native
  
  def term(is: Any): Boolean = js.native
  
  var termcap: String = js.native
  
  var termcapFile: String = js.native
  
  var terminal: String = js.native
  
  var terminfoFile: String = js.native
  
  var terminfoPrefix: String = js.native
}
