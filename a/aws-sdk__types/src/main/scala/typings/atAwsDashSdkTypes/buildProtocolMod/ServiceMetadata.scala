package typings.atAwsDashSdkTypes.buildProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceMetadata extends js.Object {
  var apiVersion: java.lang.String
  var endpointPrefix: java.lang.String
  var jsonVersion: js.UndefOr[java.lang.String] = js.undefined
  var protocol: SupportedProtocol
  var serviceAbbreviation: js.UndefOr[java.lang.String] = js.undefined
  var serviceFullName: java.lang.String
  var serviceId: js.UndefOr[java.lang.String] = js.undefined
  var signatureVersion: SupportedSignatureVersion
  var signingName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Required for json-rpc services.
    */
  var targetPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sometimes specified when format differs from protocol default.
    */
  var timestampFormat: js.UndefOr[java.lang.String] = js.undefined
  var uid: java.lang.String
  /**
    * Required for query services.
    */
  var xmlNamespace: js.UndefOr[java.lang.String] = js.undefined
}

object ServiceMetadata {
  @scala.inline
  def apply(
    apiVersion: java.lang.String,
    endpointPrefix: java.lang.String,
    protocol: SupportedProtocol,
    serviceFullName: java.lang.String,
    signatureVersion: SupportedSignatureVersion,
    uid: java.lang.String,
    jsonVersion: java.lang.String = null,
    serviceAbbreviation: java.lang.String = null,
    serviceId: java.lang.String = null,
    signingName: java.lang.String = null,
    targetPrefix: java.lang.String = null,
    timestampFormat: java.lang.String = null,
    xmlNamespace: java.lang.String = null
  ): ServiceMetadata = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], endpointPrefix = endpointPrefix.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], serviceFullName = serviceFullName.asInstanceOf[js.Any], signatureVersion = signatureVersion.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    if (jsonVersion != null) __obj.updateDynamic("jsonVersion")(jsonVersion.asInstanceOf[js.Any])
    if (serviceAbbreviation != null) __obj.updateDynamic("serviceAbbreviation")(serviceAbbreviation.asInstanceOf[js.Any])
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId.asInstanceOf[js.Any])
    if (signingName != null) __obj.updateDynamic("signingName")(signingName.asInstanceOf[js.Any])
    if (targetPrefix != null) __obj.updateDynamic("targetPrefix")(targetPrefix.asInstanceOf[js.Any])
    if (timestampFormat != null) __obj.updateDynamic("timestampFormat")(timestampFormat.asInstanceOf[js.Any])
    if (xmlNamespace != null) __obj.updateDynamic("xmlNamespace")(xmlNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceMetadata]
  }
}

