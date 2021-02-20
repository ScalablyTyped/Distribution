package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputChannelMapping extends StObject {
  
  /**
    * List of input channels
    */
  var InputChannels: js.UndefOr[listOfIntegerMinNegative60Max6] = js.native
}
object OutputChannelMapping {
  
  @scala.inline
  def apply(): OutputChannelMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputChannelMapping]
  }
  
  @scala.inline
  implicit class OutputChannelMappingMutableBuilder[Self <: OutputChannelMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputChannels(value: listOfIntegerMinNegative60Max6): Self = StObject.set(x, "InputChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputChannelsUndefined: Self = StObject.set(x, "InputChannels", js.undefined)
    
    @scala.inline
    def setInputChannelsVarargs(value: integerMinNegative60Max6*): Self = StObject.set(x, "InputChannels", js.Array(value :_*))
  }
}
