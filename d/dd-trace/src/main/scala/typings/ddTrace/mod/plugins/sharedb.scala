package typings.ddTrace.mod.plugins

import typings.ddTrace.anon.Receive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [sharedb](https://github.com/share/sharedb) module.
  */
trait sharedb
  extends StObject
     with Integration {
  
  /**
    * Hooks to run before spans are finished.
    */
  var hooks: js.UndefOr[Receive] = js.undefined
}
object sharedb {
  
  inline def apply(): sharedb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[sharedb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: sharedb] (val x: Self) extends AnyVal {
    
    inline def setHooks(value: Receive): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
  }
}
