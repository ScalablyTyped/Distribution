package typings.babelPluginReactHtmlAttrs.mod

import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// React.Children
// ----------------------------------------------------------------------
@js.native
trait ReactChildren extends StObject {
  
  def count(children: js.Any): Double = js.native
  
  def forEach[C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = js.native
  def forEach[C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = js.native
  
  def map[T, C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, T]): (js.Array[Exclude[T, js.UndefOr[Boolean | Null]]]) | C = js.native
  def map[T, C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, T]): (js.Array[Exclude[T, js.UndefOr[Boolean | Null]]]) | C = js.native
  
  def only[C](children: C): C = js.native
  
  def toArray(children: js.Array[ReactNode]): js.Array[Exclude[ReactNode, js.UndefOr[Boolean | Null]]] = js.native
  def toArray(children: ReactNode): js.Array[Exclude[ReactNode, js.UndefOr[Boolean | Null]]] = js.native
}
