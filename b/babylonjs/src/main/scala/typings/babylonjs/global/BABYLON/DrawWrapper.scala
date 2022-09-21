package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DrawWrapper")
@js.native
open class DrawWrapper protected ()
  extends StObject
     with typings.babylonjs.BABYLON.DrawWrapper {
  def this(engine: typings.babylonjs.BABYLON.ThinEngine) = this()
  def this(engine: typings.babylonjs.BABYLON.ThinEngine, createMaterialContext: Boolean) = this()
}
/* static members */
object DrawWrapper {
  
  @JSGlobal("BABYLON.DrawWrapper")
  @js.native
  val ^ : js.Any = js.native
  
  inline def GetEffect(effect: typings.babylonjs.BABYLON.DrawWrapper): Nullable[typings.babylonjs.BABYLON.Effect] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Effect]]
  inline def GetEffect(effect: typings.babylonjs.BABYLON.Effect): Nullable[typings.babylonjs.BABYLON.Effect] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.BABYLON.Effect]]
  
  inline def IsWrapper(effect: typings.babylonjs.BABYLON.DrawWrapper): /* is babylonjs.BABYLON.DrawWrapper */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsWrapper")(effect.asInstanceOf[js.Any]).asInstanceOf[/* is babylonjs.BABYLON.DrawWrapper */ Boolean]
  inline def IsWrapper(effect: typings.babylonjs.BABYLON.Effect): /* is babylonjs.BABYLON.DrawWrapper */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsWrapper")(effect.asInstanceOf[js.Any]).asInstanceOf[/* is babylonjs.BABYLON.DrawWrapper */ Boolean]
}
