package typings.cote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequesterAdvertisement extends Advertisement {
  /**
    * Request types that a Requester can send.
    */
  var requests: js.UndefOr[js.Array[String]] = js.native
}

object RequesterAdvertisement {
  @scala.inline
  def apply(name: String): RequesterAdvertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequesterAdvertisement]
  }
  @scala.inline
  implicit class RequesterAdvertisementOps[Self <: RequesterAdvertisement] (val x: Self) extends AnyVal {
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
    def setRequestsVarargs(value: String*): Self = this.set("requests", js.Array(value :_*))
    @scala.inline
    def setRequests(value: js.Array[String]): Self = this.set("requests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequests: Self = this.set("requests", js.undefined)
  }
  
}

