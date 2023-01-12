package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/layout
  */
trait CollectionLayout extends StObject {
  
  def createLayout(options: LayoutOptions): Layouts
  
  /**
    * Get a new layout, which can be used to algorithmically position the nodes in the collection.
    * This function is useful for running a layout on a subset of the elements in the graph, perhaps in parallel to other layouts.
    *
    * You must specify options.name with the name of the layout you wish to use.
    *
    * Note: that you must call layout.run() in order for it to affect the graph.
    *
    * @param options The layout options.
    */
  def layout(options: LayoutOptions): Layouts
  
  def makeLayout(options: LayoutOptions): Layouts
}
object CollectionLayout {
  
  inline def apply(
    createLayout: LayoutOptions => Layouts,
    layout: LayoutOptions => Layouts,
    makeLayout: LayoutOptions => Layouts
  ): CollectionLayout = {
    val __obj = js.Dynamic.literal(createLayout = js.Any.fromFunction1(createLayout), layout = js.Any.fromFunction1(layout), makeLayout = js.Any.fromFunction1(makeLayout))
    __obj.asInstanceOf[CollectionLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectionLayout] (val x: Self) extends AnyVal {
    
    inline def setCreateLayout(value: LayoutOptions => Layouts): Self = StObject.set(x, "createLayout", js.Any.fromFunction1(value))
    
    inline def setLayout(value: LayoutOptions => Layouts): Self = StObject.set(x, "layout", js.Any.fromFunction1(value))
    
    inline def setMakeLayout(value: LayoutOptions => Layouts): Self = StObject.set(x, "makeLayout", js.Any.fromFunction1(value))
  }
}
