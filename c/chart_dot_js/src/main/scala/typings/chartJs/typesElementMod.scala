package typings.chartJs

import typings.chartJs.typesGeometricMod.Point
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesElementMod {
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("chart.js/types/element", "Element")
  @js.native
  open class ElementCls[T, O] ()
    extends StObject
       with Element[T, O]
  
  @js.native
  trait Element[T, O] extends StObject {
    
    val active: Boolean = js.native
    
    def getProps[P /* <: js.Array[/* keyof T */ String] */](props: P): Pick[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any
      ] = js.native
    def getProps[P /* <: js.Array[/* keyof T */ String] */](props: P, `final`: Boolean): Pick[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: P[number] */ js.Any
      ] = js.native
    
    def hasValue(): Boolean = js.native
    
    val options: O = js.native
    
    def tooltipPosition(): Point = js.native
    def tooltipPosition(useFinalPosition: Boolean): Point = js.native
    
    val x: Double = js.native
    
    val y: Double = js.native
  }
}
