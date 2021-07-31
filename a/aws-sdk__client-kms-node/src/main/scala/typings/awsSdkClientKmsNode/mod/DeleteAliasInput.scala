package typings.awsSdkClientKmsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAliasInput
  extends StObject
     with typings.awsSdkClientKmsNode.typesDeleteAliasInputMod.DeleteAliasInput
object DeleteAliasInput {
  
  @scala.inline
  def apply(AliasName: String): DeleteAliasInput = {
    val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAliasInput]
  }
}
