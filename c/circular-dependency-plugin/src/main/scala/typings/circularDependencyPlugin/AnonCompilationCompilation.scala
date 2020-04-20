package typings.circularDependencyPlugin

import typings.webpack.mod.compilation.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompilationCompilation extends js.Object {
  var compilation: Compilation
}

object AnonCompilationCompilation {
  @scala.inline
  def apply(compilation: Compilation): AnonCompilationCompilation = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompilationCompilation]
  }
}

