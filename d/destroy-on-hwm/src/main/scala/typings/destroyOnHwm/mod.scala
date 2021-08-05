package typings.destroyOnHwm

import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: Writable */](stream: T): T = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def apply[T /* <: Writable */](stream: T, callback: js.ThisFunction1[/* this */ T, /* stream */ T, Unit]): T = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("destroy-on-hwm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
