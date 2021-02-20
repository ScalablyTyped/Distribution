package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAliasRequest extends StObject {
  
  /**
    * Specifies the alias name. This value must begin with alias/ followed by a name, such as alias/ExampleAlias. The alias name cannot begin with alias/aws/. The alias/aws/ prefix is reserved for AWS managed CMKs.
    */
  var AliasName: AliasNameType = js.native
  
  /**
    * Identifies the CMK to which the alias refers. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. You cannot specify another alias. For help finding the key ID and ARN, see Finding the Key ID and ARN in the AWS Key Management Service Developer Guide.
    */
  var TargetKeyId: KeyIdType = js.native
}
object CreateAliasRequest {
  
  @scala.inline
  def apply(AliasName: AliasNameType, TargetKeyId: KeyIdType): CreateAliasRequest = {
    val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAliasRequest]
  }
  
  @scala.inline
  implicit class CreateAliasRequestMutableBuilder[Self <: CreateAliasRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasName(value: AliasNameType): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetKeyId(value: KeyIdType): Self = StObject.set(x, "TargetKeyId", value.asInstanceOf[js.Any])
  }
}
