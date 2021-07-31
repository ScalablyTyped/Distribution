package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Edge extends StObject {
  
  /**
    * The unique of the node within the workflow where the edge ends.
    */
  var DestinationId: js.UndefOr[NameString] = js.undefined
  
  /**
    * The unique of the node within the workflow where the edge starts.
    */
  var SourceId: js.UndefOr[NameString] = js.undefined
}
object Edge {
  
  @scala.inline
  def apply(): Edge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Edge]
  }
  
  @scala.inline
  implicit class EdgeMutableBuilder[Self <: Edge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationId(value: NameString): Self = StObject.set(x, "DestinationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationIdUndefined: Self = StObject.set(x, "DestinationId", js.undefined)
    
    @scala.inline
    def setSourceId(value: NameString): Self = StObject.set(x, "SourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIdUndefined: Self = StObject.set(x, "SourceId", js.undefined)
  }
}
