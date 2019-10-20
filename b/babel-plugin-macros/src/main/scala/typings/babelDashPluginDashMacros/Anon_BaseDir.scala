package typings.babelDashPluginDashMacros

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseDir extends js.Object {
  def require(path: String): js.Any
  def resolvePath(src: String, baseDir: String): js.Any
}

object Anon_BaseDir {
  @scala.inline
  def apply(require: String => js.Any, resolvePath: (String, String) => js.Any): Anon_BaseDir = {
    val __obj = js.Dynamic.literal(require = js.Any.fromFunction1(require), resolvePath = js.Any.fromFunction2(resolvePath))
  
    __obj.asInstanceOf[Anon_BaseDir]
  }
}

