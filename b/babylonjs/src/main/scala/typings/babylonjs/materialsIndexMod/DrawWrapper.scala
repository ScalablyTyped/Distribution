package typings.babylonjs.materialsIndexMod

import typings.babylonjs.enginesThinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "DrawWrapper")
@js.native
open class DrawWrapper protected ()
  extends typings.babylonjs.materialsDrawWrapperMod.DrawWrapper {
  def this(engine: ThinEngine) = this()
  def this(engine: ThinEngine, createMaterialContext: Boolean) = this()
}
/* static members */
object DrawWrapper {
  
  @JSImport("babylonjs/Materials/index", "DrawWrapper")
  @js.native
  val ^ : js.Any = js.native
  
  inline def GetEffect(effect: typings.babylonjs.materialsDrawWrapperMod.DrawWrapper): Nullable[typings.babylonjs.materialsEffectMod.Effect] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.materialsEffectMod.Effect]]
  inline def GetEffect(effect: typings.babylonjs.materialsEffectMod.Effect): Nullable[typings.babylonjs.materialsEffectMod.Effect] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Nullable[typings.babylonjs.materialsEffectMod.Effect]]
  
  inline def IsWrapper(effect: typings.babylonjs.materialsDrawWrapperMod.DrawWrapper): /* is babylonjs.babylonjs/Materials/drawWrapper.DrawWrapper */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsWrapper")(effect.asInstanceOf[js.Any]).asInstanceOf[/* is babylonjs.babylonjs/Materials/drawWrapper.DrawWrapper */ Boolean]
  inline def IsWrapper(effect: typings.babylonjs.materialsEffectMod.Effect): /* is babylonjs.babylonjs/Materials/drawWrapper.DrawWrapper */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsWrapper")(effect.asInstanceOf[js.Any]).asInstanceOf[/* is babylonjs.babylonjs/Materials/drawWrapper.DrawWrapper */ Boolean]
}
