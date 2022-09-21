package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.DOMPointInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGPoint")
@js.native
open class SVGPoint ()
  extends StObject
     with typings.typescriptNn5FuAjk.DOMPoint {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Unit, z: Double) = this()
  def this(x: Unit, y: Double, z: Double) = this()
  def this(x: Unit, y: Unit, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: Unit, w: Double) = this()
  def this(x: Double, y: Unit, z: Double, w: Double) = this()
  def this(x: Double, y: Unit, z: Unit, w: Double) = this()
  def this(x: Unit, y: Double, z: Double, w: Double) = this()
  def this(x: Unit, y: Double, z: Unit, w: Double) = this()
  def this(x: Unit, y: Unit, z: Double, w: Double) = this()
  def this(x: Unit, y: Unit, z: Unit, w: Double) = this()
}
/* was `typeof DOMPoint` */
object SVGPoint {
  
  @JSGlobal("SVGPoint")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromPoint(): typings.typescriptNn5FuAjk.DOMPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")().asInstanceOf[typings.typescriptNn5FuAjk.DOMPoint]
  inline def fromPoint(other: DOMPointInit): typings.typescriptNn5FuAjk.DOMPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")(other.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.DOMPoint]
}
