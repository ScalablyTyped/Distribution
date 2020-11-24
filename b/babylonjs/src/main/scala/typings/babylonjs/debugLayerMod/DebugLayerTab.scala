package typings.babylonjs.debugLayerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DebugLayerTab extends js.Object
@JSImport("babylonjs/Debug/debugLayer", "DebugLayerTab")
@js.native
object DebugLayerTab extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DebugLayerTab with Double] = js.native
  
  /**
    * Debug tab
    */
  @js.native
  sealed trait Debug extends DebugLayerTab
  /* 1 */ @js.native
  object Debug extends TopLevel[Debug with Double]
  
  /**
    * Properties tag (default)
    */
  @js.native
  sealed trait Properties extends DebugLayerTab
  /* 0 */ @js.native
  object Properties extends TopLevel[Properties with Double]
  
  /**
    * Settings tab
    */
  @js.native
  sealed trait Settings extends DebugLayerTab
  /* 4 */ @js.native
  object Settings extends TopLevel[Settings with Double]
  
  /**
    * Statistics tab
    */
  @js.native
  sealed trait Statistics extends DebugLayerTab
  /* 2 */ @js.native
  object Statistics extends TopLevel[Statistics with Double]
  
  /**
    * Tools tab
    */
  @js.native
  sealed trait Tools extends DebugLayerTab
  /* 3 */ @js.native
  object Tools extends TopLevel[Tools with Double]
}
