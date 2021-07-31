package typings.d3Indirections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class for assigning values to existing indirections.
  */
trait AssignmentBase extends StObject {
  
  /** Unique identifier of the indirection. */
  var uid: String
}
object AssignmentBase {
  
  @scala.inline
  def apply(uid: String): AssignmentBase = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentBase]
  }
  
  @scala.inline
  implicit class AssignmentBaseMutableBuilder[Self <: AssignmentBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
