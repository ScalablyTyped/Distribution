package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpEndpointDescription extends js.Object {
  /**
    * The name of the HTTP endpoint selected as the destination.
    */
  var Name: js.UndefOr[HttpEndpointName] = js.native
  /**
    * The URL of the HTTP endpoint selected as the destination.
    */
  var Url: js.UndefOr[HttpEndpointUrl] = js.native
}

object HttpEndpointDescription {
  @scala.inline
  def apply(): HttpEndpointDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpEndpointDescription]
  }
  @scala.inline
  implicit class HttpEndpointDescriptionOps[Self <: HttpEndpointDescription] (val x: Self) extends AnyVal {
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
    def setName(value: HttpEndpointName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setUrl(value: HttpEndpointUrl): Self = this.set("Url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
  }
  
}

