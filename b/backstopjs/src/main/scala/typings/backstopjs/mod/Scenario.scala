package typings.backstopjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scenario
  extends /* key */ StringDictionary[js.Any] {
  
   // Allow for custom properties.
  var clickSelector: js.UndefOr[String] = js.native
  
   // Click the specified DOM element prior to screenshot
  var clickSelectors: js.UndefOr[js.Array[String]] = js.native
  
   // Simulates multiple sequential click interactions
  var cookiePath: js.UndefOr[String] = js.native
  
   // Import cookies in JSON format
  var delay: js.UndefOr[Double] = js.native
  
   // Wait for x milliseconds
  var expect: js.UndefOr[Double] = js.native
  
   // Use with selectorExpansion true to expect number of results found
  var hideSelectors: js.UndefOr[js.Array[String]] = js.native
  
   // Selectors set to visibility: hidden
  var hoverSelector: js.UndefOr[String] = js.native
  
   // Move pointer over the given DOM element prior to screenshot
  var hoverSelectors: js.UndefOr[js.Array[String]] = js.native
  
   // Simulates multiple sequential hover interactions
  var keyPressSelector: js.UndefOr[KeypressSelector] = js.native
  
   // Press key in the DOM element prior to screenshot
  var keyPressSelectors: js.UndefOr[js.Array[KeypressSelector]] = js.native
  
   // Simulates multiple sequential keypress interactions
  var label: String = js.native
  
   // Tag saved with your reference images
  var misMatchThreshold: js.UndefOr[Double] = js.native
  
   // Percentage of different pixels allowed to pass test
  var onBeforeScript: js.UndefOr[String] = js.native
  
   // Used to set up browser state e.g. cookies
  var onReadyScript: js.UndefOr[String] = js.native
  
   // Used to modify UI state prior to screenshots e.g. hovers, clicks etc
  var postInteractionWait: js.UndefOr[Double] = js.native
  
   // Wait for selector (ms) after interacting with hover or click
  var readyEvent: js.UndefOr[String] = js.native
  
   // Wait until this string has been logged to the console
  var readySelector: js.UndefOr[String] = js.native
  
   // Wait until this selector exists before continuing
  var referenceUrl: js.UndefOr[String] = js.native
  
   // Specify a different state or environment when creating reference
  var removeSelectors: js.UndefOr[js.Array[String]] = js.native
  
   // Selectors set to display: none
  var requireSameDimensions: js.UndefOr[Boolean] = js.native
  
   // If true, take screenshots of all matching selector instances
  var scrollToSelector: js.UndefOr[String] = js.native
  
   // Selectors to capture
  var selectorExpansion: js.UndefOr[Boolean] = js.native
  
   // If true, any change in selector size will trigger a failure
  var selectors: js.UndefOr[js.Array[String]] = js.native
  
   // Scroll the specified DOM element into view prior to screenshots
  var url: String = js.native
  
   // The url of your app state
  var viewports: js.UndefOr[js.Array[Viewport]] = js.native
}
object Scenario {
  
