package typings.breeze.anon

import org.scalablytyped.runtime.StringDictionary
import typings.breeze.breeze.Entity
import typings.breeze.breeze.EntityKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entities extends StObject {
  
  var entities: js.Array[Entity]
  
  var tempKeyMapping: StringDictionary[EntityKey]
}
object Entities {
  
  @scala.inline
  def apply(entities: js.Array[Entity], tempKeyMapping: StringDictionary[EntityKey]): Entities = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], tempKeyMapping = tempKeyMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entities]
  }
  
  @scala.inline
  implicit class EntitiesMutableBuilder[Self <: Entities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[Entity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setTempKeyMapping(value: StringDictionary[EntityKey]): Self = StObject.set(x, "tempKeyMapping", value.asInstanceOf[js.Any])
  }
}
