package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Level extends js.Object {
  /**
    * @enum
    * @property SYSTEM - Prevent the system from sleeping in response to user inactivity.
    * @property DISPLAY - Prevent the display from being turned off or dimmed or the system from sleeping in response to user inactivity.
    */
  val Level: Anon_DISPLAY
  /** Releases a request previously made via requestKeepAwake(). */
  def releaseKeepAwake(): scala.Unit
  /**
    * Requests that power management be temporarily disabled.
    * @param level Level describes the degree to which power management should be disabled.
    *              If a request previously made by the same app is still active, it will be replaced by the new request.
    * @see Enum: chrome.power.Level
    */
  def requestKeepAwake(
    level: chromeDashAppsLib.chromeNs.ToStringLiteral[
      /* import warning: ImportType.apply Failed type conversion: typeof Level */ js.Any, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: typeof Level[keyof typeof Level] */ js.Any
      ]
    ]
  ): scala.Unit
}

object Anon_Level {
  @scala.inline
  def apply(
    Level: Anon_DISPLAY,
    releaseKeepAwake: () => scala.Unit,
    requestKeepAwake: chromeDashAppsLib.chromeNs.ToStringLiteral[
      /* import warning: ImportType.apply Failed type conversion: typeof Level */ js.Any, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: ImportType.apply Failed type conversion: typeof Level[keyof typeof Level] */ js.Any
      ]
    ] => scala.Unit
  ): Anon_Level = {
    val __obj = js.Dynamic.literal(Level = Level, releaseKeepAwake = js.Any.fromFunction0(releaseKeepAwake), requestKeepAwake = js.Any.fromFunction1(requestKeepAwake))
  
    __obj.asInstanceOf[Anon_Level]
  }
}

