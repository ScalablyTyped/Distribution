package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The state and the identity of the user agent. It allows scripts to query it and to register themselves to carry on some activities. */
@js.native
trait Navigator
  extends StObject
     with NavigatorAutomationInformation
     with NavigatorConcurrentHardware
     with NavigatorContentUtils
     with NavigatorCookies
     with NavigatorID
     with NavigatorLanguage
     with NavigatorLocks
     with NavigatorNetworkInformation
     with NavigatorOnLine
     with NavigatorPlugins
     with NavigatorStorage {
  
  /** Available only in secure contexts. */
  def canShare(): scala.Boolean = js.native
  def canShare(data: ShareData): scala.Boolean = js.native
  
  /** Available only in secure contexts. */
  val clipboard: Clipboard = js.native
  
  /** Available only in secure contexts. */
  val credentials: CredentialsContainer = js.native
  
  val doNotTrack: java.lang.String | Null = js.native
  
  val geolocation: Geolocation = js.native
  
  def getGamepads(): Array[Gamepad | Null] = js.native
  
  val maxTouchPoints: Double = js.native
  
  val mediaCapabilities: MediaCapabilities = js.native
  
  /** Available only in secure contexts. */
  val mediaDevices: MediaDevices = js.native
  
  val mediaSession: MediaSession = js.native
  
  val permissions: Permissions = js.native
  
  /** Available only in secure contexts. */
  def requestMIDIAccess(): Promise[MIDIAccess] = js.native
  def requestMIDIAccess(options: MIDIOptions): Promise[MIDIAccess] = js.native
  
  /** Available only in secure contexts. */
  def requestMediaKeySystemAccess(keySystem: java.lang.String, supportedConfigurations: Array[MediaKeySystemConfiguration]): Promise[MediaKeySystemAccess] = js.native
  /** Available only in secure contexts. */
  def requestMediaKeySystemAccess(keySystem: java.lang.String, supportedConfigurations: Iterable[MediaKeySystemConfiguration]): Promise[MediaKeySystemAccess] = js.native
  
  def sendBeacon(url: java.lang.String): scala.Boolean = js.native
  def sendBeacon(url: java.lang.String, data: BodyInit): scala.Boolean = js.native
  def sendBeacon(url: URL): scala.Boolean = js.native
  def sendBeacon(url: URL, data: BodyInit): scala.Boolean = js.native
  
  /** Available only in secure contexts. */
  val serviceWorker: ServiceWorkerContainer = js.native
  
  /** Available only in secure contexts. */
  def share(): Promise[Unit] = js.native
  def share(data: ShareData): Promise[Unit] = js.native
  
  def vibrate(pattern: Iterable[Double]): scala.Boolean = js.native
  def vibrate(pattern: VibratePattern): scala.Boolean = js.native
}
