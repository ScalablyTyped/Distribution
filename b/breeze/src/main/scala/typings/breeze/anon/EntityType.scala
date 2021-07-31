package typings.breeze.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityType extends StObject {
  
  var entityType: js.UndefOr[typings.breeze.breeze.EntityType] = js.undefined
  
  var ignore: js.UndefOr[Boolean] = js.undefined
  
  var nodeId: js.UndefOr[js.Any] = js.undefined
  
  var nodeRefId: js.UndefOr[js.Any] = js.undefined
}
object EntityType {
  
  @scala.inline
  def apply(): EntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityType]
  }
  
  @scala.inline
  implicit class EntityTypeMutableBuilder[Self <: EntityType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityType(value: typings.breeze.breeze.EntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
    
    @scala.inline
    def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    @scala.inline
    def setNodeId(value: js.Any): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    @scala.inline
    def setNodeRefId(value: js.Any): Self = StObject.set(x, "nodeRefId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeRefIdUndefined: Self = StObject.set(x, "nodeRefId", js.undefined)
  }
}
