package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PerformanceWatchdogViewModel")
@js.native
open class PerformanceWatchdogViewModel () extends StObject {
  def this(options: typings.cesium.anon.Scene) = this()
  
  /**
    * Gets a command that dismisses the low frame rate message.  Once it is dismissed, the message
    * will not be redisplayed.
    */
  var dismissMessage: Command = js.native
  
  /**
    * Gets or sets the message to display when a low frame rate is detected.  This string will be interpreted as HTML.
    */
  var lowFrameRateMessage: String = js.native
  
  /**
    * Gets or sets a value indicating whether the low frame rate message has previously been dismissed by the user.  If it has
    * been dismissed, the message will not be redisplayed, no matter the frame rate.
    */
  var lowFrameRateMessageDismissed: Boolean = js.native
  
  /**
    * Gets the {@link Scene} instance for which to monitor performance.
    */
  var scene: Scene = js.native
  
  /**
    * Gets or sets a value indicating whether the low frame rate message is currently being displayed.
    */
  var showingLowFrameRateMessage: Boolean = js.native
}
