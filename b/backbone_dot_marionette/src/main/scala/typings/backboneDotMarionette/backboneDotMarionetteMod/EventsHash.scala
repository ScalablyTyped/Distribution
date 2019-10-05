package typings.backboneDotMarionette.backboneDotMarionetteMod

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.Fn_EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- org.scalablytyped.runtime.StringDictionary because Already inherited */ trait EventsHash
  extends typings.backbone.backboneMod.EventsHash

object EventsHash {
  @scala.inline
  def apply(StringDictionary: StringDictionary[String | Fn_EventObject] = null): EventsHash = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[EventsHash]
  }
}

