package typings.dashjs.mod

import typings.std.ArrayBuffer
import typings.std.HTMLMediaElement
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectionController extends js.Object {
  
  def closeKeySession(session: SessionToken): Unit = js.native
  
  def createKeySession(initData: ArrayBuffer, cdmData: Uint8Array): Unit = js.native
  
  def getKeySystems(): js.Array[KeySystem] = js.native
  
  def getSupportedKeySystemsFromContentProtection(cps: js.Array[_]): js.Array[SupportedKeySystem] = js.native
  
  def initializeForMedia(mediaInfo: ProtectionMediaInfo): Unit = js.native
  
  def removeKeySession(session: SessionToken): Unit = js.native
  
  def reset(): Unit = js.native
  
  def setMediaElement(element: HTMLMediaElement): Unit = js.native
  
  def setProtectionData(protData: ProtectionData): Unit = js.native
  
  def setRobustnessLevel(level: String): Unit = js.native
  
  def setServerCertificate(serverCertificate: ArrayBuffer): Unit = js.native
  
  def setSessionType(`type`: String): Unit = js.native
  
  def stop(): Unit = js.native
}
object ProtectionController {
  
  @scala.inline
  def apply(
    closeKeySession: SessionToken => Unit,
    createKeySession: (ArrayBuffer, Uint8Array) => Unit,
    getKeySystems: () => js.Array[KeySystem],
    getSupportedKeySystemsFromContentProtection: js.Array[_] => js.Array[SupportedKeySystem],
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
  
  @scala.inline
  implicit class ProtectionControllerOps[Self <: ProtectionController] (val x: Self) extends AnyVal {
    
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
    def setCloseKeySession(value: SessionToken => Unit): Self = this.set("closeKeySession", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateKeySession(value: (ArrayBuffer, Uint8Array) => Unit): Self = this.set("createKeySession", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetKeySystems(value: () => js.Array[KeySystem]): Self = this.set("getKeySystems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSupportedKeySystemsFromContentProtection(value: js.Array[_] => js.Array[SupportedKeySystem]): Self = this.set("getSupportedKeySystemsFromContentProtection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitializeForMedia(value: ProtectionMediaInfo => Unit): Self = this.set("initializeForMedia", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveKeySession(value: SessionToken => Unit): Self = this.set("removeKeySession", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetMediaElement(value: HTMLMediaElement => Unit): Self = this.set("setMediaElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetProtectionData(value: ProtectionData => Unit): Self = this.set("setProtectionData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRobustnessLevel(value: String => Unit): Self = this.set("setRobustnessLevel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetServerCertificate(value: ArrayBuffer => Unit): Self = this.set("setServerCertificate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSessionType(value: String => Unit): Self = this.set("setSessionType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
}
