package typings.axeCorePuppeteer

import typings.axeCore.mod.AxeResults
import typings.axeCore.mod.ContextObject
import typings.axeCore.mod.CrossTreeSelector
import typings.axeCore.mod.ElementContext
import typings.axeCore.mod.FrameContext
import typings.axeCore.mod.PartialResult
import typings.axeCore.mod.RunOptions
import typings.axeCore.mod.Spec
import typings.axeCorePuppeteer.anon.TypeofAxe
import typings.axeCorePuppeteer.typesMod.PartialResults
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("@axe-core/puppeteer/dist/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def axeConfigure(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("axeConfigure")().asInstanceOf[Unit]
  inline def axeConfigure(config: Spec): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("axeConfigure")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def axeFinishRun(partials: PartialResults, options: RunOptions): js.Promise[AxeResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("axeFinishRun")(partials.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AxeResults]]
  
  inline def axeGetFrameContext(context: ElementContext): js.Array[FrameContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("axeGetFrameContext")(context.asInstanceOf[js.Any]).asInstanceOf[js.Array[FrameContext]]
  
  inline def axeRunLegacy(): js.Promise[AxeResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("axeRunLegacy")().asInstanceOf[js.Promise[AxeResults]]
  inline def axeRunLegacy(context: Unit, options: RunOptions): js.Promise[AxeResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("axeRunLegacy")(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AxeResults]]
  inline def axeRunLegacy(context: ContextObject): js.Promise[AxeResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("axeRunLegacy")(context.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AxeResults]]
  inline def axeRunLegacy(context: ContextObject, options: RunOptions): js.Promise[AxeResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("axeRunLegacy")(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AxeResults]]
  
  inline def axeRunPartial(context: ContextObject, options: RunOptions): js.Promise[PartialResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("axeRunPartial")(context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PartialResult]]
  
  inline def axeRunPartialSupport(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("axeRunPartialSupport")().asInstanceOf[Boolean]
  
  inline def axeShadowSelect(axeSelector: CrossTreeSelector): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("axeShadowSelect")(axeSelector.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def pageIsLoaded(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("pageIsLoaded")().asInstanceOf[Boolean]
  
  object global {
    
    trait Window extends StObject {
      
      var axe: TypeofAxe
    }
    object Window {
      
      inline def apply(axe: TypeofAxe): Window = {
        val __obj = js.Dynamic.literal(axe = axe.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setAxe(value: TypeofAxe): Self = StObject.set(x, "axe", value.asInstanceOf[js.Any])
      }
    }
  }
}
