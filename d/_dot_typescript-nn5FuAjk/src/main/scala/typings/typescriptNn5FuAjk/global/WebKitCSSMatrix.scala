package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.DOMMatrixInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("WebKitCSSMatrix")
@js.native
open class WebKitCSSMatrix ()
  extends StObject
     with typings.typescriptNn5FuAjk.DOMMatrix {
  def this(init: java.lang.String) = this()
  def this(init: typings.typescriptNn5FuAjk.Array[Double]) = this()
}
/* was `typeof DOMMatrix` */
object WebKitCSSMatrix {
  
  @JSGlobal("WebKitCSSMatrix")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromFloat32Array(array32: typings.typescriptNn5FuAjk.Float32Array): typings.typescriptNn5FuAjk.DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFloat32Array")(array32.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.DOMMatrix]
  
  inline def fromFloat64Array(array64: typings.typescriptNn5FuAjk.Float64Array): typings.typescriptNn5FuAjk.DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFloat64Array")(array64.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.DOMMatrix]
  
  inline def fromMatrix(): typings.typescriptNn5FuAjk.DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMatrix")().asInstanceOf[typings.typescriptNn5FuAjk.DOMMatrix]
  inline def fromMatrix(other: DOMMatrixInit): typings.typescriptNn5FuAjk.DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMatrix")(other.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.DOMMatrix]
}
