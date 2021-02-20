package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAliasRequest extends StObject {
  
  /**
    * Identifies the alias that is changing its CMK. This value must begin with alias/ followed by the alias name, such as alias/ExampleAlias. You cannot use UpdateAlias to change the alias name.
    */
  var AliasName: AliasNameType = js.native
  
  /**
    * Identifies the CMK to associate with the alias. When the update operation completes, the alias will point to this CMK.  The CMK must be in the same AWS account and Region as the alias. Also, the new target CMK must be the same type as the current target CMK (both symmetric or both asymmetric) and they must have the same key usage.  Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey. To verify that the alias is mapped to the correct CMK, use ListAliases.
    */
  var TargetKeyId: KeyIdType = js.native
}
object UpdateAliasRequest {
  
  @scala.inline
  def apply(AliasName: AliasNameType, TargetKeyId: KeyIdType): UpdateAliasRequest = {
    val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAliasRequest]
  }
  
  @scala.inline
  implicit class UpdateAliasRequestMutableBuilder[Self <: UpdateAliasRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasName(value: AliasNameType): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetKeyId(value: KeyIdType): Self = StObject.set(x, "TargetKeyId", value.asInstanceOf[js.Any])
  }
}
