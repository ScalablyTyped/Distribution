package typings.deepExtend

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(target: js.Object, sources: js.Object*): js.Object = ^.asInstanceOf[js.Dynamic].apply(List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Object]
  inline def apply[T /* <: js.Object */, U /* <: js.Object */](target: T, source: U): T & U = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & U]
  inline def apply[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */](target: T, source1: U, source2: V): T & U & V = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any])).asInstanceOf[T & U & V]
  inline def apply[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */, W /* <: js.Object */](target: T, source1: U, source2: V, source3: W): T & U & V & W = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any])).asInstanceOf[T & U & V & W]
  
  @JSImport("deep-extend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
