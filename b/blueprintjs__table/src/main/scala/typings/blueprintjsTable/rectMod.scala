package typings.blueprintjsTable

import typings.react.mod.CSSProperties
import typings.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/rect", "Rect")
  @js.native
  class Rect protected () extends StObject {
    def this(left: Double, top: Double, width: Double, height: Double) = this()
    
    def containsX(clientX: Double): Boolean = js.native
    
    def containsY(clientY: Double): Boolean = js.native
    
    def equals(rect: Rect): Boolean = js.native
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    def sizeStyle(): CSSProperties = js.native
    
    def style(): CSSProperties = js.native
    
    def subtractOrigin(anyRect: AnyRect): Rect = js.native
    
    var top: Double = js.native
    
    def union(anyRect: AnyRect): Rect = js.native
    
    var width: Double = js.native
  }
  /* static members */
  object Rect {
    
    @JSImport("@blueprintjs/table/lib/esm/common/rect", "Rect")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/common/rect", "Rect.ORIGIN")
    @js.native
    def ORIGIN: Rect = js.native
    @scala.inline
    def ORIGIN_=(x: Rect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORIGIN")(x.asInstanceOf[js.Any])
    
    /**
      * Returns the CSS properties representing the absolute positioning of
      * this Rect.
      */
    @JSImport("@blueprintjs/table/lib/esm/common/rect", "Rect.style")
    @js.native
    def style(rect: AnyRect): CSSProperties = js.native
    
    /**
      * Returns a new Rect that subtracts the origin of the second argument
      * from the first.
      */
    @JSImport("@blueprintjs/table/lib/esm/common/rect", "Rect.subtractOrigin")
    @js.native
    def subtractOrigin(anyRect0: AnyRect, anyRect1: AnyRect): Rect = js.native
    
    /**
      * Returns the smallest Rect that entirely contains the supplied rects
      */
    @JSImport("@blueprintjs/table/lib/esm/common/rect", "Rect.union")
    @js.native
    def union(anyRect0: AnyRect, anyRect1: AnyRect): Rect = js.native
    
    /**
      * Given a ClientRect or Rect object, returns a Rect object.
      */
    @JSImport("@blueprintjs/table/lib/esm/common/rect", "Rect.wrap")
    @js.native
    def wrap(rect: AnyRect): Rect = js.native
  }
  
  type AnyRect = Rect | ClientRect
}
