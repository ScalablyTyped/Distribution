package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelStatistics extends StObject {
  
  /**
    * The estimated size of the channel.
    */
  var size: js.UndefOr[EstimatedResourceSize] = js.native
}
object ChannelStatistics {
  
  @scala.inline
  def apply(): ChannelStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelStatistics]
  }
  
  @scala.inline
  implicit class ChannelStatisticsMutableBuilder[Self <: ChannelStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: EstimatedResourceSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
