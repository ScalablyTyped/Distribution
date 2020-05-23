package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery.TriggeredEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- org.scalablytyped.runtime.StringDictionary because Already inherited */ trait EventsHash
  extends typings.backbone.mod.EventsHash

object EventsHash {
  @scala.inline
  def apply(
    StringDictionary: StringDictionary[
      String | (js.Function1[/* eventObject */ TriggeredEvent[js.Any, js.Any, js.Any, js.Any], Unit])
    ] = null
  ): EventsHash = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[EventsHash]
  }
}

