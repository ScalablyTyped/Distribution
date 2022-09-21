package typings.chrome.chrome

import typings.chrome.anon.ArgsFunc
import typings.chrome.anon.Func
import typings.chrome.anon.Target
import typings.chrome.anon.filesArraystringtargetInj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Scripting
////////////////////
/**
  * Use the chrome.scripting API to execute script in different contexts.
  * Permissions: "scripting", Manifest v3+
  * @since Chrome 88.
  */
object scripting {
  
  type Awaited[T] = T
  
  trait CSSInjection extends StObject {
    
    /* A string containing the CSS to inject. Exactly one of files and css must be specified. */
    var css: js.UndefOr[String] = js.undefined
    
    /* The path of the CSS files to inject, relative to the extension's root directory. NOTE: Currently a maximum of one file is supported. Exactly one of files and css must be specified. */
    var files: js.UndefOr[js.Array[String]] = js.undefined
    
    /* The style origin for the injection. Defaults to 'AUTHOR'. */
    var origin: js.UndefOr[StyleOrigin] = js.undefined
    
    /* Details specifying the target into which to insert the CSS. */
    var target: InjectionTarget
  }
  object CSSInjection {
    
    inline def apply(target: InjectionTarget): CSSInjection = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSSInjection]
    }
    
    extension [Self <: CSSInjection](x: Self) {
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setOrigin(value: StyleOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setTarget(value: InjectionTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chrome.chromeStrings.ISOLATED
    - typings.chrome.chromeStrings.MAIN
  */
  trait ExecutionWorld extends StObject
  object ExecutionWorld {
    
    inline def ISOLATED: typings.chrome.chromeStrings.ISOLATED = "ISOLATED".asInstanceOf[typings.chrome.chromeStrings.ISOLATED]
    
    inline def MAIN: typings.chrome.chromeStrings.MAIN = "MAIN".asInstanceOf[typings.chrome.chromeStrings.MAIN]
  }
  
  trait InjectionResult[T] extends StObject {
    
    /* The frame associated with the injection. */
    var frameId: Double
    
    /* The result of the script execution. */
    var result: T
  }
  object InjectionResult {
    
    inline def apply[T](frameId: Double, result: T): InjectionResult[T] = {
      val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectionResult[T]]
    }
    
    extension [Self <: InjectionResult[?], T](x: Self & InjectionResult[T]) {
      
      inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      inline def setResult(value: T): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait InjectionTarget extends StObject {
    
    /* Whether the script should inject into all frames within the tab. Defaults to false. This must not be true if frameIds is specified. */
    var allFrames: js.UndefOr[Boolean] = js.undefined
    
    /* The IDs of specific frames to inject into. */
    var frameIds: js.UndefOr[js.Array[Double]] = js.undefined
    
    /* The ID of the tab into which to inject. */
    var tabId: Double
  }
  object InjectionTarget {
    
    inline def apply(tabId: Double): InjectionTarget = {
      val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectionTarget]
    }
    
    extension [Self <: InjectionTarget](x: Self) {
      
      inline def setAllFrames(value: Boolean): Self = StObject.set(x, "allFrames", value.asInstanceOf[js.Any])
      
      inline def setAllFramesUndefined: Self = StObject.set(x, "allFrames", js.undefined)
      
      inline def setFrameIds(value: js.Array[Double]): Self = StObject.set(x, "frameIds", value.asInstanceOf[js.Any])
      
      inline def setFrameIdsUndefined: Self = StObject.set(x, "frameIds", js.undefined)
      
      inline def setFrameIdsVarargs(value: Double*): Self = StObject.set(x, "frameIds", js.Array(value*))
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  type ScriptInjection[Args /* <: js.Array[Any] */, Result] = filesArraystringtargetInj | (Func[Result] & Target) | ((ArgsFunc[Args, Result]) & Target)
  
  /* Rewritten from type alias, can be one of: 
    - typings.chrome.chromeStrings.AUTHOR
    - typings.chrome.chromeStrings.USER
  */
  trait StyleOrigin extends StObject
  object StyleOrigin {
    
    inline def AUTHOR: typings.chrome.chromeStrings.AUTHOR = "AUTHOR".asInstanceOf[typings.chrome.chromeStrings.AUTHOR]
    
    inline def USER: typings.chrome.chromeStrings.USER = "USER".asInstanceOf[typings.chrome.chromeStrings.USER]
  }
}
