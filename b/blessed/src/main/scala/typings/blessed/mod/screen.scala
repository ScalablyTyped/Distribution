package typings.blessed.mod

import typings.blessed.mod.Widgets.IScreenOptions
import typings.blessed.mod.Widgets.Screen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blessed", "screen")
@js.native
object screen extends js.Object {
  
  def apply(): Screen = js.native
  def apply(options: IScreenOptions): Screen = js.native
}
