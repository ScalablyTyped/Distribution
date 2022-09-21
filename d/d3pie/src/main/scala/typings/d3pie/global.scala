package typings.d3pie

import org.scalablytyped.runtime.Shortcut
import typings.d3pie.d3pie.ID3PieChart
import typings.d3pie.d3pie.ID3PieClass
import typings.d3pie.d3pie.ID3PieOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object d3pie extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("d3pie")
    @js.native
    open class ^ protected ()
      extends StObject
         with ID3PieChart {
      def this(id: String, options: ID3PieOptions) = this()
      def this(id: HTMLElement, options: ID3PieOptions) = this()
      
      /* CompleteClass */
      override def closeSegment(index: Unit): Unit = js.native
      
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /* CompleteClass */
      override def getOpenSegment(): Any = js.native
      
      /* CompleteClass */
      override def openSegment(index: Double): Unit = js.native
      
      /* CompleteClass */
      override def redraw(): Unit = js.native
      
      /* CompleteClass */
      override def updateProp(propKey: String, value: Any): Unit = js.native
    }
    
    @JSGlobal("d3pie")
    @js.native
    val ^ : ID3PieClass = js.native
    
    type _To = ID3PieClass
    
    /* This means you don't have to write `^`, but can instead just say `d3pie.foo` */
    override def _to: ID3PieClass = ^
  }
}
