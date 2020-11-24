package typings.awsSdkClientPinpointBrowser.typesSegmentBehaviorsMod

import typings.awsSdkClientPinpointBrowser.typesRecencyDimensionMod.UnmarshalledRecencyDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledSegmentBehaviors extends SegmentBehaviors {
  
  /**
    * The recency of use.
    */
  @JSName("Recency")
  var Recency_UnmarshalledSegmentBehaviors: js.UndefOr[UnmarshalledRecencyDimension] = js.native
}
object UnmarshalledSegmentBehaviors {
  
  @scala.inline
  def apply(): UnmarshalledSegmentBehaviors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSegmentBehaviors]
  }
  
  @scala.inline
  implicit class UnmarshalledSegmentBehaviorsOps[Self <: UnmarshalledSegmentBehaviors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRecency(value: UnmarshalledRecencyDimension): Self = this.set("Recency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecency: Self = this.set("Recency", js.undefined)
  }
}
