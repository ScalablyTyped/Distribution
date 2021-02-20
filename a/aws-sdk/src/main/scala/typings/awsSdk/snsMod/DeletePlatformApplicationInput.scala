package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePlatformApplicationInput extends StObject {
  
  /**
    * PlatformApplicationArn of platform application object to delete.
    */
  var PlatformApplicationArn: String = js.native
}
object DeletePlatformApplicationInput {
  
  @scala.inline
  def apply(PlatformApplicationArn: String): DeletePlatformApplicationInput = {
    val __obj = js.Dynamic.literal(PlatformApplicationArn = PlatformApplicationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePlatformApplicationInput]
  }
  
  @scala.inline
  implicit class DeletePlatformApplicationInputMutableBuilder[Self <: DeletePlatformApplicationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlatformApplicationArn(value: String): Self = StObject.set(x, "PlatformApplicationArn", value.asInstanceOf[js.Any])
  }
}
