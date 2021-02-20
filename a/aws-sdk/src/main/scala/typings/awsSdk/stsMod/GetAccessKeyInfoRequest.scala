package typings.awsSdk.stsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccessKeyInfoRequest extends StObject {
  
  /**
    * The identifier of an access key. This parameter allows (through its regex pattern) a string of characters that can consist of any upper- or lowercase letter or digit.
    */
  var AccessKeyId: accessKeyIdType = js.native
}
object GetAccessKeyInfoRequest {
  
  @scala.inline
  def apply(AccessKeyId: accessKeyIdType): GetAccessKeyInfoRequest = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessKeyInfoRequest]
  }
  
  @scala.inline
  implicit class GetAccessKeyInfoRequestMutableBuilder[Self <: GetAccessKeyInfoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKeyId(value: accessKeyIdType): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
  }
}
