package typings.dashjs.mod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeySystem extends StObject {
  
  def getCDMData(): ArrayBuffer | Null
  
  def getInitData(cp: js.Object): ArrayBuffer
  
  def getLicenseRequestFromMessage(message: ArrayBuffer): Uint8Array
  
  def getLicenseServerURLFromInitData(initData: ArrayBuffer): String | Null
  
  def getRequestHeadersFromMessage(message: ArrayBuffer): js.Object | Null
  
  def getSessionId(): String | Null
  
  var schemeIdURI: String
  
  var systemString: String
  
  var uuid: String
}
object KeySystem {
  
  @scala.inline
  def apply(
    getCDMData: () => ArrayBuffer | Null,
    getInitData: js.Object => ArrayBuffer,
    getLicenseRequestFromMessage: ArrayBuffer => Uint8Array,
    getLicenseServerURLFromInitData: ArrayBuffer => String | Null,
    getRequestHeadersFromMessage: ArrayBuffer => js.Object | Null,
    getSessionId: () => String | Null,
    schemeIdURI: String,
    systemString: String,
    uuid: String
  ): KeySystem = {
    val __obj = js.Dynamic.literal(getCDMData = js.Any.fromFunction0(getCDMData), getInitData = js.Any.fromFunction1(getInitData), getLicenseRequestFromMessage = js.Any.fromFunction1(getLicenseRequestFromMessage), getLicenseServerURLFromInitData = js.Any.fromFunction1(getLicenseServerURLFromInitData), getRequestHeadersFromMessage = js.Any.fromFunction1(getRequestHeadersFromMessage), getSessionId = js.Any.fromFunction0(getSessionId), schemeIdURI = schemeIdURI.asInstanceOf[js.Any], systemString = systemString.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeySystem]
  }
  
  @scala.inline
  implicit class KeySystemMutableBuilder[Self <: KeySystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCDMData(value: () => ArrayBuffer | Null): Self = StObject.set(x, "getCDMData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInitData(value: js.Object => ArrayBuffer): Self = StObject.set(x, "getInitData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLicenseRequestFromMessage(value: ArrayBuffer => Uint8Array): Self = StObject.set(x, "getLicenseRequestFromMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLicenseServerURLFromInitData(value: ArrayBuffer => String | Null): Self = StObject.set(x, "getLicenseServerURLFromInitData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRequestHeadersFromMessage(value: ArrayBuffer => js.Object | Null): Self = StObject.set(x, "getRequestHeadersFromMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSessionId(value: () => String | Null): Self = StObject.set(x, "getSessionId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSchemeIdURI(value: String): Self = StObject.set(x, "schemeIdURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemString(value: String): Self = StObject.set(x, "systemString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
