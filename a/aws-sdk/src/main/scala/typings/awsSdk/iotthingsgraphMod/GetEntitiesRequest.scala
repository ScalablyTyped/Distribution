package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEntitiesRequest extends StObject {
  
  /**
    * An array of entity IDs. The IDs should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME 
    */
  var ids: Urns
  
  /**
    * The version of the user's namespace. Defaults to the latest version of the user's namespace.
    */
  var namespaceVersion: js.UndefOr[Version] = js.undefined
}
object GetEntitiesRequest {
  
  @scala.inline
  def apply(ids: Urns): GetEntitiesRequest = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEntitiesRequest]
  }
  
  @scala.inline
  implicit class GetEntitiesRequestMutableBuilder[Self <: GetEntitiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIds(value: Urns): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsVarargs(value: Urn*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    @scala.inline
    def setNamespaceVersion(value: Version): Self = StObject.set(x, "namespaceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceVersionUndefined: Self = StObject.set(x, "namespaceVersion", js.undefined)
  }
}
