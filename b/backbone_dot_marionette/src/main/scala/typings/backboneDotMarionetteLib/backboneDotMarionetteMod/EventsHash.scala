package typings
package backboneDotMarionetteLib.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- org.scalablytyped.runtime.StringDictionary because Already inherited */ trait EventsHash
  extends backboneLib.backboneMod.EventsHash

object EventsHash {
  @scala.inline
  def apply(
    StringDictionary: /* selector */ org.scalablytyped.runtime.StringDictionary[
      java.lang.String | (js.Function1[/* eventObject */ jqueryLib.JQueryNs.Event, scala.Unit])
    ] = null
  ): EventsHash = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[EventsHash]
  }
}

