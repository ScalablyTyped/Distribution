package typings.dashjs.mod

import typings.std.HTMLMediaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectionController extends StObject {
  
  def clearMediaInfoArray(): Unit
  
  def closeKeySession(session: SessionToken): Unit
  
  def createKeySession(ksInfo: KeySystemInfo): Unit
  
  def getKeySystems(): js.Array[KeySystem]
  
  def getSupportedKeySystemsFromContentProtection(cps: js.Array[Any]): js.Array[KeySystemInfo]
  
  def initializeForMedia(mediaInfo: ProtectionMediaInfo): Unit
  
  def loadKeySession(ksInfo: KeySystemInfo): Unit
  
  def removeKeySession(session: SessionToken): Unit
  
  def reset(): Unit
  
  def setKeySystems(keySystems: js.Array[KeySystem]): Unit
  
  def setLicenseRequestFilters(filters: js.Array[RequestFilter]): Unit
  
  def setLicenseResponseFilters(filters: js.Array[ResponseFilter]): Unit
  
  def setMediaElement(element: HTMLMediaElement): Unit
  
  def setProtectionData(protDataSet: ProtectionDataSet): Unit
  
  def setRobustnessLevel(level: String): Unit
  
  def setServerCertificate(serverCertificate: js.typedarray.ArrayBuffer): Unit
  
  def setSessionType(`type`: String): Unit
  
  def stop(): Unit
}
object ProtectionController {
  
  inline def apply(
    clearMediaInfoArray: () => Unit,
    closeKeySession: SessionToken => Unit,
    createKeySession: KeySystemInfo => Unit,
    getKeySystems: () => js.Array[KeySystem],
    getSupportedKeySystemsFromContentProtection: js.Array[Any] => js.Array[KeySystemInfo],
    initializeForMedia: ProtectionMediaInfo => Unit,
    loadKeySession: KeySystemInfo => Unit,
    removeKeySession: SessionToken => Unit,
    reset: () => Unit,
    setKeySystems: js.Array[KeySystem] => Unit,
    setLicenseRequestFilters: js.Array[RequestFilter] => Unit,
    setLicenseResponseFilters: js.Array[ResponseFilter] => Unit,
    setMediaElement: HTMLMediaElement => Unit,
    setProtectionData: ProtectionDataSet => Unit,
    setRobustnessLevel: String => Unit,
    setServerCertificate: js.typedarray.ArrayBuffer => Unit,
    setSessionType: String => Unit,
    stop: () => Unit
  ): ProtectionController = {
    val __obj = js.Dynamic.literal(clearMediaInfoArray = js.Any.fromFunction0(clearMediaInfoArray), closeKeySession = js.Any.fromFunction1(closeKeySession), createKeySession = js.Any.fromFunction1(createKeySession), getKeySystems = js.Any.fromFunction0(getKeySystems), getSupportedKeySystemsFromContentProtection = js.Any.fromFunction1(getSupportedKeySystemsFromContentProtection), initializeForMedia = js.Any.fromFunction1(initializeForMedia), loadKeySession = js.Any.fromFunction1(loadKeySession), removeKeySession = js.Any.fromFunction1(removeKeySession), reset = js.Any.fromFunction0(reset), setKeySystems = js.Any.fromFunction1(setKeySystems), setLicenseRequestFilters = js.Any.fromFunction1(setLicenseRequestFilters), setLicenseResponseFilters = js.Any.fromFunction1(setLicenseResponseFilters), setMediaElement = js.Any.fromFunction1(setMediaElement), setProtectionData = js.Any.fromFunction1(setProtectionData), setRobustnessLevel = js.Any.fromFunction1(setRobustnessLevel), setServerCertificate = js.Any.fromFunction1(setServerCertificate), setSessionType = js.Any.fromFunction1(setSessionType), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[ProtectionController]
  }
  
  extension [Self <: ProtectionController](x: Self) {
    
    inline def setClearMediaInfoArray(value: () => Unit): Self = StObject.set(x, "clearMediaInfoArray", js.Any.fromFunction0(value))
    
    inline def setCloseKeySession(value: SessionToken => Unit): Self = StObject.set(x, "closeKeySession", js.Any.fromFunction1(value))
    
    inline def setCreateKeySession(value: KeySystemInfo => Unit): Self = StObject.set(x, "createKeySession", js.Any.fromFunction1(value))
    
    inline def setGetKeySystems(value: () => js.Array[KeySystem]): Self = StObject.set(x, "getKeySystems", js.Any.fromFunction0(value))
    
    inline def setGetSupportedKeySystemsFromContentProtection(value: js.Array[Any] => js.Array[KeySystemInfo]): Self = StObject.set(x, "getSupportedKeySystemsFromContentProtection", js.Any.fromFunction1(value))
    
    inline def setInitializeForMedia(value: ProtectionMediaInfo => Unit): Self = StObject.set(x, "initializeForMedia", js.Any.fromFunction1(value))
    
    inline def setLoadKeySession(value: KeySystemInfo => Unit): Self = StObject.set(x, "loadKeySession", js.Any.fromFunction1(value))
    
    inline def setRemoveKeySession(value: SessionToken => Unit): Self = StObject.set(x, "removeKeySession", js.Any.fromFunction1(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSetKeySystems(value: js.Array[KeySystem] => Unit): Self = StObject.set(x, "setKeySystems", js.Any.fromFunction1(value))
    
    inline def setSetLicenseRequestFilters(value: js.Array[RequestFilter] => Unit): Self = StObject.set(x, "setLicenseRequestFilters", js.Any.fromFunction1(value))
    
    inline def setSetLicenseResponseFilters(value: js.Array[ResponseFilter] => Unit): Self = StObject.set(x, "setLicenseResponseFilters", js.Any.fromFunction1(value))
    
    inline def setSetMediaElement(value: HTMLMediaElement => Unit): Self = StObject.set(x, "setMediaElement", js.Any.fromFunction1(value))
    
    inline def setSetProtectionData(value: ProtectionDataSet => Unit): Self = StObject.set(x, "setProtectionData", js.Any.fromFunction1(value))
    
    inline def setSetRobustnessLevel(value: String => Unit): Self = StObject.set(x, "setRobustnessLevel", js.Any.fromFunction1(value))
    
    inline def setSetServerCertificate(value: js.typedarray.ArrayBuffer => Unit): Self = StObject.set(x, "setServerCertificate", js.Any.fromFunction1(value))
    
    inline def setSetSessionType(value: String => Unit): Self = StObject.set(x, "setSessionType", js.Any.fromFunction1(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
