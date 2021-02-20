package typings.config

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deferMod {
  
  @JSImport("config/defer", "deferConfig")
  @js.native
  def deferConfig[T, R](func: DeferFunction[T, R]): R = js.native
  
  type DeferFunction[T, R] = js.ThisFunction1[/* this */ js.Any, /* origValue */ T, R]
}
