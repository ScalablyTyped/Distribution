package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeasonSwitch extends TimerSwitch {
  
  @JSName("buyFunction")
  def buyFunction_MSeasonSwitch(): Unit = js.native
  
  @JSName("clickFunction")
  def clickFunction_MSeasonSwitch(): Boolean = js.native
  
  /**
    * The name of the season to trigger
    */
  var season: String = js.native
}
