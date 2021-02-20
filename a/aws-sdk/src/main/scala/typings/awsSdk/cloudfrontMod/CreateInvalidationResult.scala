package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInvalidationResult extends StObject {
  
  /**
    * The invalidation's information.
    */
  var Invalidation: js.UndefOr[typings.awsSdk.cloudfrontMod.Invalidation] = js.native
  
  /**
    * The fully qualified URI of the distribution and invalidation batch request, including the Invalidation ID.
    */
  var Location: js.UndefOr[String] = js.native
}
object CreateInvalidationResult {
  
  @scala.inline
  def apply(): CreateInvalidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInvalidationResult]
  }
  
  @scala.inline
  implicit class CreateInvalidationResultMutableBuilder[Self <: CreateInvalidationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvalidation(value: Invalidation): Self = StObject.set(x, "Invalidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidationUndefined: Self = StObject.set(x, "Invalidation", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
