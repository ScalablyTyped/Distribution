package typings.cleaveJs.mod

import typings.cleaveJs.optionsMod.CleaveOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cleave.js", JSImport.Namespace)
@js.native
class ^ protected () extends Cleave {
  def this(selector: String, options: CleaveOptions) = this()
  def this(selector: HTMLElement, options: CleaveOptions) = this()
}
