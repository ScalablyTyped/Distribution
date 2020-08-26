package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrimitive extends js.Object {
  /** Optional property to store any additional metadata for this primitive. */
  var metadata: js.UndefOr[js.Any] = js.native
  /**
    * Gets the css cursor value when the primitive has events on it.
    * @returns css cursor string when primitive has events on it.
    */
  def getCursor(): String = js.native
  /**
    * Gets whether the primitive is visible.
    * @returns A boolean indicating whether the primitive is visible or not.
    */
  def getVisible(): Boolean = js.native
  /**
    * Sets the options for customizing the IPrimitive.
    * @param options The options for customizing the IPrimitive.
    */
  def setOptions(options: IPrimitiveOptions): Unit = js.native
}

object IPrimitive {
  @scala.inline
  def apply(getCursor: () => String, getVisible: () => Boolean, setOptions: IPrimitiveOptions => Unit): IPrimitive = {
    val __obj = js.Dynamic.literal(getCursor = js.Any.fromFunction0(getCursor), getVisible = js.Any.fromFunction0(getVisible), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[IPrimitive]
  }
  @scala.inline
  implicit class IPrimitiveOps[Self <: IPrimitive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetCursor(value: () => String): Self = this.set("getCursor", js.Any.fromFunction0(value))
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = this.set("getVisible", js.Any.fromFunction0(value))
    @scala.inline
    def setSetOptions(value: IPrimitiveOptions => Unit): Self = this.set("setOptions", js.Any.fromFunction1(value))
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
  
}

