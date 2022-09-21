package typings.biancoDomToArray

import typings.std.Document
import typings.std.Element
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bianco.dom-to-array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: DOMElement */, R /* <: js.Array[DOMElement] */](els: T): js.Array[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[R]]
  inline def default[T /* <: DOMElement */, R /* <: js.Array[DOMElement] */](els: js.Array[T]): js.Array[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[R]]
  
  type DOMElement = Window | Document | Element
}
