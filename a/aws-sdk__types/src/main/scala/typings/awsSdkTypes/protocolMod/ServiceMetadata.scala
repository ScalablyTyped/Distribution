package typings.awsSdkTypes.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceMetadata extends js.Object {
  var apiVersion: java.lang.String = js.native
  var endpointPrefix: java.lang.String = js.native
  var jsonVersion: js.UndefOr[java.lang.String] = js.native
  var protocol: SupportedProtocol = js.native
  var serviceAbbreviation: js.UndefOr[java.lang.String] = js.native
  var serviceFullName: java.lang.String = js.native
  var serviceId: js.UndefOr[java.lang.String] = js.native
  var signatureVersion: SupportedSignatureVersion = js.native
  var signingName: js.UndefOr[java.lang.String] = js.native
  /**
    * Required for json-rpc services.
    */
  var targetPrefix: js.UndefOr[java.lang.String] = js.native
  /**
    * Sometimes specified when format differs from protocol default.
    */
  var timestampFormat: js.UndefOr[java.lang.String] = js.native
  var uid: java.lang.String = js.native
  /**
    * Required for query services.
    */
  var xmlNamespace: js.UndefOr[java.lang.String] = js.native
}

object ServiceMetadata {
  @scala.inline
  def apply(
    apiVersion: java.lang.String,
    endpointPrefix: java.lang.String,
    protocol: SupportedProtocol,
    serviceFullName: java.lang.String,
    signatureVersion: SupportedSignatureVersion,
    uid: java.lang.String
  ): ServiceMetadata = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], endpointPrefix = endpointPrefix.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], serviceFullName = serviceFullName.asInstanceOf[js.Any], signatureVersion = signatureVersion.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceMetadata]
  }
  @scala.inline
  implicit class ServiceMetadataOps[Self <: ServiceMetadata] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: java.lang.String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpointPrefix(value: java.lang.String): Self = this.set("endpointPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: SupportedProtocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceFullName(value: java.lang.String): Self = this.set("serviceFullName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignatureVersion(value: SupportedSignatureVersion): Self = this.set("signatureVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: java.lang.String): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def setJsonVersion(value: java.lang.String): Self = this.set("jsonVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonVersion: Self = this.set("jsonVersion", js.undefined)
    @scala.inline
    def setServiceAbbreviation(value: java.lang.String): Self = this.set("serviceAbbreviation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceAbbreviation: Self = this.set("serviceAbbreviation", js.undefined)
    @scala.inline
    def setServiceId(value: java.lang.String): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceId: Self = this.set("serviceId", js.undefined)
    @scala.inline
    def setSigningName(value: java.lang.String): Self = this.set("signingName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigningName: Self = this.set("signingName", js.undefined)
    @scala.inline
    def setTargetPrefix(value: java.lang.String): Self = this.set("targetPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetPrefix: Self = this.set("targetPrefix", js.undefined)
    @scala.inline
    def setTimestampFormat(value: java.lang.String): Self = this.set("timestampFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestampFormat: Self = this.set("timestampFormat", js.undefined)
    @scala.inline
    def setXmlNamespace(value: java.lang.String): Self = this.set("xmlNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlNamespace: Self = this.set("xmlNamespace", js.undefined)
  }
  
}

