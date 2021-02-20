package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddLayerVersionPermissionResponse extends StObject {
  
  /**
    * A unique identifier for the current revision of the policy.
    */
  var RevisionId: js.UndefOr[String] = js.native
  
  /**
    * The permission statement.
    */
  var Statement: js.UndefOr[String] = js.native
}
object AddLayerVersionPermissionResponse {
  
  @scala.inline
  def apply(): AddLayerVersionPermissionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddLayerVersionPermissionResponse]
  }
  
  @scala.inline
  implicit class AddLayerVersionPermissionResponseMutableBuilder[Self <: AddLayerVersionPermissionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    
    @scala.inline
    def setStatement(value: String): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementUndefined: Self = StObject.set(x, "Statement", js.undefined)
  }
}
