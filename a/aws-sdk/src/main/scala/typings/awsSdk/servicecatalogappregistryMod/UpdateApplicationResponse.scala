package typings.awsSdk.servicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationResponse extends StObject {
  
  /**
    * The updated information of the application.
    */
  var application: js.UndefOr[Application] = js.undefined
}
object UpdateApplicationResponse {
  
  @scala.inline
  def apply(): UpdateApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateApplicationResponse]
  }
  
  @scala.inline
  implicit class UpdateApplicationResponseMutableBuilder[Self <: UpdateApplicationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
  }
}
