package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicFilter extends StObject {
  
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
  implicit class TopicFilterMutableBuilder[Self <: TopicFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopicName(value: TopicName): Self = StObject.set(x, "TopicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicNameUndefined: Self = StObject.set(x, "TopicName", js.undefined)
    
    @scala.inline
    def setUseDefaultIfPreferenceUnavailable(value: UseDefaultIfPreferenceUnavailable): Self = StObject.set(x, "UseDefaultIfPreferenceUnavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDefaultIfPreferenceUnavailableUndefined: Self = StObject.set(x, "UseDefaultIfPreferenceUnavailable", js.undefined)
  }
}
