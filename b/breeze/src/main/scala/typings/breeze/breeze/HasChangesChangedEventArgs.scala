package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasChangesChangedEventArgs extends StObject {
  
  var entityManager: EntityManager = js.native
  
  var hasChanges: Boolean = js.native
}
object HasChangesChangedEventArgs {
  
  @scala.inline
  def apply(entityManager: EntityManager, hasChanges: Boolean): HasChangesChangedEventArgs = {
    val __obj = js.Dynamic.literal(entityManager = entityManager.asInstanceOf[js.Any], hasChanges = hasChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasChangesChangedEventArgs]
  }
  
  @scala.inline
  implicit class HasChangesChangedEventArgsMutableBuilder[Self <: HasChangesChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityManager(value: EntityManager): Self = StObject.set(x, "entityManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasChanges(value: Boolean): Self = StObject.set(x, "hasChanges", value.asInstanceOf[js.Any])
  }
}
