package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowTypeFilter extends StObject {
  
  /**
    *  Name of the workflow type.
    */
  var name: Name = js.native
  
  /**
    * Version of the workflow type.
    */
  var version: js.UndefOr[VersionOptional] = js.native
}
object WorkflowTypeFilter {
  
  @scala.inline
  def apply(name: Name): WorkflowTypeFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowTypeFilter]
  }
  
  @scala.inline
  implicit class WorkflowTypeFilterMutableBuilder[Self <: WorkflowTypeFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: VersionOptional): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
