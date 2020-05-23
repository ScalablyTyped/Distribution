package typings.babelPluginSyntaxJsx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManipulateOptions extends js.Object {
  def manipulateOptions(opts: js.Any, parserOpts: Plugins): Unit
}

object ManipulateOptions {
  @scala.inline
  def apply(manipulateOptions: (js.Any, Plugins) => Unit): ManipulateOptions = {
    val __obj = js.Dynamic.literal(manipulateOptions = js.Any.fromFunction2(manipulateOptions))
    __obj.asInstanceOf[ManipulateOptions]
  }
}

