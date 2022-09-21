package typings.awsSdk.resiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceErrorsDetails extends StObject {
  
  /**
    *  This indicates if there are more errors not listed in the resourceErrors list. 
    */
  var hasMoreErrors: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    *  A list of errors retrieving an application's resources. 
    */
  var resourceErrors: js.UndefOr[ResourceErrorList] = js.undefined
}
object ResourceErrorsDetails {
  
  inline def apply(): ResourceErrorsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceErrorsDetails]
  }
  
  extension [Self <: ResourceErrorsDetails](x: Self) {
    
    inline def setHasMoreErrors(value: BooleanOptional): Self = StObject.set(x, "hasMoreErrors", value.asInstanceOf[js.Any])
    
    inline def setHasMoreErrorsUndefined: Self = StObject.set(x, "hasMoreErrors", js.undefined)
    
    inline def setResourceErrors(value: ResourceErrorList): Self = StObject.set(x, "resourceErrors", value.asInstanceOf[js.Any])
    
    inline def setResourceErrorsUndefined: Self = StObject.set(x, "resourceErrors", js.undefined)
    
    inline def setResourceErrorsVarargs(value: ResourceError*): Self = StObject.set(x, "resourceErrors", js.Array(value*))
  }
}
