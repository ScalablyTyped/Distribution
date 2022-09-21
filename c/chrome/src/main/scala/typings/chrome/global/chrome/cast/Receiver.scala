package typings.chrome.global.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.Receiver")
@js.native
open class Receiver protected ()
  extends StObject
     with typings.chrome.chrome.cast.Receiver {
  /**
    * @param label
    * @param friendlyName
    * @param opt_capabilities
    * @param opt_volume
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.Receiver
    */
  def this(label: String, friendlyName: String) = this()
  def this(label: String, friendlyName: String, capabilities: js.Array[typings.chrome.chrome.cast.Capability]) = this()
  def this(
    label: String,
    friendlyName: String,
    capabilities: js.Array[typings.chrome.chrome.cast.Capability],
    volume: typings.chrome.chrome.cast.Volume
  ) = this()
  def this(label: String, friendlyName: String, capabilities: Unit, volume: typings.chrome.chrome.cast.Volume) = this()
  
  /* CompleteClass */
  var capabilities: js.Array[typings.chrome.chrome.cast.Capability] = js.native
  
  /* CompleteClass */
  var displayStatus: typings.chrome.chrome.cast.ReceiverDisplayStatus = js.native
  
  /* CompleteClass */
  var friendlyName: String = js.native
  
  /* CompleteClass */
  var label: String = js.native
  
  /* CompleteClass */
  var receiverType: typings.chrome.chrome.cast.ReceiverType = js.native
  
  /* CompleteClass */
  var volume: typings.chrome.chrome.cast.Volume = js.native
}
