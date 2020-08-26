package typings.awsSdkTypes.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeHttpOptions extends HttpOptions {
  var connectionTimeout: js.UndefOr[Double] = js.native
  var socketTimeout: js.UndefOr[Double] = js.native
}

object NodeHttpOptions {
  @scala.inline
  def apply(): NodeHttpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeHttpOptions]
  }
  @scala.inline
  implicit class NodeHttpOptionsOps[Self <: NodeHttpOptions] (val x: Self) extends AnyVal {
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
    def setConnectionTimeout(value: Double): Self = this.set("connectionTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionTimeout: Self = this.set("connectionTimeout", js.undefined)
    @scala.inline
    def setSocketTimeout(value: Double): Self = this.set("socketTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocketTimeout: Self = this.set("socketTimeout", js.undefined)
  }
  
}

