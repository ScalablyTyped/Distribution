package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyToPath extends StObject {
  
  /**
    * The path that is referenced from the root.
    */
  var Path: js.UndefOr[PathString] = js.undefined
  
  /**
    * List of policy objects.
    */
  var Policies: js.UndefOr[PolicyAttachmentList] = js.undefined
}
object PolicyToPath {
  
  inline def apply(): PolicyToPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyToPath]
  }
  
  extension [Self <: PolicyToPath](x: Self) {
    
    inline def setPath(value: PathString): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    inline def setPolicies(value: PolicyAttachmentList): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
    
    inline def setPoliciesVarargs(value: PolicyAttachment*): Self = StObject.set(x, "Policies", js.Array(value*))
  }
}
