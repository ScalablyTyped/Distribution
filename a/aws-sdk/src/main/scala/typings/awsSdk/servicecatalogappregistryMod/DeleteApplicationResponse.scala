package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApplicationResponse extends StObject {
  
  /**
    * Information about the deleted application.
    */
  var application: js.UndefOr[ApplicationSummary] = js.native
}
object DeleteApplicationResponse {
  
  @scala.inline
  def apply(): DeleteApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteApplicationResponse]
  }
  
  @scala.inline
  implicit class DeleteApplicationResponseMutableBuilder[Self <: DeleteApplicationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: ApplicationSummary): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
  }
}
