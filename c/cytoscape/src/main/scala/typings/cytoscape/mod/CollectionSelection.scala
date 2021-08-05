package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/layout
  */
trait CollectionSelection extends StObject {
  
  def deselect(): this.type
  
  /**
    * Make the elements selected (NB other elements outside the collection are not affected).
    * http://js.cytoscape.org/#eles.select
    */
  def select(): this.type
  
  /**
    * Make the selection states of the elements mutable.
    * http://js.cytoscape.org/#eles.selectify
    */
  def selectify(): this.type
  
  /**
    * Make the elements not selected (NB other elements outside the collection are not affected).
    * http://js.cytoscape.org/#eles.unselect
    */
  def unselect(): this.type
  
  /**
    * Make the selection states of the elements immutable.
    * http://js.cytoscape.org/#eles.unselectify
    */
  def unselectify(): this.type
}
object CollectionSelection {
  
  inline def apply(
    deselect: () => CollectionSelection,
    select: () => CollectionSelection,
    selectify: () => CollectionSelection,
    unselect: () => CollectionSelection,
    unselectify: () => CollectionSelection
  ): CollectionSelection = {
    val __obj = js.Dynamic.literal(deselect = js.Any.fromFunction0(deselect), select = js.Any.fromFunction0(select), selectify = js.Any.fromFunction0(selectify), unselect = js.Any.fromFunction0(unselect), unselectify = js.Any.fromFunction0(unselectify))
    __obj.asInstanceOf[CollectionSelection]
  }
  
  extension [Self <: CollectionSelection](x: Self) {
    
    inline def setDeselect(value: () => CollectionSelection): Self = StObject.set(x, "deselect", js.Any.fromFunction0(value))
    
    inline def setSelect(value: () => CollectionSelection): Self = StObject.set(x, "select", js.Any.fromFunction0(value))
    
    inline def setSelectify(value: () => CollectionSelection): Self = StObject.set(x, "selectify", js.Any.fromFunction0(value))
    
    inline def setUnselect(value: () => CollectionSelection): Self = StObject.set(x, "unselect", js.Any.fromFunction0(value))
    
    inline def setUnselectify(value: () => CollectionSelection): Self = StObject.set(x, "unselectify", js.Any.fromFunction0(value))
  }
}
