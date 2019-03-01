package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnPageChanged extends js.Object {
  var PageStateMatcher: org.scalablytyped.runtime.Instantiable1[
    /* options */ chromeLib.chromeNs.declarativeContentNs.PageStateMatcherProperties, 
    chromeLib.chromeNs.declarativeContentNs.PageStateMatcher
  ]
  var PageStateMatcherProperties: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.declarativeContentNs.PageStateMatcherProperties]
  var ShowPageAction: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.declarativeContentNs.ShowPageAction]
  var onPageChanged: chromeLib.chromeNs.declarativeContentNs.PageChangedEvent
}

object Anon_OnPageChanged {
  @scala.inline
  def apply(
    PageStateMatcher: org.scalablytyped.runtime.Instantiable1[
      /* options */ chromeLib.chromeNs.declarativeContentNs.PageStateMatcherProperties, 
      chromeLib.chromeNs.declarativeContentNs.PageStateMatcher
    ],
    PageStateMatcherProperties: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.declarativeContentNs.PageStateMatcherProperties],
    ShowPageAction: org.scalablytyped.runtime.Instantiable0[chromeLib.chromeNs.declarativeContentNs.ShowPageAction],
    onPageChanged: chromeLib.chromeNs.declarativeContentNs.PageChangedEvent
  ): Anon_OnPageChanged = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PageStateMatcher")(PageStateMatcher)
    __obj.updateDynamic("PageStateMatcherProperties")(PageStateMatcherProperties)
    __obj.updateDynamic("ShowPageAction")(ShowPageAction)
    __obj.updateDynamic("onPageChanged")(onPageChanged)
    __obj.asInstanceOf[Anon_OnPageChanged]
  }
}

