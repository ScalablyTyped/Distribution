package typings.chrome.anon

import typings.chrome.chrome.scripting.ExecutionWorld
import typings.chrome.chrome.scripting.InjectionTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  /* Details specifying the target into which to inject the script. */
  var target: InjectionTarget
  
  /* The JavaScript world for a script to execute within. */
  var world: js.UndefOr[ExecutionWorld] = js.undefined
}
object Target {
  
  inline def apply(target: InjectionTarget): Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  extension [Self <: Target](x: Self) {
    
    inline def setTarget(value: InjectionTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setWorld(value: ExecutionWorld): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
    
    inline def setWorldUndefined: Self = StObject.set(x, "world", js.undefined)
  }
}
