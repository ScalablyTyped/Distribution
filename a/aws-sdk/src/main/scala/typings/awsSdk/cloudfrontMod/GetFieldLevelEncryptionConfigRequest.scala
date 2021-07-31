package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFieldLevelEncryptionConfigRequest extends StObject {
  
  /**
    * Request the ID for the field-level encryption configuration information.
    */
  var Id: String
}
object GetFieldLevelEncryptionConfigRequest {
  
  @scala.inline
  def apply(Id: String): GetFieldLevelEncryptionConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFieldLevelEncryptionConfigRequest]
  }
  
  @scala.inline
  implicit class GetFieldLevelEncryptionConfigRequestMutableBuilder[Self <: GetFieldLevelEncryptionConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
