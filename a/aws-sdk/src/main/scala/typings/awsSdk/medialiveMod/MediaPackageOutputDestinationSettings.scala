package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaPackageOutputDestinationSettings extends StObject {
  
  /**
    * ID of the channel in MediaPackage that is the destination for this output group. You do not need to specify the individual inputs in MediaPackage; MediaLive will handle the connection of the two MediaLive pipelines to the two MediaPackage inputs. The MediaPackage channel and MediaLive channel must be in the same region.
    */
  var ChannelId: js.UndefOr[stringMin1] = js.undefined
}
object MediaPackageOutputDestinationSettings {
  
  @scala.inline
  def apply(): MediaPackageOutputDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPackageOutputDestinationSettings]
  }
  
  @scala.inline
  implicit class MediaPackageOutputDestinationSettingsMutableBuilder[Self <: MediaPackageOutputDestinationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: stringMin1): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "ChannelId", js.undefined)
  }
}
