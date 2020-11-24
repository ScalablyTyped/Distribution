package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicFilter extends js.Object {
  
  /**
    * The name of a topic on which you wish to apply the filter.
    */
  var TopicName: js.UndefOr[typings.awsSdk.sesv2Mod.TopicName] = js.native
  
  /**
    * Notes that the default subscription status should be applied to a contact because the contact has not noted their preference for subscribing to a topic.
    */
  var UseDefaultIfPreferenceUnavailable: js.UndefOr[typings.awsSdk.sesv2Mod.UseDefaultIfPreferenceUnavailable] = js.native
}
object TopicFilter {
  
  @scala.inline
  def apply(): TopicFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicFilter]
  }
  
  @scala.inline
  implicit class TopicFilterOps[Self <: TopicFilter] (val x: Self) extends AnyVal {
    
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
    def setTopicName(value: TopicName): Self = this.set("TopicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicName: Self = this.set("TopicName", js.undefined)
    
    @scala.inline
    def setUseDefaultIfPreferenceUnavailable(value: UseDefaultIfPreferenceUnavailable): Self = this.set("UseDefaultIfPreferenceUnavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDefaultIfPreferenceUnavailable: Self = this.set("UseDefaultIfPreferenceUnavailable", js.undefined)
  }
}
