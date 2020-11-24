package typings.config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("config/defer", JSImport.Namespace)
@js.native
object deferMod extends js.Object {
  
  def deferConfig[T, R](func: DeferFunction[T, R]): R = js.native
  
  type DeferFunction[T, R] = js.ThisFunction1[/* this */ js.Any, /* origValue */ T, R]
}
