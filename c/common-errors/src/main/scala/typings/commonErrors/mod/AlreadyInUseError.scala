package typings.commonErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "AlreadyInUseError")
@js.native
class AlreadyInUseError protected () extends js.Object {
  /**
    * @param entityName the entity that owns the protected resource
    * @param args       the fields or attributes that are already in use
    */
  def this(entityName: String, args: String*) = this()
}
