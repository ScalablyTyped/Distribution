package typings.babylonjs

import typings.babylonjs.effectMod.Effect
import typings.babylonjs.idrawcontextMod.IDrawContext
import typings.babylonjs.imaterialcontextMod.IMaterialContext
import typings.babylonjs.materialDefinesMod.MaterialDefines
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawWrapperMod {
  
  @JSImport("babylonjs/Materials/drawWrapper", "DrawWrapper")
  @js.native
  open class DrawWrapper protected () extends StObject {
    def this(engine: ThinEngine) = this()
    def this(engine: ThinEngine, createMaterialContext: Boolean) = this()
    
    var defines: Nullable[String | MaterialDefines] = js.native
    
    def dispose(): Unit = js.native
    
    var drawContext: js.UndefOr[IDrawContext] = js.native
    
    var effect: Nullable[Effect] = js.native
    
    var materialContext: js.UndefOr[IMaterialContext] = js.native
    
    def setEffect(effect: Nullable[Effect]): Unit = js.native
    def setEffect(effect: Nullable[Effect], defines: Unit, resetContext: Boolean): Unit = js.native
    def setEffect(effect: Nullable[Effect], defines: Nullable[String | MaterialDefines]): Unit = js.native
    def setEffect(effect: Nullable[Effect], defines: Nullable[String | MaterialDefines], resetContext: Boolean): Unit = js.native
  }
  /* static members */
  object DrawWrapper {
    
    @JSImport("babylonjs/Materials/drawWrapper", "DrawWrapper")
    @js.native
    val ^ : js.Any = js.native
    
    inline def GetEffect(effect: DrawWrapper): Nullable[Effect] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Nullable[Effect]]
    inline def GetEffect(effect: Effect): Nullable[Effect] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Nullable[Effect]]
    
    inline def IsWrapper(effect: DrawWrapper): /* is babylonjs.babylonjs/Materials/drawWrapper.DrawWrapper */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsWrapper")(effect.asInstanceOf[js.Any]).asInstanceOf[/* is babylonjs.babylonjs/Materials/drawWrapper.DrawWrapper */ Boolean]
    inline def IsWrapper(effect: Effect): /* is babylonjs.babylonjs/Materials/drawWrapper.DrawWrapper */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsWrapper")(effect.asInstanceOf[js.Any]).asInstanceOf[/* is babylonjs.babylonjs/Materials/drawWrapper.DrawWrapper */ Boolean]
  }
}
