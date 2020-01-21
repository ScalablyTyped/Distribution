package typings.babelPluginSyntaxJsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonManipulateOptions extends js.Object {
  def manipulateOptions(opts: js.Any, parserOpts: AnonPlugins): Unit
}

object AnonManipulateOptions {
  @scala.inline
  def apply(manipulateOptions: (js.Any, AnonPlugins) => Unit): AnonManipulateOptions = {
    val __obj = js.Dynamic.literal(manipulateOptions = js.Any.fromFunction2(manipulateOptions))
  
    __obj.asInstanceOf[AnonManipulateOptions]
  }
}

