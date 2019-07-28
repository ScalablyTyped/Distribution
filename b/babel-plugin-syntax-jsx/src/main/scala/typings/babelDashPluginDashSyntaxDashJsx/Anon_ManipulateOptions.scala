package typings.babelDashPluginDashSyntaxDashJsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ManipulateOptions extends js.Object {
  def manipulateOptions(opts: js.Any, parserOpts: Anon_Plugins): Unit
}

object Anon_ManipulateOptions {
  @scala.inline
  def apply(manipulateOptions: (js.Any, Anon_Plugins) => Unit): Anon_ManipulateOptions = {
    val __obj = js.Dynamic.literal(manipulateOptions = js.Any.fromFunction2(manipulateOptions))
  
    __obj.asInstanceOf[Anon_ManipulateOptions]
  }
}

