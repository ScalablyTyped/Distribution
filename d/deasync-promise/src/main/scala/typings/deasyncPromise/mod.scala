package typings.deasyncPromise

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](promise: PromiseLike[T]): T = ^.asInstanceOf[js.Dynamic].apply(promise.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("deasync-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
