package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSignalingChannelInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the signaling channel that you want to delete.
    */
  var ChannelARN: ResourceARN = js.native
  
  /**
    * The current version of the signaling channel that you want to delete. You can obtain the current version by invoking the DescribeSignalingChannel or ListSignalingChannels API operations.
    */
  var CurrentVersion: js.UndefOr[Version] = js.native
}
object DeleteSignalingChannelInput {
  
  @scala.inline
  def apply(ChannelARN: ResourceARN): DeleteSignalingChannelInput = {
    val __obj = js.Dynamic.literal(ChannelARN = ChannelARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSignalingChannelInput]
  }
  
  @scala.inline
  implicit class DeleteSignalingChannelInputMutableBuilder[Self <: DeleteSignalingChannelInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelARN(value: ResourceARN): Self = StObject.set(x, "ChannelARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentVersion(value: Version): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentVersionUndefined: Self = StObject.set(x, "CurrentVersion", js.undefined)
  }
}
