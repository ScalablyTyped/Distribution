package typings.config

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deferMod {
  
  @JSImport("config/defer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deferConfig[T, R](func: DeferFunction[T, R]): R = ^.asInstanceOf[js.Dynamic].applyDynamic("deferConfig")(func.asInstanceOf[js.Any]).asInstanceOf[R]
  
  type DeferFunction[T, R] = js.ThisFunction1[/* this */ js.Any, /* origValue */ T, R]
}
