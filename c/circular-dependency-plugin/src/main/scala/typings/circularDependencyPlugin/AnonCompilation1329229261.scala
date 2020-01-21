package typings.circularDependencyPlugin

import typings.webpack.mod.compilation.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompilation1329229261 extends js.Object {
  var compilation: Compilation
}

object AnonCompilation1329229261 {
  @scala.inline
  def apply(compilation: Compilation): AnonCompilation1329229261 = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCompilation1329229261]
  }
}

