package typings
package d3DashSelectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object d3DashSelectionMod {
  type BaseType = stdLib.Element | EnterElement | stdLib.Document | stdLib.Window | scala.Null
  type ContainerElement = stdLib.HTMLElement | stdLib.SVGSVGElement | stdLib.SVGGElement
  type NamespaceMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type SelectionFn = js.Function0[Selection[stdLib.HTMLElement, js.Any, scala.Null, js.UndefOr[scala.Nothing]]]
  type ValueFn[T /* <: BaseType */, Datum, Result] = js.ThisFunction3[
    /* this */ T, 
    /* datum */ Datum, 
    /* index */ scala.Double, 
    /* groups */ js.Array[T] | ArrayLike[T], 
    Result
  ]
}
