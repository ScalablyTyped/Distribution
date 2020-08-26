package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerTlsCertificateSummary extends js.Object {
  /**
    * When true, the SSL/TLS certificate is attached to the Lightsail load balancer.
    */
  var isAttached: js.UndefOr[Boolean] = js.native
  /**
    * The name of the SSL/TLS certificate.
    */
  var name: js.UndefOr[ResourceName] = js.native
}

object LoadBalancerTlsCertificateSummary {
  @scala.inline
  def apply(): LoadBalancerTlsCertificateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerTlsCertificateSummary]
  }
  @scala.inline
  implicit class LoadBalancerTlsCertificateSummaryOps[Self <: LoadBalancerTlsCertificateSummary] (val x: Self) extends AnyVal {
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
    def setIsAttached(value: Boolean): Self = this.set("isAttached", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAttached: Self = this.set("isAttached", js.undefined)
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

