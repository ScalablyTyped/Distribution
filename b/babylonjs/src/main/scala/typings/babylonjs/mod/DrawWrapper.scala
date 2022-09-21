package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "DrawWrapper")
@js.native
open class DrawWrapper protected ()
  extends typings.babylonjs.legacyMod.DrawWrapper {
  def this(engine: typings.babylonjs.thinEngineMod.ThinEngine) = this()
  def this(engine: typings.babylonjs.thinEngineMod.ThinEngine, createMaterialContext: Boolean) = this()
}
/* static members */
object DrawWrapper {
  
  @JSImport("babylonjs", "DrawWrapper")
  @js.native
  val ^ : js.Any = js.native
  
  inline def GetEffect(effect: typings.babylonjs.drawWrapperMod.DrawWrapper): Nullable[typings.babylonjs.effectMod.Effect] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.effectMod.Effect]]
  inline def GetEffect(effect: typings.babylonjs.effectMod.Effect): Nullable[typings.babylonjs.effectMod.Effect] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.effectMod.Effect]]
  
  inline def IsWrapper(effect: typings.babylonjs.drawWrapperMod.DrawWrapper): /* is babylonjs.babylonjs/Materials/drawWrapper.DrawWrapper */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsWrapper")(effect.asInstanceOf[js.Any]).asInstanceOf[/* is babylonjs.babylonjs/Materials/drawWrapper.DrawWrapper */ Boolean]
  inline def IsWrapper(effect: typings.babylonjs.effectMod.Effect): /* is babylonjs.babylonjs/Materials/drawWrapper.DrawWrapper */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsWrapper")(effect.asInstanceOf[js.Any]).asInstanceOf[/* is babylonjs.babylonjs/Materials/drawWrapper.DrawWrapper */ Boolean]
}
