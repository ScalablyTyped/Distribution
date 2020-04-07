package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DebugLayerTab extends js.Object

@JSGlobal("BABYLON.DebugLayerTab")
@js.native
object DebugLayerTab extends js.Object {
  /**
    * Debug tab
    */
  @js.native
  sealed trait Debug extends DebugLayerTab
  
  /**
    * Properties tag (default)
    */
  @js.native
  sealed trait Properties extends DebugLayerTab
  
  /**
    * Settings tab
    */
  @js.native
  sealed trait Settings extends DebugLayerTab
  
  /**
    * Statistics tab
    */
  @js.native
  sealed trait Statistics extends DebugLayerTab
  
  /**
    * Tools tab
    */
  @js.native
  sealed trait Tools extends DebugLayerTab
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DebugLayerTab with Double] = js.native
  /* 1 */ @js.native
  object Debug
    extends TopLevel[typings.babylonjs.BABYLON.DebugLayerTab.Debug with Double]
  
  /* 0 */ @js.native
  object Properties extends TopLevel[Properties with Double]
  
  /* 4 */ @js.native
  object Settings extends TopLevel[Settings with Double]
  
  /* 2 */ @js.native
  object Statistics extends TopLevel[Statistics with Double]
  
  /* 3 */ @js.native
  object Tools
    extends TopLevel[typings.babylonjs.BABYLON.DebugLayerTab.Tools with Double]
  
}

