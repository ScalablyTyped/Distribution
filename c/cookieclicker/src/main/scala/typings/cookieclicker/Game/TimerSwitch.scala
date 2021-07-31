package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimerSwitch
  extends StObject
     with Upgrade {
  
  /**
    * Required to stay in the store after it's bought
    */
  def displayFuncWhenOwned(): String = js.native
  
  @JSName("pool")
  var pool_TimerSwitch: toggle = js.native
  
  /**
    * Should return the amount of time left, -1 for no time
    */
  var timerDisplay: js.UndefOr[js.Function0[Double]] = js.native
}
