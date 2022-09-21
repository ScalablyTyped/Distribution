package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.DOMPointInit
import typings.typescriptNn5FuAjk.DOMQuadInit
import typings.typescriptNn5FuAjk.DOMRectInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DOMQuad")
@js.native
open class DOMQuad ()
  extends StObject
     with typings.typescriptNn5FuAjk.DOMQuad {
  def this(p1: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit) = this()
  def this(p1: Unit, p2: Unit, p3: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit, p3: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: Unit, p3: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit) = this()
  def this(p1: Unit, p2: Unit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: Unit, p2: Unit, p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: Unit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: Unit, p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
  
  /* CompleteClass */
  override def getBounds(): typings.typescriptNn5FuAjk.DOMRect = js.native
  
  /* CompleteClass */
  override val p1: typings.typescriptNn5FuAjk.DOMPoint = js.native
  
  /* CompleteClass */
  override val p2: typings.typescriptNn5FuAjk.DOMPoint = js.native
  
  /* CompleteClass */
  override val p3: typings.typescriptNn5FuAjk.DOMPoint = js.native
  
  /* CompleteClass */
  override val p4: typings.typescriptNn5FuAjk.DOMPoint = js.native
  
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
object DOMQuad {
  
  @JSGlobal("DOMQuad")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromQuad(): typings.typescriptNn5FuAjk.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQuad")().asInstanceOf[typings.typescriptNn5FuAjk.DOMQuad]
  inline def fromQuad(other: DOMQuadInit): typings.typescriptNn5FuAjk.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQuad")(other.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.DOMQuad]
  
  inline def fromRect(): typings.typescriptNn5FuAjk.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")().asInstanceOf[typings.typescriptNn5FuAjk.DOMQuad]
  inline def fromRect(other: DOMRectInit): typings.typescriptNn5FuAjk.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")(other.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptNn5FuAjk.DOMQuad]
}
