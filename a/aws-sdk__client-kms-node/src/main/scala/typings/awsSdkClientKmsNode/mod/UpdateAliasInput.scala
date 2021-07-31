package typings.awsSdkClientKmsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAliasInput
  extends StObject
     with typings.awsSdkClientKmsNode.typesUpdateAliasInputMod.UpdateAliasInput
object UpdateAliasInput {
  
  @scala.inline
  def apply(AliasName: String, TargetKeyId: String): UpdateAliasInput = {
    val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAliasInput]
  }
}
