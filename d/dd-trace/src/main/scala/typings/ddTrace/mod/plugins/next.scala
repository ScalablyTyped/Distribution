package typings.ddTrace.mod.plugins

import typings.ddTrace.anon.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [next](https://nextjs.org/) module.
  */
trait next
  extends StObject
     with Instrumentation {
  
  /**
    * Hooks to run before spans are finished.
    */
  var hooks: js.UndefOr[Request] = js.undefined
}
object next {
  
  inline def apply(): next = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[next]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: next] (val x: Self) extends AnyVal {
    
    inline def setHooks(value: Request): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
  }
}
