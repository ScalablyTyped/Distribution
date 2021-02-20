package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceManagementErrorWithDetails extends StObject {
  
  /**
    * The error code returned when exporting the template.
    */
  val code: js.UndefOr[String] = js.native
  
  /**
    * Validation error.
    */
  val details: js.UndefOr[js.Array[ResourceManagementErrorWithDetails]] = js.native
  
  /**
    * The error message describing the export error.
    */
  val message: js.UndefOr[String] = js.native
  
  /**
    * The target of the error.
    */
  val target: js.UndefOr[String] = js.native
}
object ResourceManagementErrorWithDetails {
  
  @scala.inline
  def apply(): ResourceManagementErrorWithDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceManagementErrorWithDetails]
  }
  
  @scala.inline
  implicit class ResourceManagementErrorWithDetailsMutableBuilder[Self <: ResourceManagementErrorWithDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setDetails(value: js.Array[ResourceManagementErrorWithDetails]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: ResourceManagementErrorWithDetails*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
