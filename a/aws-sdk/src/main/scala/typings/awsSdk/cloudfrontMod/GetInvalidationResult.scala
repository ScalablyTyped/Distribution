package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInvalidationResult extends StObject {
  
  /**
    * The invalidation's information. For more information, see Invalidation Complex Type. 
    */
  var Invalidation: js.UndefOr[typings.awsSdk.cloudfrontMod.Invalidation] = js.undefined
}
object GetInvalidationResult {
  
  inline def apply(): GetInvalidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInvalidationResult]
  }
  
  extension [Self <: GetInvalidationResult](x: Self) {
    
    inline def setInvalidation(value: Invalidation): Self = StObject.set(x, "Invalidation", value.asInstanceOf[js.Any])
    
    inline def setInvalidationUndefined: Self = StObject.set(x, "Invalidation", js.undefined)
  }
}
