package typings.blessed.mod

import typings.blessed.mod.Widgets.PromptElement
import typings.blessed.mod.Widgets.PromptOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blessed", "prompt")
@js.native
object prompt extends js.Object {
  
  def apply(): PromptElement = js.native
  def apply(options: PromptOptions): PromptElement = js.native
}
