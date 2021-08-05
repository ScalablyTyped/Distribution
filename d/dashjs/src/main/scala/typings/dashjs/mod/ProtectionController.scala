package typings.dashjs.mod

import typings.std.ArrayBuffer
import typings.std.HTMLMediaElement
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectionController extends StObject {
  
  def closeKeySession(session: SessionToken): Unit
  
  def createKeySession(initData: ArrayBuffer, cdmData: Uint8Array): Unit
  
  def getKeySystems(): js.Array[KeySystem]
  
  def getSupportedKeySystemsFromContentProtection(cps: js.Array[js.Any]): js.Array[SupportedKeySystem]
  
  def initializeForMedia(mediaInfo: ProtectionMediaInfo): Unit
  
  def removeKeySession(session: SessionToken): Unit
  
  def reset(): Unit
  
  def setMediaElement(element: HTMLMediaElement): Unit
  
  def setProtectionData(protData: ProtectionData): Unit
  
  def setRobustnessLevel(level: String): Unit
  
  def setServerCertificate(serverCertificate: ArrayBuffer): Unit
  
  def setSessionType(`type`: String): Unit
  
  def stop(): Unit
}
object ProtectionController {
  
  inline def apply(
    closeKeySession: SessionToken => Unit,
    createKeySession: (ArrayBuffer, Uint8Array) => Unit,
    getKeySystems: () => js.Array[KeySystem],
    getSupportedKeySystemsFromContentProtection: js.Array[js.Any] => js.Array[SupportedKeySystem],
    initializeForMedia: ProtectionMediaInfo => Unit,
    removeKeySession: SessionToken => Unit,
    reset: () => Unit,
    setMediaElement: HTMLMediaElement => Unit,
    setProtectionData: ProtectionData => Unit,
    setRobustnessLevel: String => Unit,
    setServerCertificate: ArrayBuffer => Unit,
    setSessionType: String => Unit,
    stop: () => Unit
  ): ProtectionController = {
    val __obj = js.Dynamic.literal(closeKeySession = js.Any.fromFunction1(closeKeySession), createKeySession = js.Any.fromFunction2(createKeySession), getKeySystems = js.Any.fromFunction0(getKeySystems), getSupportedKeySystemsFromContentProtection = js.Any.fromFunction1(getSupportedKeySystemsFromContentProtection), initializeForMedia = js.Any.fromFunction1(initializeForMedia), removeKeySession = js.Any.fromFunction1(removeKeySession), reset = js.Any.fromFunction0(reset), setMediaElement = js.Any.fromFunction1(setMediaElement), setProtectionData = js.Any.fromFunction1(setProtectionData), setRobustnessLevel = js.Any.fromFunction1(setRobustnessLevel), setServerCertificate = js.Any.fromFunction1(setServerCertificate), setSessionType = js.Any.fromFunction1(setSessionType), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[ProtectionController]
  }
  
  extension [Self <: ProtectionController](x: Self) {
    
    inline def setCloseKeySession(value: SessionToken => Unit): Self = StObject.set(x, "closeKeySession", js.Any.fromFunction1(value))
    
    inline def setCreateKeySession(value: (ArrayBuffer, Uint8Array) => Unit): Self = StObject.set(x, "createKeySession", js.Any.fromFunction2(value))
    
    inline def setGetKeySystems(value: () => js.Array[KeySystem]): Self = StObject.set(x, "getKeySystems", js.Any.fromFunction0(value))
    
    inline def setGetSupportedKeySystemsFromContentProtection(value: js.Array[js.Any] => js.Array[SupportedKeySystem]): Self = StObject.set(x, "getSupportedKeySystemsFromContentProtection", js.Any.fromFunction1(value))
    
    inline def setInitializeForMedia(value: ProtectionMediaInfo => Unit): Self = StObject.set(x, "initializeForMedia", js.Any.fromFunction1(value))
    
    inline def setRemoveKeySession(value: SessionToken => Unit): Self = StObject.set(x, "removeKeySession", js.Any.fromFunction1(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSetMediaElement(value: HTMLMediaElement => Unit): Self = StObject.set(x, "setMediaElement", js.Any.fromFunction1(value))
    
    inline def setSetProtectionData(value: ProtectionData => Unit): Self = StObject.set(x, "setProtectionData", js.Any.fromFunction1(value))
    
    inline def setSetRobustnessLevel(value: String => Unit): Self = StObject.set(x, "setRobustnessLevel", js.Any.fromFunction1(value))
    
    inline def setSetServerCertificate(value: ArrayBuffer => Unit): Self = StObject.set(x, "setServerCertificate", js.Any.fromFunction1(value))
    
    inline def setSetSessionType(value: String => Unit): Self = StObject.set(x, "setSessionType", js.Any.fromFunction1(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
