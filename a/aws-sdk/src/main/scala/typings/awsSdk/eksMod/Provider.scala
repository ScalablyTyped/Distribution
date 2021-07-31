package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Provider extends StObject {
  
  /**
    * Amazon Resource Name (ARN) or alias of the customer master key (CMK). The CMK must be symmetric, created in the same region as the cluster, and if the CMK was created in a different account, the user must have access to the CMK. For more information, see Allowing Users in Other Accounts to Use a CMK in the AWS Key Management Service Developer Guide.
    */
  var keyArn: js.UndefOr[String] = js.undefined
}
object Provider {
  
  @scala.inline
  def apply(): Provider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Provider]
  }
  
  @scala.inline
  implicit class ProviderMutableBuilder[Self <: Provider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyArn(value: String): Self = StObject.set(x, "keyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyArnUndefined: Self = StObject.set(x, "keyArn", js.undefined)
  }
}
