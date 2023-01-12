package typings.dashjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dashjs.anon.PinMediaKeyMessageTypestr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectionData extends StObject {
  
  /** The audio robustness level (see https://www.w3.org/TR/encrypted-media/#dom-mediakeysystemmediacapability-robustness) */
  var audioRobustness: js.UndefOr[String] = js.undefined
  
  /**
    * Defines a set of clear keys that are available to the key system.
    * Object properties are base64-encoded keyIDs (with no padding).
    * Corresponding property values are keys, base64-encoded (no padding).
    */
  var clearkeys: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /** Distinctive identifier (see https://www.w3.org/TR/encrypted-media/#dom-mediakeysystemconfiguration-distinctiveidentifier) */
  var distinctiveIdentifier: js.UndefOr[String] = js.undefined
  
  /** HTTP headers to add to the license request */
  var httpRequestHeaders: js.UndefOr[js.Object] = js.undefined
  
  /** Timeout (in ms) for the license requests */
  var httpTimeout: js.UndefOr[Double] = js.undefined
  
  /** Priority level of the key system to be selected (0 is the highest prority, -1 for undefined priority) */
  var priority: js.UndefOr[Double] = js.undefined
  
  /** The licenser server certificate as a BASE64 string representation of the binary stream (see https://www.w3.org/TR/encrypted-media/#dom-mediakeys-setservercertificate) */
  var serverCertificate: js.UndefOr[String] = js.undefined
  
  /**
    * A license server URL to use with this key system.
    * When specified as a string, a single URL will be used regardless of message type.
    * When specified as an object, the object will have property names for each message
    * type with the corresponding property value being the URL to use for
    * messages of that type
    */
  var serverURL: js.UndefOr[String | PinMediaKeyMessageTypestr] = js.undefined
  
  /** The session id (see https://www.w3.org/TR/encrypted-media/#session-id) */
  var sessionId: js.UndefOr[String] = js.undefined
  
  /** The session type (see https://www.w3.org/TR/encrypted-media/#dom-mediakeysessiontype) */
  var sessionType: js.UndefOr[String] = js.undefined
  
  /** The video robustness level (see https://www.w3.org/TR/encrypted-media/#dom-mediakeysystemmediacapability-robustness) */
  var videoRobustness: js.UndefOr[String] = js.undefined
  
  /** Wether license request is made using credentials */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object ProtectionData {
  
  inline def apply(): ProtectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtectionData] (val x: Self) extends AnyVal {
    
    inline def setAudioRobustness(value: String): Self = StObject.set(x, "audioRobustness", value.asInstanceOf[js.Any])
    
    inline def setAudioRobustnessUndefined: Self = StObject.set(x, "audioRobustness", js.undefined)
    
    inline def setClearkeys(value: StringDictionary[String]): Self = StObject.set(x, "clearkeys", value.asInstanceOf[js.Any])
    
    inline def setClearkeysUndefined: Self = StObject.set(x, "clearkeys", js.undefined)
    
    inline def setDistinctiveIdentifier(value: String): Self = StObject.set(x, "distinctiveIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDistinctiveIdentifierUndefined: Self = StObject.set(x, "distinctiveIdentifier", js.undefined)
    
    inline def setHttpRequestHeaders(value: js.Object): Self = StObject.set(x, "httpRequestHeaders", value.asInstanceOf[js.Any])
    
    inline def setHttpRequestHeadersUndefined: Self = StObject.set(x, "httpRequestHeaders", js.undefined)
    
    inline def setHttpTimeout(value: Double): Self = StObject.set(x, "httpTimeout", value.asInstanceOf[js.Any])
    
    inline def setHttpTimeoutUndefined: Self = StObject.set(x, "httpTimeout", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setServerCertificate(value: String): Self = StObject.set(x, "serverCertificate", value.asInstanceOf[js.Any])
    
    inline def setServerCertificateUndefined: Self = StObject.set(x, "serverCertificate", js.undefined)
    
    inline def setServerURL(value: String | PinMediaKeyMessageTypestr): Self = StObject.set(x, "serverURL", value.asInstanceOf[js.Any])
    
    inline def setServerURLUndefined: Self = StObject.set(x, "serverURL", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setSessionType(value: String): Self = StObject.set(x, "sessionType", value.asInstanceOf[js.Any])
    
    inline def setSessionTypeUndefined: Self = StObject.set(x, "sessionType", js.undefined)
    
    inline def setVideoRobustness(value: String): Self = StObject.set(x, "videoRobustness", value.asInstanceOf[js.Any])
    
    inline def setVideoRobustnessUndefined: Self = StObject.set(x, "videoRobustness", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
