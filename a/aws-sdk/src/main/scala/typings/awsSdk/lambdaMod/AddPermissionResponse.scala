package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddPermissionResponse extends StObject {
  
  /**
    * The permission statement that's added to the function policy.
    */
  var Statement: js.UndefOr[String] = js.undefined
}
object AddPermissionResponse {
  
  @scala.inline
  def apply(): AddPermissionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddPermissionResponse]
  }
  
  @scala.inline
  implicit class AddPermissionResponseMutableBuilder[Self <: AddPermissionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatement(value: String): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementUndefined: Self = StObject.set(x, "Statement", js.undefined)
  }
}
