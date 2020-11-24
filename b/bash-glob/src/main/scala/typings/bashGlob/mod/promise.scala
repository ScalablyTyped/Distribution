package typings.bashGlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bash-glob", "promise")
@js.native
object promise extends js.Object {
  
  def apply(patterns: Patterns): js.Promise[js.Array[String]] = js.native
  def apply(patterns: Patterns, options: Options): js.Promise[js.Array[String]] = js.native
}
