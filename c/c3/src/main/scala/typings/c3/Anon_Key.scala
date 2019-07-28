package typings.c3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var max: js.UndefOr[Double | StringDictionary[Double]] = js.undefined
  var min: js.UndefOr[Double | StringDictionary[Double]] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(max: Double | StringDictionary[Double] = null, min: Double | StringDictionary[Double] = null): Anon_Key = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Key]
  }
}

