package typings.circularDependencyPlugin

import typings.webpack.mod.Module
import typings.webpack.mod.compilation.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompilation extends js.Object {
  var compilation: Compilation
  var module: Module
  var paths: js.Array[String]
}

object AnonCompilation {
  @scala.inline
  def apply(compilation: Compilation, module: Module, paths: js.Array[String]): AnonCompilation = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompilation]
  }
}

