package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAliasInput extends StObject {
  
  /**
    * A unique identifier of the alias that you want to delete. You can use either the alias ID or ARN value.
    */
  var AliasId: AliasIdOrArn = js.native
}
object DeleteAliasInput {
  
  @scala.inline
  def apply(AliasId: AliasIdOrArn): DeleteAliasInput = {
    val __obj = js.Dynamic.literal(AliasId = AliasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAliasInput]
  }
  
  @scala.inline
  implicit class DeleteAliasInputMutableBuilder[Self <: DeleteAliasInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasId(value: AliasIdOrArn): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
  }
}
