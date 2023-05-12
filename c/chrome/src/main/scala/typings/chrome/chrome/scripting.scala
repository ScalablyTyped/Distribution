package typings.chrome.chrome

import typings.chrome.anon.ArgsFunc
import typings.chrome.anon.Func
import typings.chrome.anon.InjectImmediately
import typings.chrome.anon.filesArraystringtargetInj
import typings.chrome.chromeStrings.document_end
import typings.chrome.chromeStrings.document_idle
import typings.chrome.chromeStrings.document_start
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.PromiseLike<infer U> ? U : T
    }}}
    */
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CSSInjection] (val x: Self) extends AnyVal {
      
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
  
  trait ContentScriptFilter extends StObject {
    
    var css: js.UndefOr[String] = js.undefined
    
    var files: js.UndefOr[js.Array[String]] = js.undefined
    
    var ids: js.UndefOr[js.Array[String]] = js.undefined
    
    var origin: js.UndefOr[StyleOrigin] = js.undefined
    
    var target: js.UndefOr[InjectionTarget] = js.undefined
  }
  object ContentScriptFilter {
    
    inline def apply(): ContentScriptFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentScriptFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentScriptFilter] (val x: Self) extends AnyVal {
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
      
      inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
      
      inline def setOrigin(value: StyleOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setTarget(value: InjectionTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InjectionResult[?], T] (val x: Self & InjectionResult[T]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InjectionTarget] (val x: Self) extends AnyVal {
      
      inline def setAllFrames(value: Boolean): Self = StObject.set(x, "allFrames", value.asInstanceOf[js.Any])
      
      inline def setAllFramesUndefined: Self = StObject.set(x, "allFrames", js.undefined)
      
      inline def setFrameIds(value: js.Array[Double]): Self = StObject.set(x, "frameIds", value.asInstanceOf[js.Any])
      
      inline def setFrameIdsUndefined: Self = StObject.set(x, "frameIds", js.undefined)
      
      inline def setFrameIdsVarargs(value: Double*): Self = StObject.set(x, "frameIds", js.Array(value*))
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  trait RegisteredContentScript extends StObject {
    
    var allFrames: js.UndefOr[Boolean] = js.undefined
    
    var css: js.UndefOr[js.Array[String]] = js.undefined
    
    var excludeMatches: js.UndefOr[js.Array[String]] = js.undefined
    
    var id: String
    
    @JSName("js")
    var js_ : js.UndefOr[js.Array[String]] = js.undefined
    
    var matchOriginAsFallback: js.UndefOr[Boolean] = js.undefined
    
    var matches: js.UndefOr[js.Array[String]] = js.undefined
    
    var persistAcrossSessions: js.UndefOr[Boolean] = js.undefined
    
    var runAt: js.UndefOr[document_start | document_end | document_idle] = js.undefined
    
    var world: js.UndefOr[ExecutionWorld] = js.undefined
  }
  object RegisteredContentScript {
    
    inline def apply(id: String): RegisteredContentScript = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredContentScript]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegisteredContentScript] (val x: Self) extends AnyVal {
      
      inline def setAllFrames(value: Boolean): Self = StObject.set(x, "allFrames", value.asInstanceOf[js.Any])
      
      inline def setAllFramesUndefined: Self = StObject.set(x, "allFrames", js.undefined)
      
      inline def setCss(value: js.Array[String]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setCssVarargs(value: String*): Self = StObject.set(x, "css", js.Array(value*))
      
      inline def setExcludeMatches(value: js.Array[String]): Self = StObject.set(x, "excludeMatches", value.asInstanceOf[js.Any])
      
      inline def setExcludeMatchesUndefined: Self = StObject.set(x, "excludeMatches", js.undefined)
      
      inline def setExcludeMatchesVarargs(value: String*): Self = StObject.set(x, "excludeMatches", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setJs_(value: js.Array[String]): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      inline def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
      
      inline def setJs_Varargs(value: String*): Self = StObject.set(x, "js", js.Array(value*))
      
      inline def setMatchOriginAsFallback(value: Boolean): Self = StObject.set(x, "matchOriginAsFallback", value.asInstanceOf[js.Any])
      
      inline def setMatchOriginAsFallbackUndefined: Self = StObject.set(x, "matchOriginAsFallback", js.undefined)
      
      inline def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
      
      inline def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value*))
      
      inline def setPersistAcrossSessions(value: Boolean): Self = StObject.set(x, "persistAcrossSessions", value.asInstanceOf[js.Any])
      
      inline def setPersistAcrossSessionsUndefined: Self = StObject.set(x, "persistAcrossSessions", js.undefined)
      
      inline def setRunAt(value: document_start | document_end | document_idle): Self = StObject.set(x, "runAt", value.asInstanceOf[js.Any])
      
      inline def setRunAtUndefined: Self = StObject.set(x, "runAt", js.undefined)
      
      inline def setWorld(value: ExecutionWorld): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
      
      inline def setWorldUndefined: Self = StObject.set(x, "world", js.undefined)
    }
  }
  
  type ScriptInjection[Args /* <: js.Array[Any] */, Result] = filesArraystringtargetInj | (Func[Result] & InjectImmediately) | ((ArgsFunc[Args, Result]) & InjectImmediately)
  
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
