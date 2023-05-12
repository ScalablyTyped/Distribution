package typings.chromeApps.anon

import typings.chromeApps.chrome.ToStringLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofpower extends StObject {
  
  /**
    * SYSTEM - Prevent the system from sleeping in response to user inactivity.
    * DISPLAY - Prevent the display from being turned off or dimmed or the system from sleeping in response to user inactivity.
    */
  val Level: DISPLAY
  
  /** Releases a request previously made via requestKeepAwake(). */
  def releaseKeepAwake(): Unit
  
  /**
    * Requests that power management be temporarily disabled.
    * @param level Level describes the degree to which power management should be disabled.
    *              If a request previously made by the same app is still active, it will be replaced by the new request.
    * @see Enum: chrome.power.Level
    */
  def requestKeepAwake(
    level: ToStringLiteral[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof Level */ js.Any, 
      /* keyof typeof Level */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof typeof Level extends keyof typeof Level ? std.Exclude<keyof typeof Level, typeof Level[keyof typeof Level]> : never */ js.Any
    ]
  ): Unit
}
object Typeofpower {
  
  inline def apply(
    Level: DISPLAY,
    releaseKeepAwake: () => Unit,
    requestKeepAwake: ToStringLiteral[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof Level */ js.Any, 
      /* keyof typeof Level */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof typeof Level extends keyof typeof Level ? std.Exclude<keyof typeof Level, typeof Level[keyof typeof Level]> : never */ js.Any
    ] => Unit
  ): Typeofpower = {
    val __obj = js.Dynamic.literal(Level = Level.asInstanceOf[js.Any], releaseKeepAwake = js.Any.fromFunction0(releaseKeepAwake), requestKeepAwake = js.Any.fromFunction1(requestKeepAwake))
    __obj.asInstanceOf[Typeofpower]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofpower] (val x: Self) extends AnyVal {
    
    inline def setLevel(value: DISPLAY): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
    
    inline def setReleaseKeepAwake(value: () => Unit): Self = StObject.set(x, "releaseKeepAwake", js.Any.fromFunction0(value))
    
    inline def setRequestKeepAwake(
      value: ToStringLiteral[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof Level */ js.Any, 
          /* keyof typeof Level */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof typeof Level extends keyof typeof Level ? std.Exclude<keyof typeof Level, typeof Level[keyof typeof Level]> : never */ js.Any
        ] => Unit
    ): Self = StObject.set(x, "requestKeepAwake", js.Any.fromFunction1(value))
  }
}
