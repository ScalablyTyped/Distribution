package typings.cassandraDriver.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictoption
  extends /* key */ StringDictionary[js.Any] {
  var `class`: js.UndefOr[String] = js.undefined
}

object Dictoption {
  @scala.inline
  def apply(StringDictionary: /* name */ StringDictionary[js.Any] = null, `class`: String = null): Dictoption = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictoption]
  }
}

