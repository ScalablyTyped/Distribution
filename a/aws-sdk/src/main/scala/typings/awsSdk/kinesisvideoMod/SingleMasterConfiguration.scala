package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingleMasterConfiguration extends StObject {
  
  /**
    * The period of time a signaling channel retains underlivered messages before they are discarded.
    */
  var MessageTtlSeconds: js.UndefOr[typings.awsSdk.kinesisvideoMod.MessageTtlSeconds] = js.native
}
object SingleMasterConfiguration {
  
  @scala.inline
  def apply(): SingleMasterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleMasterConfiguration]
  }
  
  @scala.inline
  implicit class SingleMasterConfigurationMutableBuilder[Self <: SingleMasterConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageTtlSeconds(value: MessageTtlSeconds): Self = StObject.set(x, "MessageTtlSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTtlSecondsUndefined: Self = StObject.set(x, "MessageTtlSeconds", js.undefined)
  }
}
