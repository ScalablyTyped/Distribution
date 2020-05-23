package typings.babylonjs.BABYLON

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
  
}

