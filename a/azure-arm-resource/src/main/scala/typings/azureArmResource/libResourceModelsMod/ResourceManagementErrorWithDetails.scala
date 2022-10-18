package typings.azureArmResource.libResourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceManagementErrorWithDetails extends StObject {
  
  /**
    * The error code returned when exporting the template.
    */
  val code: js.UndefOr[String] = js.undefined
  
  /**
    * Validation error.
    */
  val details: js.UndefOr[js.Array[ResourceManagementErrorWithDetails]] = js.undefined
  
  /**
    * The error message describing the export error.
    */
  val message: js.UndefOr[String] = js.undefined
  
  /**
    * The target of the error.
    */
  val target: js.UndefOr[String] = js.undefined
}
object ResourceManagementErrorWithDetails {
  
  inline def apply(): ResourceManagementErrorWithDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceManagementErrorWithDetails]
  }
  
  extension [Self <: ResourceManagementErrorWithDetails](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDetails(value: js.Array[ResourceManagementErrorWithDetails]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: ResourceManagementErrorWithDetails*): Self = StObject.set(x, "details", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
