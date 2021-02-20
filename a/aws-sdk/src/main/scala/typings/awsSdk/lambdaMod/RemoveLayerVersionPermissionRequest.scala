package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveLayerVersionPermissionRequest extends StObject {
  
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typings.awsSdk.lambdaMod.LayerName = js.native
  
  /**
    * Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a policy that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.native
  
  /**
    * The identifier that was specified when the statement was added.
    */
  var StatementId: typings.awsSdk.lambdaMod.StatementId = js.native
  
  /**
    * The version number.
    */
  var VersionNumber: LayerVersionNumber = js.native
}
object RemoveLayerVersionPermissionRequest {
  
  @scala.inline
  def apply(LayerName: LayerName, StatementId: StatementId, VersionNumber: LayerVersionNumber): RemoveLayerVersionPermissionRequest = {
    val __obj = js.Dynamic.literal(LayerName = LayerName.asInstanceOf[js.Any], StatementId = StatementId.asInstanceOf[js.Any], VersionNumber = VersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveLayerVersionPermissionRequest]
  }
  
  @scala.inline
  implicit class RemoveLayerVersionPermissionRequestMutableBuilder[Self <: RemoveLayerVersionPermissionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayerName(value: LayerName): Self = StObject.set(x, "LayerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    
    @scala.inline
    def setStatementId(value: StatementId): Self = StObject.set(x, "StatementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumber(value: LayerVersionNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
  }
}
