package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileCacheRequest extends StObject {
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.undefined
  
  /**
    * The ID of the cache that's being deleted.
    */
  var FileCacheId: typings.awsSdk.fsxMod.FileCacheId
}
object DeleteFileCacheRequest {
  
  inline def apply(FileCacheId: FileCacheId): DeleteFileCacheRequest = {
    val __obj = js.Dynamic.literal(FileCacheId = FileCacheId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileCacheRequest]
  }
  
  extension [Self <: DeleteFileCacheRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setFileCacheId(value: FileCacheId): Self = StObject.set(x, "FileCacheId", value.asInstanceOf[js.Any])
  }
}
