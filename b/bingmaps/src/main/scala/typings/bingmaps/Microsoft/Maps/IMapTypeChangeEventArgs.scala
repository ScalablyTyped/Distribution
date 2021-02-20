package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMapTypeChangeEventArgs extends StObject {
  
  /** The map type that map has changed to. */
  var newMapTypeId: MapTypeId = js.native
  
  /** The map type that the map has changed from. */
  var oldMapTypeId: MapTypeId = js.native
  
  /** The map instance the event occured on */
  var target: Map = js.native
  
  /** The type of object the event was attached to. Should always be "map" */
  var targetType: String = js.native
}
object IMapTypeChangeEventArgs {
  
  @scala.inline
  def apply(newMapTypeId: MapTypeId, oldMapTypeId: MapTypeId, target: Map, targetType: String): IMapTypeChangeEventArgs = {
    val __obj = js.Dynamic.literal(newMapTypeId = newMapTypeId.asInstanceOf[js.Any], oldMapTypeId = oldMapTypeId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapTypeChangeEventArgs]
  }
  
  @scala.inline
  implicit class IMapTypeChangeEventArgsMutableBuilder[Self <: IMapTypeChangeEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewMapTypeId(value: MapTypeId): Self = StObject.set(x, "newMapTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldMapTypeId(value: MapTypeId): Self = StObject.set(x, "oldMapTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Map): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetType(value: String): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
  }
}
