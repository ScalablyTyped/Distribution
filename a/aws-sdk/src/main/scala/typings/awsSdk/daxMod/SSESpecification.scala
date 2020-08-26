package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSESpecification extends js.Object {
  /**
    * Indicates whether server-side encryption is enabled (true) or disabled (false) on the cluster.
    */
  var Enabled: SSEEnabled = js.native
}

object SSESpecification {
  @scala.inline
  def apply(Enabled: SSEEnabled): SSESpecification = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSESpecification]
  }
  @scala.inline
  implicit class SSESpecificationOps[Self <: SSESpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnabled(value: SSEEnabled): Self = this.set("Enabled", value.asInstanceOf[js.Any])
  }
  
}

