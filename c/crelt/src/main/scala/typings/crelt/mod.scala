package typings.crelt

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("crelt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(elt: String, attrs: StringDictionary[Any], children: Child*): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("default")((scala.List(elt.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[HTMLElement]
  inline def default(elt: String, children: Child*): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(elt.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HTMLElement]
  inline def default(elt: HTMLElement, attrs: StringDictionary[Any], children: Child*): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("default")((scala.List(elt.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[HTMLElement]
  inline def default(elt: HTMLElement, children: Child*): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(elt.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HTMLElement]
  
  type Child = js.UndefOr[String | Node | Null | js.Array[Any]]
}
