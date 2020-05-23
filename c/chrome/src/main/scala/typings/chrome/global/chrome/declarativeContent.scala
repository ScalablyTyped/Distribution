package typings.chrome.global.chrome

import typings.chrome.anon.ImageData
import typings.chrome.chrome.declarativeContent.PageChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Declarative Content
////////////////////
/**
  * Use the chrome.declarativeContent API to take actions depending on the content of a page, without requiring permission to read the page's content.
  * Availability: Since Chrome 33.
  * Permissions:  "declarativeContent"
  */
@JSGlobal("chrome.declarativeContent")
@js.native
object declarativeContent extends js.Object {
  @js.native
  class PageStateMatcher protected ()
    extends typings.chrome.chrome.declarativeContent.PageStateMatcher {
    def this(options: typings.chrome.chrome.declarativeContent.PageStateMatcherProperties) = this()
  }
  
  @js.native
  class PageStateMatcherProperties ()
    extends typings.chrome.chrome.declarativeContent.PageStateMatcherProperties
  
  @js.native
  class SetIcon ()
    extends typings.chrome.chrome.declarativeContent.SetIcon {
    def this(options: ImageData) = this()
  }
  
  @js.native
  class ShowPageAction ()
    extends typings.chrome.chrome.declarativeContent.ShowPageAction
  
  var onPageChanged: PageChangedEvent = js.native
}

