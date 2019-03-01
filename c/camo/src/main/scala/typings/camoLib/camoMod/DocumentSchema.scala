package typings
package camoLib.camoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentSchema
  extends /**
		 * Index signature
		 */
/* property */ org.scalablytyped.runtime.StringDictionary[SchemaType] {
  /**
  		 * Document id
  		 */
  var _id: js.UndefOr[java.lang.String] = js.undefined
}

object DocumentSchema {
  @scala.inline
  def apply(
    StringDictionary: /**
  		 * Index signature
  		 */
  /* property */ org.scalablytyped.runtime.StringDictionary[SchemaType] = null,
    _id: java.lang.String = null
  ): DocumentSchema = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    __obj.asInstanceOf[DocumentSchema]
  }
}

