package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptionAtRestOptionsStatus extends StObject {
  
  /**
    *  Specifies the Encryption At Rest options for the specified Elasticsearch domain.
    */
  var Options: EncryptionAtRestOptions = js.native
  
  /**
    *  Specifies the status of the Encryption At Rest options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus = js.native
}
object EncryptionAtRestOptionsStatus {
  
  @scala.inline
  def apply(Options: EncryptionAtRestOptions, Status: OptionStatus): EncryptionAtRestOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionAtRestOptionsStatus]
  }
  
  @scala.inline
  implicit class EncryptionAtRestOptionsStatusMutableBuilder[Self <: EncryptionAtRestOptionsStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: EncryptionAtRestOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
