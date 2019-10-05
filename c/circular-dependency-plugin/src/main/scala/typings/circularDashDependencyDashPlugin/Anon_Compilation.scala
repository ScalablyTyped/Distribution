package typings.circularDashDependencyDashPlugin

import typings.webpack.webpackMod.Module
import typings.webpack.webpackMod.compilation.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compilation extends js.Object {
  var compilation: Compilation
  var module: Module
  var paths: js.Array[String]
}

object Anon_Compilation {
  @scala.inline
  def apply(compilation: Compilation, module: Module, paths: js.Array[String]): Anon_Compilation = {
    val __obj = js.Dynamic.literal(compilation = compilation, module = module, paths = paths)
  
    __obj.asInstanceOf[Anon_Compilation]
  }
}

