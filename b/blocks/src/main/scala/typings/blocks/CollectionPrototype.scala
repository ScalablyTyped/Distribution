package typings.blocks

import org.scalablytyped.runtime.StringDictionary
import typings.blocks.anon.Create
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionPrototype
  extends /* propertyName */ StringDictionary[js.Any] {
  var options: js.UndefOr[Create] = js.undefined
}

object CollectionPrototype {
  @scala.inline
  def apply(StringDictionary: /* name */ StringDictionary[js.Any] = null, options: Create = null): CollectionPrototype = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionPrototype]
  }
}

