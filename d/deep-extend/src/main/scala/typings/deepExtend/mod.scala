package typings.deepExtend

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(target: js.Any, sources: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def apply[T, U](target: T, source: U): T & U = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & U]
  @scala.inline
  def apply[T, U, V](target: T, source1: U, source2: V): T & U & V = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any])).asInstanceOf[T & U & V]
  @scala.inline
  def apply[T, U, V, W](target: T, source1: U, source2: V, source3: W): T & U & V & W = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any])).asInstanceOf[T & U & V & W]
  
  @JSImport("deep-extend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
