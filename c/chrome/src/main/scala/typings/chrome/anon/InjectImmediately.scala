package typings.chrome.anon

import typings.chrome.chrome.scripting.ExecutionWorld
import typings.chrome.chrome.scripting.InjectionTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InjectImmediately extends StObject {
  
  /* Whether the injection should be triggered in the target as soon as possible. Note that this is not a guarantee that injection will occur prior to page load, as the page may have already loaded by the time the script reaches the target. */
  var injectImmediately: js.UndefOr[Boolean] = js.undefined
  
  /* Details specifying the target into which to inject the script. */
  var target: InjectionTarget
  
  /* The JavaScript world for a script to execute within. */
  var world: js.UndefOr[ExecutionWorld] = js.undefined
}
object InjectImmediately {
  
  inline def apply(target: InjectionTarget): InjectImmediately = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectImmediately]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InjectImmediately] (val x: Self) extends AnyVal {
    
    inline def setInjectImmediately(value: Boolean): Self = StObject.set(x, "injectImmediately", value.asInstanceOf[js.Any])
    
    inline def setInjectImmediatelyUndefined: Self = StObject.set(x, "injectImmediately", js.undefined)
    
    inline def setTarget(value: InjectionTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setWorld(value: ExecutionWorld): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
    
    inline def setWorldUndefined: Self = StObject.set(x, "world", js.undefined)
  }
}
