package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrimitive extends js.Object {
  /** Optional property to store any additional metadata for this primitive. */
  var metadata: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets the css cursor value when the primitive has events on it.
    * @returns css cursor string when primitive has events on it.
    */
  def getCursor(): java.lang.String
  /**
    * Gets whether the primitive is visible.
    * @returns A boolean indicating whether the primitive is visible or not.
    */
  def getVisible(): scala.Boolean
  /**
    * Sets the options for customizing the IPrimitive.
    * @param options The options for customizing the IPrimitive.
    */
  def setOptions(options: IPrimitiveOptions): scala.Unit
}

object IPrimitive {
  @scala.inline
  def apply(
    getCursor: js.Function0[java.lang.String],
    getVisible: js.Function0[scala.Boolean],
    setOptions: js.Function1[IPrimitiveOptions, scala.Unit],
    metadata: js.Any = null
  ): IPrimitive = {
    val __obj = js.Dynamic.literal(getCursor = getCursor, getVisible = getVisible, setOptions = setOptions)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[IPrimitive]
  }
}

