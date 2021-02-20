package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DebugLayerTab extends StObject
@JSGlobal("BABYLON.DebugLayerTab")
@js.native
object DebugLayerTab extends StObject {
  
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
