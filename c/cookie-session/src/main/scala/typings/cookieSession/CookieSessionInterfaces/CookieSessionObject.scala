package typings.cookieSession.CookieSessionInterfaces

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieSessionObject
  extends /* propertyName */ StringDictionary[js.Any] {
  /**
    * Is true if the session has been changed during the request.
    */
  var isChanged: js.UndefOr[Boolean] = js.native
  /**
    * Is true if the session is new.
    */
  var isNew: js.UndefOr[Boolean] = js.native
  /**
    * Determine if the session has been populated with data or is empty.
    */
  var isPopulated: js.UndefOr[Boolean] = js.native
}

object CookieSessionObject {
  @scala.inline
  def apply(): CookieSessionObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieSessionObject]
  }
  @scala.inline
  implicit class CookieSessionObjectOps[Self <: CookieSessionObject] (val x: Self) extends AnyVal {
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
    def setIsChanged(value: Boolean): Self = this.set("isChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsChanged: Self = this.set("isChanged", js.undefined)
    @scala.inline
    def setIsNew(value: Boolean): Self = this.set("isNew", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNew: Self = this.set("isNew", js.undefined)
    @scala.inline
    def setIsPopulated(value: Boolean): Self = this.set("isPopulated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPopulated: Self = this.set("isPopulated", js.undefined)
  }
  
}

