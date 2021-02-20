package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRegistryInput extends StObject {
  
  /**
    * This is a wrapper structure that may contain the registry name and Amazon Resource Name (ARN).
    */
  var RegistryId: typings.awsSdk.glueMod.RegistryId = js.native
}
object DeleteRegistryInput {
  
  @scala.inline
  def apply(RegistryId: RegistryId): DeleteRegistryInput = {
    val __obj = js.Dynamic.literal(RegistryId = RegistryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRegistryInput]
  }
  
  @scala.inline
  implicit class DeleteRegistryInputMutableBuilder[Self <: DeleteRegistryInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = StObject.set(x, "RegistryId", value.asInstanceOf[js.Any])
  }
}
