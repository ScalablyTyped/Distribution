package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blessed", "Widgets.LayoutElement")
@js.native
open class LayoutElement () extends BlessedElement {
  def this(options: LayoutOptions) = this()
  
  /**
    * Get the last rendered and visible child element based on an index. This is useful for basing the position
    * of the current child element on the position of the last child element.
    */
  def getLast(i: Double): BlessedElement = js.native
  
  /**
    * Get the last rendered and visible child element coords based on an index. This is useful for basing the position
    * of the current child element on the position of the last child element. See the example below.
    */
  def getLastCoords(i: Double): PositionCoords = js.native
  
  /**
    * Check to see if a previous child element has been rendered and is visible on screen. This is only useful
    * for checking child elements that have already been attempted to be rendered! see the example below.
    */
  def isRendered(el: BlessedElement): Boolean = js.native
  
  @JSName("options")
  var options_LayoutElement: LayoutOptions = js.native
  
  /**
    * A callback which is called right before the children are iterated over to be rendered. Should return an
    * iterator callback which is called on each child element: iterator(el, i).
    */
  def renderer(coords: PositionCoords): Unit = js.native
}
