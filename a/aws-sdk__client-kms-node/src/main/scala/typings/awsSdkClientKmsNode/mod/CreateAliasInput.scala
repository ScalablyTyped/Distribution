package typings.awsSdkClientKmsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAliasInput
  extends StObject
     with typings.awsSdkClientKmsNode.typesCreateAliasInputMod.CreateAliasInput
object CreateAliasInput {
  
  inline def apply(AliasName: String, TargetKeyId: String): CreateAliasInput = {
    val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAliasInput]
  }
}
