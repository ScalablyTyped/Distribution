package typings.d3Indirections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Assign a resource to a manual indirection.
  */
trait ManualAssignment
  extends StObject
     with AssignmentBase
     with Assignment {
  
  /** Unique identifier of the new resource to use. */
  var resourceUid: String
}
object ManualAssignment {
  
  @scala.inline
  def apply(resourceUid: String, uid: String): ManualAssignment = {
    val __obj = js.Dynamic.literal(resourceUid = resourceUid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManualAssignment]
  }
  
  @scala.inline
  implicit class ManualAssignmentMutableBuilder[Self <: ManualAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceUid(value: String): Self = StObject.set(x, "resourceUid", value.asInstanceOf[js.Any])
  }
}
