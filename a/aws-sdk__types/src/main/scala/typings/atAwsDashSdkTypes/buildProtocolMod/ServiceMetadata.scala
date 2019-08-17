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
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, endpointPrefix = endpointPrefix, protocol = protocol, serviceFullName = serviceFullName, signatureVersion = signatureVersion, uid = uid)
    if (jsonVersion != null) __obj.updateDynamic("jsonVersion")(jsonVersion)
    if (serviceAbbreviation != null) __obj.updateDynamic("serviceAbbreviation")(serviceAbbreviation)
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId)
    if (signingName != null) __obj.updateDynamic("signingName")(signingName)
    if (targetPrefix != null) __obj.updateDynamic("targetPrefix")(targetPrefix)
    if (timestampFormat != null) __obj.updateDynamic("timestampFormat")(timestampFormat)
    if (xmlNamespace != null) __obj.updateDynamic("xmlNamespace")(xmlNamespace)
    __obj.asInstanceOf[ServiceMetadata]
  }
}

