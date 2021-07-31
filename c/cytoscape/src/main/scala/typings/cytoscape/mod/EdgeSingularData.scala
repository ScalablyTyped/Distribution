package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/data
  */
trait EdgeSingularData extends StObject {
  
  /**
    * Get whether the edge is a loop (i.e. source same as target).
    * http://js.cytoscape.org/#edge.isLoop
    */
  def isLoop(): Boolean
  
  /**
    * Get whether the edge is simple (i.e. source different than target).
    * http://js.cytoscape.org/#edge.isSimple
    */
  def isSimple(): Boolean
}
object EdgeSingularData {
  
  @scala.inline
  def apply(isLoop: () => Boolean, isSimple: () => Boolean): EdgeSingularData = {
    val __obj = js.Dynamic.literal(isLoop = js.Any.fromFunction0(isLoop), isSimple = js.Any.fromFunction0(isSimple))
    __obj.asInstanceOf[EdgeSingularData]
  }
  
  @scala.inline
  implicit class EdgeSingularDataMutableBuilder[Self <: EdgeSingularData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsLoop(value: () => Boolean): Self = StObject.set(x, "isLoop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSimple(value: () => Boolean): Self = StObject.set(x, "isSimple", js.Any.fromFunction0(value))
  }
}
