package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RtmpOutputSettings extends StObject {
  
  /**
    * If set to verifyAuthenticity, verify the tls certificate chain to a trusted Certificate Authority (CA).  This will cause rtmps outputs with self-signed certificates to fail.
    */
  var CertificateMode: js.UndefOr[RtmpOutputCertificateMode] = js.undefined
  
  /**
    * Number of seconds to wait before retrying a connection to the Flash Media server if the connection is lost.
    */
  var ConnectionRetryInterval: js.UndefOr[integerMin1] = js.undefined
  
  /**
    * The RTMP endpoint excluding the stream name (eg. rtmp://host/appname). For connection to Akamai, a username and password must be supplied. URI fields accept format identifiers.
    */
  var Destination: OutputLocationRef
  
  /**
    * Number of retry attempts.
    */
  var NumRetries: js.UndefOr[integerMin0] = js.undefined
}
object RtmpOutputSettings {
  
  @scala.inline
  def apply(Destination: OutputLocationRef): RtmpOutputSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[RtmpOutputSettings]
  }
  
  @scala.inline
  implicit class RtmpOutputSettingsMutableBuilder[Self <: RtmpOutputSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateMode(value: RtmpOutputCertificateMode): Self = StObject.set(x, "CertificateMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateModeUndefined: Self = StObject.set(x, "CertificateMode", js.undefined)
    
    @scala.inline
    def setConnectionRetryInterval(value: integerMin1): Self = StObject.set(x, "ConnectionRetryInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionRetryIntervalUndefined: Self = StObject.set(x, "ConnectionRetryInterval", js.undefined)
    
    @scala.inline
    def setDestination(value: OutputLocationRef): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumRetries(value: integerMin0): Self = StObject.set(x, "NumRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumRetriesUndefined: Self = StObject.set(x, "NumRetries", js.undefined)
  }
}
