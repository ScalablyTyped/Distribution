package typings.axeCorePuppeteer

import typings.puppeteer.mod.Frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLegacyMod {
  
  @JSImport("@axe-core/puppeteer/dist/legacy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def iframeSelector(disabledFrameSelectors: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("iframeSelector")(disabledFrameSelectors.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def injectJS(frame: Unit, hasSourceSelectorLogOnErrorArgs: IInjectAxeArgs): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("injectJS")(frame.asInstanceOf[js.Any], hasSourceSelectorLogOnErrorArgs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def injectJS(frame: Frame, hasSourceSelectorLogOnErrorArgs: IInjectAxeArgs): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("injectJS")(frame.asInstanceOf[js.Any], hasSourceSelectorLogOnErrorArgs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait IInjectAxeArgs extends StObject {
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var logOnError: js.UndefOr[Boolean] = js.undefined
    
    var selector: String
    
    var source: js.UndefOr[String | js.Function] = js.undefined
  }
  object IInjectAxeArgs {
    
    inline def apply(selector: String): IInjectAxeArgs = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInjectAxeArgs]
    }
    
    extension [Self <: IInjectAxeArgs](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setLogOnError(value: Boolean): Self = StObject.set(x, "logOnError", value.asInstanceOf[js.Any])
      
      inline def setLogOnErrorUndefined: Self = StObject.set(x, "logOnError", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String | js.Function): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
}
