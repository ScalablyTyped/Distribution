package typings.chrome

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.chrome.chrome.declarativeContent.PageChangedEvent
import typings.chrome.chrome.declarativeContent.PageStateMatcher
import typings.chrome.chrome.declarativeContent.PageStateMatcherProperties
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
  var ShowPageAction: Instantiable0[typings.chrome.chrome.declarativeContent.ShowPageAction]
  var onPageChanged: PageChangedEvent
}

object TypeofdeclarativeContent {
  @scala.inline
  def apply(
    PageStateMatcher: Instantiable1[/* options */ PageStateMatcherProperties, PageStateMatcher],
    PageStateMatcherProperties: Instantiable0[PageStateMatcherProperties],
    ShowPageAction: Instantiable0[ShowPageAction],
    onPageChanged: PageChangedEvent
  ): TypeofdeclarativeContent = {
    val __obj = js.Dynamic.literal(PageStateMatcher = PageStateMatcher, PageStateMatcherProperties = PageStateMatcherProperties, ShowPageAction = ShowPageAction, onPageChanged = onPageChanged)
  
    __obj.asInstanceOf[TypeofdeclarativeContent]
  }
}

