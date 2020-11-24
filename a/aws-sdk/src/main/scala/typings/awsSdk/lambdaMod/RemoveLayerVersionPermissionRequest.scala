package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveLayerVersionPermissionRequest extends js.Object {
  
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
  implicit class RemoveLayerVersionPermissionRequestOps[Self <: RemoveLayerVersionPermissionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLayerName(value: LayerName): Self = this.set("LayerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementId(value: StatementId): Self = this.set("StatementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumber(value: LayerVersionNumber): Self = this.set("VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: String): Self = this.set("RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionId: Self = this.set("RevisionId", js.undefined)
  }
}
