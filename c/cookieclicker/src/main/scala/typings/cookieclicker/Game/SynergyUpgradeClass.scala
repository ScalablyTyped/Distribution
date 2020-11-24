package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SynergyUpgradeClass[Tier /* <: String | Double */] extends Upgrade {
  
  var buildingTie1: GameObject = js.native
  
  var buildingTie2: GameObject = js.native
  
  @JSName("pool")
  var pool_SynergyUpgradeClass: _empty = js.native
  
  @JSName("tier")
  var tier_SynergyUpgradeClass: Tier = js.native
}
