package typings.debounce

import typings.debounce.anon.Clear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[A /* <: js.Function */](f: A): Clear & A = ^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any]).asInstanceOf[Clear & A]
  @scala.inline
  def apply[A /* <: js.Function */](f: A, interval: Double): Clear & A = (^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Clear & A]
  @scala.inline
  def apply[A /* <: js.Function */](f: A, interval: Double, immediate: Boolean): Clear & A = (^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[Clear & A]
  @scala.inline
  def apply[A /* <: js.Function */](f: A, interval: Unit, immediate: Boolean): Clear & A = (^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[Clear & A]
  
  @JSImport("debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("debounce", "debounce")
  @js.native
  val debounce: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof _debounce */ js.Any = js.native
}
