package typings.camo.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentSchema extends /**
		 * Index signature
		 */
/* property */ StringDictionary[SchemaType] {
  /**
  		 * Document id
  		 */
  var _id: js.UndefOr[String] = js.undefined
}

object DocumentSchema {
  @scala.inline
  def apply(
    StringDictionary: /**
  		 * Index signature
  		 */
  /* property */ StringDictionary[SchemaType] = null,
    _id: String = null
  ): DocumentSchema = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSchema]
  }
}

