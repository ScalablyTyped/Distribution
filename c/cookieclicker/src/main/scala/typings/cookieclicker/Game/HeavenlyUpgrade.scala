package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerStrings.prestige
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeavenlyUpgrade
  extends StObject
     with Upgrade {
  
  var placedByCode: js.UndefOr[Boolean] = js.native
  
  @JSName("pool")
  var pool_HeavenlyUpgrade: prestige = js.native
  
  var posX: Double = js.native
  
  var posY: Double = js.native
  
  /**
    * The function that determines if the heavenly upgrade should be shown
    */
  var showIf: js.UndefOr[js.Function0[Boolean]] = js.native
}
