package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddResourcePermissionsResponse extends StObject {
  
  /**
    * The share results.
    */
  var ShareResults: js.UndefOr[ShareResultsList] = js.undefined
}
object AddResourcePermissionsResponse {
  
  @scala.inline
  def apply(): AddResourcePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddResourcePermissionsResponse]
  }
  
  @scala.inline
  implicit class AddResourcePermissionsResponseMutableBuilder[Self <: AddResourcePermissionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShareResults(value: ShareResultsList): Self = StObject.set(x, "ShareResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareResultsUndefined: Self = StObject.set(x, "ShareResults", js.undefined)
    
    @scala.inline
    def setShareResultsVarargs(value: ShareResult*): Self = StObject.set(x, "ShareResults", js.Array(value :_*))
  }
}
