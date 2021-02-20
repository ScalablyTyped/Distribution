package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelActivity extends StObject {
  
  /**
    * The name of the channel from which the messages are processed.
    */
  var channelName: ChannelName = js.native
  
  /**
    * The name of the channel activity.
    */
  var name: ActivityName = js.native
  
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.native
}
object ChannelActivity {
  
  @scala.inline
  def apply(channelName: ChannelName, name: ActivityName): ChannelActivity = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelActivity]
  }
  
  @scala.inline
  implicit class ChannelActivityMutableBuilder[Self <: ChannelActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelName(value: ChannelName): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ActivityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: ActivityName): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
