package typings.chartist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsExtendMod {
  
  @JSImport("chartist/dist/utils/extend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extend[T](target: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def extend[T, A](target: T, a: A): T & A = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[T & A]
  inline def extend[T, A, B](target: T, a: A, b: B): T & A & B = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T & A & B]
}
