package typings.circularDependencyPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilationCompilation extends js.Object {
  var compilation: typings.webpack.mod.compilation.Compilation
}

object CompilationCompilation {
  @scala.inline
  def apply(compilation: typings.webpack.mod.compilation.Compilation): CompilationCompilation = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationCompilation]
  }
}

