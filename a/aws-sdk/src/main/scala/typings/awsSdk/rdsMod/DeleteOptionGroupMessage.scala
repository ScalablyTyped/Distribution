package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteOptionGroupMessage extends StObject {
  
  /**
    * The name of the option group to be deleted.  You can't delete default option groups. 
    */
  var OptionGroupName: String = js.native
}
object DeleteOptionGroupMessage {
  
  @scala.inline
  def apply(OptionGroupName: String): DeleteOptionGroupMessage = {
    val __obj = js.Dynamic.literal(OptionGroupName = OptionGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOptionGroupMessage]
  }
  
  @scala.inline
  implicit class DeleteOptionGroupMessageMutableBuilder[Self <: DeleteOptionGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptionGroupName(value: String): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
  }
}
