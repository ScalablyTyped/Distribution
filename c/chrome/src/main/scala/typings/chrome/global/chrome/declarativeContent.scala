package typings.chrome.global.chrome

import typings.chrome.anon.ImageData
import typings.chrome.chrome.declarativeContent.PageChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Declarative Content
////////////////////
/**
  * Use the chrome.declarativeContent API to take actions depending on the content of a page, without requiring permission to read the page's content.
  * Availability: Since Chrome 33.
  * Permissions:  "declarativeContent"
  */
object declarativeContent {
  
  @JSGlobal("chrome.declarativeContent")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.declarativeContent.PageStateMatcher")
  @js.native
  class PageStateMatcher protected ()
    extends StObject
       with typings.chrome.chrome.declarativeContent.PageStateMatcher {
    def this(options: typings.chrome.chrome.declarativeContent.PageStateMatcherProperties) = this()
  }
  
  @JSGlobal("chrome.declarativeContent.PageStateMatcherProperties")
  @js.native
  class PageStateMatcherProperties ()
    extends StObject
       with typings.chrome.chrome.declarativeContent.PageStateMatcherProperties
  
  @JSGlobal("chrome.declarativeContent.SetIcon")
  @js.native
  class SetIcon ()
    extends StObject
       with typings.chrome.chrome.declarativeContent.SetIcon {
    def this(options: ImageData) = this()
  }
  
  @JSGlobal("chrome.declarativeContent.ShowPageAction")
  @js.native
  class ShowPageAction ()
    extends StObject
       with typings.chrome.chrome.declarativeContent.ShowPageAction
  
  @JSGlobal("chrome.declarativeContent.onPageChanged")
  @js.native
  def onPageChanged: PageChangedEvent = js.native
  @scala.inline
  def onPageChanged_=(x: PageChangedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPageChanged")(x.asInstanceOf[js.Any])
}
