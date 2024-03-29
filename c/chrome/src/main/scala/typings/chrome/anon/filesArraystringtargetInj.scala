package typings.chrome.anon

import typings.chrome.chrome.scripting.ExecutionWorld
import typings.chrome.chrome.scripting.InjectionTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  files :std.Array<string>} & {  target :chrome.chrome.scripting.InjectionTarget,   world :chrome.chrome.scripting.ExecutionWorld | undefined,   injectImmediately :boolean | undefined} */
trait filesArraystringtargetInj extends StObject {
  
  /* The path of the JS files to inject, relative to the extension's root directory. NOTE: Currently a maximum of one file is supported. Exactly one of files and function must be specified. */
  var files: js.Array[String]
  
  /* Whether the injection should be triggered in the target as soon as possible. Note that this is not a guarantee that injection will occur prior to page load, as the page may have already loaded by the time the script reaches the target. */
  var injectImmediately: js.UndefOr[Boolean] = js.undefined
  
  /* Details specifying the target into which to inject the script. */
  var target: InjectionTarget
  
  /* The JavaScript world for a script to execute within. */
  var world: js.UndefOr[ExecutionWorld] = js.undefined
}
object filesArraystringtargetInj {
  
  inline def apply(files: js.Array[String], target: InjectionTarget): filesArraystringtargetInj = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[filesArraystringtargetInj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: filesArraystringtargetInj] (val x: Self) extends AnyVal {
    
    inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setInjectImmediately(value: Boolean): Self = StObject.set(x, "injectImmediately", value.asInstanceOf[js.Any])
    
    inline def setInjectImmediatelyUndefined: Self = StObject.set(x, "injectImmediately", js.undefined)
    
    inline def setTarget(value: InjectionTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setWorld(value: ExecutionWorld): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
    
    inline def setWorldUndefined: Self = StObject.set(x, "world", js.undefined)
  }
}
