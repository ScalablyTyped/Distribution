package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcesByExternalIdInput extends StObject {
  
  /**
    * The unique ID of an external resource (for example, a CloudFormation stack ID) that is linked to one or more CodeDeploy resources.
    */
  var externalId: js.UndefOr[ExternalId] = js.undefined
}
object DeleteResourcesByExternalIdInput {
  
  @scala.inline
  def apply(): DeleteResourcesByExternalIdInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteResourcesByExternalIdInput]
  }
  
  @scala.inline
  implicit class DeleteResourcesByExternalIdInputMutableBuilder[Self <: DeleteResourcesByExternalIdInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalId(value: ExternalId): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
  }
}
