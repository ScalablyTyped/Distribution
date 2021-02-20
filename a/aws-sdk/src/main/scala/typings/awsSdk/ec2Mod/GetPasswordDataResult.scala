package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPasswordDataResult extends StObject {
  
  /**
    * The ID of the Windows instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  
  /**
    * The password of the instance. Returns an empty string if the password is not available.
    */
  var PasswordData: js.UndefOr[String] = js.native
  
  /**
    * The time the data was last updated.
    */
  var Timestamp: js.UndefOr[DateTime] = js.native
}
object GetPasswordDataResult {
  
  @scala.inline
  def apply(): GetPasswordDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPasswordDataResult]
  }
  
  @scala.inline
  implicit class GetPasswordDataResultMutableBuilder[Self <: GetPasswordDataResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setPasswordData(value: String): Self = StObject.set(x, "PasswordData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordDataUndefined: Self = StObject.set(x, "PasswordData", js.undefined)
    
    @scala.inline
    def setTimestamp(value: DateTime): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