  @scala.inline
  def apply(label: String, url: String): Scenario = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scenario]
  }
  
  @scala.inline
  implicit class ScenarioOps[Self <: Scenario] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickSelector(value: String): Self = this.set("clickSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickSelector: Self = this.set("clickSelector", js.undefined)
    
    @scala.inline
    def setClickSelectorsVarargs(value: String*): Self = this.set("clickSelectors", js.Array(value :_*))
    
    @scala.inline
    def setClickSelectors(value: js.Array[String]): Self = this.set("clickSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickSelectors: Self = this.set("clickSelectors", js.undefined)
    
    @scala.inline
    def setCookiePath(value: String): Self = this.set("cookiePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookiePath: Self = this.set("cookiePath", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setExpect(value: Double): Self = this.set("expect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpect: Self = this.set("expect", js.undefined)
    
    @scala.inline
    def setHideSelectorsVarargs(value: String*): Self = this.set("hideSelectors", js.Array(value :_*))
    
    @scala.inline
    def setHideSelectors(value: js.Array[String]): Self = this.set("hideSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideSelectors: Self = this.set("hideSelectors", js.undefined)
    
    @scala.inline
    def setHoverSelector(value: String): Self = this.set("hoverSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverSelector: Self = this.set("hoverSelector", js.undefined)
    
    @scala.inline
    def setHoverSelectorsVarargs(value: String*): Self = this.set("hoverSelectors", js.Array(value :_*))
    
    @scala.inline
    def setHoverSelectors(value: js.Array[String]): Self = this.set("hoverSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverSelectors: Self = this.set("hoverSelectors", js.undefined)
    
    @scala.inline
    def setKeyPressSelector(value: KeypressSelector): Self = this.set("keyPressSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPressSelector: Self = this.set("keyPressSelector", js.undefined)
    
    @scala.inline
    def setKeyPressSelectorsVarargs(value: KeypressSelector*): Self = this.set("keyPressSelectors", js.Array(value :_*))
    
    @scala.inline
    def setKeyPressSelectors(value: js.Array[KeypressSelector]): Self = this.set("keyPressSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPressSelectors: Self = this.set("keyPressSelectors", js.undefined)
    
    @scala.inline
    def setMisMatchThreshold(value: Double): Self = this.set("misMatchThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMisMatchThreshold: Self = this.set("misMatchThreshold", js.undefined)
    
    @scala.inline
    def setOnBeforeScript(value: String): Self = this.set("onBeforeScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBeforeScript: Self = this.set("onBeforeScript", js.undefined)
    
    @scala.inline
    def setOnReadyScript(value: String): Self = this.set("onReadyScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnReadyScript: Self = this.set("onReadyScript", js.undefined)
    
    @scala.inline
    def setPostInteractionWait(value: Double): Self = this.set("postInteractionWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostInteractionWait: Self = this.set("postInteractionWait", js.undefined)
    
    @scala.inline
    def setReadyEvent(value: String): Self = this.set("readyEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadyEvent: Self = this.set("readyEvent", js.undefined)
    
    @scala.inline
    def setReadySelector(value: String): Self = this.set("readySelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadySelector: Self = this.set("readySelector", js.undefined)
    
    @scala.inline
    def setReferenceUrl(value: String): Self = this.set("referenceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceUrl: Self = this.set("referenceUrl", js.undefined)
    
    @scala.inline
    def setRemoveSelectorsVarargs(value: String*): Self = this.set("removeSelectors", js.Array(value :_*))
    
    @scala.inline
    def setRemoveSelectors(value: js.Array[String]): Self = this.set("removeSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveSelectors: Self = this.set("removeSelectors", js.undefined)
    
    @scala.inline
    def setRequireSameDimensions(value: Boolean): Self = this.set("requireSameDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireSameDimensions: Self = this.set("requireSameDimensions", js.undefined)
    
    @scala.inline
    def setScrollToSelector(value: String): Self = this.set("scrollToSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToSelector: Self = this.set("scrollToSelector", js.undefined)
    
    @scala.inline
    def setSelectorExpansion(value: Boolean): Self = this.set("selectorExpansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectorExpansion: Self = this.set("selectorExpansion", js.undefined)
    
    @scala.inline
    def setSelectorsVarargs(value: String*): Self = this.set("selectors", js.Array(value :_*))
    
    @scala.inline
    def setSelectors(value: js.Array[String]): Self = this.set("selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectors: Self = this.set("selectors", js.undefined)
    
    @scala.inline
    def setViewportsVarargs(value: Viewport*): Self = this.set("viewports", js.Array(value :_*))
    
    @scala.inline
    def setViewports(value: js.Array[Viewport]): Self = this.set("viewports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewports: Self = this.set("viewports", js.undefined)
  }
}
