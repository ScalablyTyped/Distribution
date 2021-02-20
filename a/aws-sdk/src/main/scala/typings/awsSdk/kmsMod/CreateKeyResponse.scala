package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateKeyResponse extends StObject {
  
  /**
    * Metadata associated with the CMK.
    */
  var KeyMetadata: js.UndefOr[typings.awsSdk.kmsMod.KeyMetadata] = js.native
}
object CreateKeyResponse {
  
  @scala.inline
  def apply(): CreateKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateKeyResponse]
  }
  
  @scala.inline
  implicit class CreateKeyResponseMutableBuilder[Self <: CreateKeyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyMetadata(value: KeyMetadata): Self = StObject.set(x, "KeyMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyMetadataUndefined: Self = StObject.set(x, "KeyMetadata", js.undefined)
  }
}
