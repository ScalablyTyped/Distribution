package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateKeyGroupRequest extends StObject {
  
  /**
    * A key group configuration.
    */
  var KeyGroupConfig: typings.awsSdk.cloudfrontMod.KeyGroupConfig = js.native
}
object CreateKeyGroupRequest {
  
  @scala.inline
  def apply(KeyGroupConfig: KeyGroupConfig): CreateKeyGroupRequest = {
    val __obj = js.Dynamic.literal(KeyGroupConfig = KeyGroupConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeyGroupRequest]
  }
  
  @scala.inline
  implicit class CreateKeyGroupRequestMutableBuilder[Self <: CreateKeyGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyGroupConfig(value: KeyGroupConfig): Self = StObject.set(x, "KeyGroupConfig", value.asInstanceOf[js.Any])
  }
}
