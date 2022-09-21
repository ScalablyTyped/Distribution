package typings.typescriptNn5FuAjk.ts

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedTypeReferenceDirectiveWithFailedLookupLocations extends StObject {
  
  val failedLookupLocations: Array[java.lang.String]
  
  val resolvedTypeReferenceDirective: js.UndefOr[ResolvedTypeReferenceDirective] = js.undefined
}
object ResolvedTypeReferenceDirectiveWithFailedLookupLocations {
  
  inline def apply(failedLookupLocations: Array[java.lang.String]): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = {
    val __obj = js.Dynamic.literal(failedLookupLocations = failedLookupLocations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
  }
  
  extension [Self <: ResolvedTypeReferenceDirectiveWithFailedLookupLocations](x: Self) {
    
    inline def setFailedLookupLocations(value: Array[java.lang.String]): Self = StObject.set(x, "failedLookupLocations", value.asInstanceOf[js.Any])
    
    inline def setResolvedTypeReferenceDirective(value: ResolvedTypeReferenceDirective): Self = StObject.set(x, "resolvedTypeReferenceDirective", value.asInstanceOf[js.Any])
    
    inline def setResolvedTypeReferenceDirectiveUndefined: Self = StObject.set(x, "resolvedTypeReferenceDirective", js.undefined)
  }
}
