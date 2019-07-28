package typings.d3DashSelection

import org.scalablytyped.runtime.StringDictionary
import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import typings.std.SVGGElement
import typings.std.SVGSVGElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object d3DashSelectionMod {
  type BaseType = Element | EnterElement | Document | Window | Null
  type ContainerElement = HTMLElement | SVGSVGElement | SVGGElement
  type NamespaceMap = StringDictionary[String]
  type SelectionFn = js.Function0[Selection[HTMLElement, js.Any, Null, js.UndefOr[scala.Nothing]]]
  type ValueFn[T /* <: BaseType */, Datum, Result] = js.ThisFunction3[
    /* this */ T, 
    /* datum */ Datum, 
    /* index */ Double, 
    /* groups */ js.Array[T] | ArrayLike[T], 
    Result
  ]
}
