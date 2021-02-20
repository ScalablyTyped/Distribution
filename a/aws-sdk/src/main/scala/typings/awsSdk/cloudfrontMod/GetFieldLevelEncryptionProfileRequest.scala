package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFieldLevelEncryptionProfileRequest extends StObject {
  
  /**
    * Get the ID for the field-level encryption profile information.
    */
  var Id: String = js.native
}
object GetFieldLevelEncryptionProfileRequest {
  
  @scala.inline
  def apply(Id: String): GetFieldLevelEncryptionProfileRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFieldLevelEncryptionProfileRequest]
  }
  
  @scala.inline
  implicit class GetFieldLevelEncryptionProfileRequestMutableBuilder[Self <: GetFieldLevelEncryptionProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
