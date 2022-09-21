package typings.blueprintjsTable.mod

import typings.blueprintjsTable.rectMod.AnyRect
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table", "Rect")
@js.native
open class Rect protected ()
  extends typings.blueprintjsTable.commonMod.Rect {
  def this(left: Double, top: Double, width: Double, height: Double) = this()
}
/* static members */
object Rect {
  
  @JSImport("@blueprintjs/table", "Rect")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table", "Rect.ORIGIN")
  @js.native
  def ORIGIN: typings.blueprintjsTable.rectMod.Rect = js.native
  inline def ORIGIN_=(x: typings.blueprintjsTable.rectMod.Rect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORIGIN")(x.asInstanceOf[js.Any])
  
  /**
    * Returns the CSS properties representing the absolute positioning of
    * this Rect.
    */
  inline def style(rect: AnyRect): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("style")(rect.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  
  /**
    * Returns a new Rect that subtracts the origin of the second argument
    * from the first.
    */
  inline def subtractOrigin(anyRect0: AnyRect, anyRect1: AnyRect): typings.blueprintjsTable.rectMod.Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("subtractOrigin")(anyRect0.asInstanceOf[js.Any], anyRect1.asInstanceOf[js.Any])).asInstanceOf[typings.blueprintjsTable.rectMod.Rect]
  
  /**
    * Returns the smallest Rect that entirely contains the supplied rects
    */
  inline def union(anyRect0: AnyRect, anyRect1: AnyRect): typings.blueprintjsTable.rectMod.Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(anyRect0.asInstanceOf[js.Any], anyRect1.asInstanceOf[js.Any])).asInstanceOf[typings.blueprintjsTable.rectMod.Rect]
  
  /**
    * Given a ClientRect or Rect object, returns a Rect object.
    */
  inline def wrap(rect: AnyRect): typings.blueprintjsTable.rectMod.Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(rect.asInstanceOf[js.Any]).asInstanceOf[typings.blueprintjsTable.rectMod.Rect]
}
