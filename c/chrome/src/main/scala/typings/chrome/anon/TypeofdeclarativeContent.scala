package typings.chrome.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.chrome.chrome.declarativeContent.PageChangedEvent
import typings.chrome.chrome.declarativeContent.PageStateMatcher
import typings.chrome.chrome.declarativeContent.PageStateMatcherProperties
import typings.chrome.chrome.declarativeContent.SetIcon
import typings.chrome.chrome.declarativeContent.ShowPageAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofdeclarativeContent extends js.Object {
  var PageStateMatcher: Instantiable1[
    /* options */ PageStateMatcherProperties, 
    typings.chrome.chrome.declarativeContent.PageStateMatcher
  ]
  var PageStateMatcherProperties: Instantiable0[typings.chrome.chrome.declarativeContent.PageStateMatcherProperties]
  var SetIcon: Instantiable1[
    js.UndefOr[/* options */ ImageData], 
    typings.chrome.chrome.declarativeContent.SetIcon
  ]
  var ShowPageAction: Instantiable0[typings.chrome.chrome.declarativeContent.ShowPageAction]
  var onPageChanged: PageChangedEvent
}

object TypeofdeclarativeContent {
  @scala.inline
  def apply(
    PageStateMatcher: Instantiable1[/* options */ PageStateMatcherProperties, PageStateMatcher],
    PageStateMatcherProperties: Instantiable0[PageStateMatcherProperties],
    SetIcon: Instantiable1[js.UndefOr[/* options */ ImageData], SetIcon],
    ShowPageAction: Instantiable0[ShowPageAction],
    onPageChanged: PageChangedEvent
  ): TypeofdeclarativeContent = {
    val __obj = js.Dynamic.literal(PageStateMatcher = PageStateMatcher.asInstanceOf[js.Any], PageStateMatcherProperties = PageStateMatcherProperties.asInstanceOf[js.Any], SetIcon = SetIcon.asInstanceOf[js.Any], ShowPageAction = ShowPageAction.asInstanceOf[js.Any], onPageChanged = onPageChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofdeclarativeContent]
  }
}

