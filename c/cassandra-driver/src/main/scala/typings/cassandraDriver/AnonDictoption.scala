package typings.cassandraDriver

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictoption
  extends /* option */ StringDictionary[js.Any] {
  var `class`: js.UndefOr[String] = js.undefined
}

object AnonDictoption {
  @scala.inline
  def apply(StringDictionary: /* option */ StringDictionary[js.Any] = null, `class`: String = null): AnonDictoption = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictoption]
  }
}

