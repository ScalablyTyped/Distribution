package typings.axePuppeteer

import typings.axeCore.mod.AxeResults
import typings.axeCore.mod.ElementContext
import typings.axeCore.mod.RunOptions
import typings.axeCore.mod.Spec
import typings.axePuppeteer.anon.TypeofAxe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("axe-puppeteer/dist/browser", "pageIsLoaded")
  @js.native
  def pageIsLoaded(): Boolean = js.native
  
  @JSImport("axe-puppeteer/dist/browser", "runAxe")
  @js.native
  def runAxe(): js.Promise[AxeResults] = js.native
  @JSImport("axe-puppeteer/dist/browser", "runAxe")
  @js.native
  def runAxe(config: js.UndefOr[scala.Nothing], context: js.UndefOr[ElementContext], options: RunOptions): js.Promise[AxeResults] = js.native
  @JSImport("axe-puppeteer/dist/browser", "runAxe")
  @js.native
  def runAxe(config: js.UndefOr[scala.Nothing], context: ElementContext): js.Promise[AxeResults] = js.native
  @JSImport("axe-puppeteer/dist/browser", "runAxe")
  @js.native
  def runAxe(config: Spec): js.Promise[AxeResults] = js.native
  @JSImport("axe-puppeteer/dist/browser", "runAxe")
  @js.native
  def runAxe(config: Spec, context: js.UndefOr[ElementContext], options: RunOptions): js.Promise[AxeResults] = js.native
  @JSImport("axe-puppeteer/dist/browser", "runAxe")
  @js.native
  def runAxe(config: Spec, context: ElementContext): js.Promise[AxeResults] = js.native
  
  object global {
    
    @js.native
    trait Window extends StObject {
      
      var axe: TypeofAxe = js.native
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
