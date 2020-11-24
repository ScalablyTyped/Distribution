package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEntitiesRequest extends js.Object {
  
  /**
    * An array of entity IDs. The IDs should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME 
    */
  var ids: Urns = js.native
  
  /**
    * The version of the user's namespace. Defaults to the latest version of the user's namespace.
    */
  var namespaceVersion: js.UndefOr[Version] = js.native
}
object GetEntitiesRequest {
  
  @scala.inline
  def apply(ids: Urns): GetEntitiesRequest = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEntitiesRequest]
  }
  
  @scala.inline
  implicit class GetEntitiesRequestOps[Self <: GetEntitiesRequest] (val x: Self) extends AnyVal {
    
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
    def setIdsVarargs(value: Urn*): Self = this.set("ids", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: Urns): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceVersion(value: Version): Self = this.set("namespaceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaceVersion: Self = this.set("namespaceVersion", js.undefined)
  }
}
