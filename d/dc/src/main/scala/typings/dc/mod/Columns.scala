package typings.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Columns extends js.Object {
  
  def format(datum: js.Any): String = js.native
  def format(datum: js.Any, index: Double): String = js.native
  @JSName("format")
  var format_Original: Accessor[_, String] = js.native
  
  var label: String = js.native
}
