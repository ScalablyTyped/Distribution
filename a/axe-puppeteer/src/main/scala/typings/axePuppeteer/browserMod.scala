package typings.axePuppeteer

import typings.axeCore.mod.AxeResults
import typings.axeCore.mod.ElementContext
import typings.axeCore.mod.RunOptions
import typings.axeCore.mod.Spec
import typings.axePuppeteer.anon.TypeofAxe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("axe-puppeteer/dist/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def pageIsLoaded(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("pageIsLoaded")().asInstanceOf[Boolean]
  
  @scala.inline
  def runAxe(): js.Promise[AxeResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("runAxe")().asInstanceOf[js.Promise[AxeResults]]
  @scala.inline
  def runAxe(config: Unit, context: Unit, options: RunOptions): js.Promise[AxeResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("runAxe")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AxeResults]]
  @scala.inline
  def runAxe(config: Unit, context: ElementContext): js.Promise[AxeResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("runAxe")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AxeResults]]
  @scala.inline
  def runAxe(config: Unit, context: ElementContext, options: RunOptions): js.Promise[AxeResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("runAxe")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AxeResults]]
  @scala.inline
  def runAxe(config: Spec): js.Promise[AxeResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("runAxe")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AxeResults]]
  @scala.inline
  def runAxe(config: Spec, context: Unit, options: RunOptions): js.Promise[AxeResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("runAxe")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AxeResults]]
  @scala.inline
  def runAxe(config: Spec, context: ElementContext): js.Promise[AxeResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("runAxe")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AxeResults]]
  @scala.inline
  def runAxe(config: Spec, context: ElementContext, options: RunOptions): js.Promise[AxeResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("runAxe")(config.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AxeResults]]
  
  object global {
    
    trait Window extends StObject {
      
      var axe: TypeofAxe
    }
    object Window {
      
      @scala.inline
      def apply(axe: TypeofAxe): Window = {
        val __obj = js.Dynamic.literal(axe = axe.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAxe(value: TypeofAxe): Self = StObject.set(x, "axe", value.asInstanceOf[js.Any])
      }
    }
  }
}
