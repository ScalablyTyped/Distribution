package typings.blocks

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionPrototype
  extends /* propertyName */ StringDictionary[js.Any] {
  var options: js.UndefOr[Anon_Create] = js.undefined
}

object CollectionPrototype {
  @scala.inline
  def apply(StringDictionary: /* propertyName */ StringDictionary[js.Any] = null, options: Anon_Create = null): CollectionPrototype = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[CollectionPrototype]
  }
}

