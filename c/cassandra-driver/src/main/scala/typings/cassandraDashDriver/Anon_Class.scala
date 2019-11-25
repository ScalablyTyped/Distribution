package typings.cassandraDashDriver

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Class
  extends /* option */ StringDictionary[js.Any] {
  var `class`: js.UndefOr[String] = js.undefined
}

object Anon_Class {
  @scala.inline
  def apply(StringDictionary: /* option */ StringDictionary[js.Any] = null, `class`: String = null): Anon_Class = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Class]
  }
}

