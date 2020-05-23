package typings.circularDependencyPlugin.anon

import typings.webpack.mod.Module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compilation extends js.Object {
  var compilation: typings.webpack.mod.compilation.Compilation
  var module: Module
  var paths: js.Array[String]
}

object Compilation {
  @scala.inline
  def apply(compilation: typings.webpack.mod.compilation.Compilation, module: Module, paths: js.Array[String]): Compilation = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compilation]
  }
}

