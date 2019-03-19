package typings
package circularDashDependencyDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compilation extends js.Object {
  var compilation: webpackLib.webpackMod.compilationNs.Compilation
  var module: webpackLib.webpackMod.webpackNs.Module
  var paths: js.Array[java.lang.String]
}

object Anon_Compilation {
  @scala.inline
  def apply(
    compilation: webpackLib.webpackMod.compilationNs.Compilation,
    module: webpackLib.webpackMod.webpackNs.Module,
    paths: js.Array[java.lang.String]
  ): Anon_Compilation = {
    val __obj = js.Dynamic.literal(compilation = compilation, module = module, paths = paths)
  
    __obj.asInstanceOf[Anon_Compilation]
  }
}

