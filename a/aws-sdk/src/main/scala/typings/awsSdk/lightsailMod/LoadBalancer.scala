package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancer extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * A string to string map of the configuration options for your load balancer. Valid values are listed below.
    */
  var configurationOptions: js.UndefOr[LoadBalancerConfigurationOptions] = js.native
  /**
    * The date when your load balancer was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  /**
    * The DNS name of your Lightsail load balancer.
    */
  var dnsName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The path you specified to perform your health checks. If no path is specified, the load balancer tries to make a request to the default (root) page.
    */
  var healthCheckPath: js.UndefOr[NonEmptyString] = js.native
  /**
    * An array of InstanceHealthSummary objects describing the health of the load balancer.
    */
  var instanceHealthSummary: js.UndefOr[InstanceHealthSummaryList] = js.native
  /**
    * The port where the load balancer will direct traffic to your Lightsail instances. For HTTP traffic, it's port 80. For HTTPS traffic, it's port 443.
    */
  var instancePort: js.UndefOr[integer] = js.native
  /**
    * The AWS Region where your load balancer was created (e.g., us-east-2a). Lightsail automatically creates your load balancer across Availability Zones.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The name of the load balancer (e.g., my-load-balancer).
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The protocol you have enabled for your load balancer. Valid values are below. You can't just have HTTP_HTTPS, but you can have just HTTP.
    */
  var protocol: js.UndefOr[LoadBalancerProtocol] = js.native
  /**
    * An array of public port settings for your load balancer. For HTTP, use port 80. For HTTPS, use port 443.
    */
  var publicPorts: js.UndefOr[PortList] = js.native
  /**
    * The resource type (e.g., LoadBalancer.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * The status of your load balancer. Valid values are below.
    */
  var state: js.UndefOr[LoadBalancerState] = js.native
  /**
    * The support code. Include this code in your email to support when you have questions about your Lightsail load balancer. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * An array of LoadBalancerTlsCertificateSummary objects that provide additional information about the SSL/TLS certificates. For example, if true, the certificate is attached to the load balancer.
    */
  var tlsCertificateSummaries: js.UndefOr[LoadBalancerTlsCertificateSummaryList] = js.native
}

object LoadBalancer {
  @scala.inline
  def apply(): LoadBalancer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancer]
  }
  @scala.inline
  implicit class LoadBalancerOps[Self <: LoadBalancer] (val x: Self) extends AnyVal {
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
    def setArn(value: NonEmptyString): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setConfigurationOptions(value: LoadBalancerConfigurationOptions): Self = this.set("configurationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationOptions: Self = this.set("configurationOptions", js.undefined)
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setDnsName(value: NonEmptyString): Self = this.set("dnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsName: Self = this.set("dnsName", js.undefined)
    @scala.inline
    def setHealthCheckPath(value: NonEmptyString): Self = this.set("healthCheckPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthCheckPath: Self = this.set("healthCheckPath", js.undefined)
    @scala.inline
    def setInstanceHealthSummaryVarargs(value: InstanceHealthSummary*): Self = this.set("instanceHealthSummary", js.Array(value :_*))
    @scala.inline
    def setInstanceHealthSummary(value: InstanceHealthSummaryList): Self = this.set("instanceHealthSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceHealthSummary: Self = this.set("instanceHealthSummary", js.undefined)
    @scala.inline
    def setInstancePort(value: integer): Self = this.set("instancePort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstancePort: Self = this.set("instancePort", js.undefined)
    @scala.inline
    def setLocation(value: ResourceLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProtocol(value: LoadBalancerProtocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setPublicPortsVarargs(value: Port*): Self = this.set("publicPorts", js.Array(value :_*))
    @scala.inline
    def setPublicPorts(value: PortList): Self = this.set("publicPorts", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicPorts: Self = this.set("publicPorts", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    @scala.inline
    def setState(value: LoadBalancerState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setSupportCode(value: String): Self = this.set("supportCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportCode: Self = this.set("supportCode", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTlsCertificateSummariesVarargs(value: LoadBalancerTlsCertificateSummary*): Self = this.set("tlsCertificateSummaries", js.Array(value :_*))
    @scala.inline
    def setTlsCertificateSummaries(value: LoadBalancerTlsCertificateSummaryList): Self = this.set("tlsCertificateSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTlsCertificateSummaries: Self = this.set("tlsCertificateSummaries", js.undefined)
  }
  
}

