package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelKeyDeletionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (key ARN) of the CMK whose deletion is canceled.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
}
object CancelKeyDeletionResponse {
  
  @scala.inline
  def apply(): CancelKeyDeletionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelKeyDeletionResponse]
  }
  
  @scala.inline
  implicit class CancelKeyDeletionResponseMutableBuilder[Self <: CancelKeyDeletionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
  }
}
