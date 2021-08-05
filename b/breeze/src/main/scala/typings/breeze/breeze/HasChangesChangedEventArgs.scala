package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasChangesChangedEventArgs extends StObject {
  
  var entityManager: EntityManager
  
  var hasChanges: Boolean
}
object HasChangesChangedEventArgs {
  
  inline def apply(entityManager: EntityManager, hasChanges: Boolean): HasChangesChangedEventArgs = {
    val __obj = js.Dynamic.literal(entityManager = entityManager.asInstanceOf[js.Any], hasChanges = hasChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasChangesChangedEventArgs]
  }
  
  extension [Self <: HasChangesChangedEventArgs](x: Self) {
    
    inline def setEntityManager(value: EntityManager): Self = StObject.set(x, "entityManager", value.asInstanceOf[js.Any])
    
    inline def setHasChanges(value: Boolean): Self = StObject.set(x, "hasChanges", value.asInstanceOf[js.Any])
  }
}
