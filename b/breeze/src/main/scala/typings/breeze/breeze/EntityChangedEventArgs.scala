package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityChangedEventArgs extends StObject {
  
  var args: js.Object
  
  var entity: Entity
  
  var entityAction: EntityActionSymbol
}
object EntityChangedEventArgs {
  
  @scala.inline
  def apply(args: js.Object, entity: Entity, entityAction: EntityActionSymbol): EntityChangedEventArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], entityAction = entityAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityChangedEventArgs]
  }
  
  @scala.inline
  implicit class EntityChangedEventArgsMutableBuilder[Self <: EntityChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Object): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntity(value: Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityAction(value: EntityActionSymbol): Self = StObject.set(x, "entityAction", value.asInstanceOf[js.Any])
  }
}
