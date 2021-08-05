package typings.ddTrace.mod.plugins

import typings.ddTrace.anon.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [elasticsearch](https://github.com/elastic/elasticsearch-js) module.
  */
trait elasticsearch
  extends StObject
     with Instrumentation {
  
  /**
    * Hooks to run before spans are finished.
    */
  var hooks: js.UndefOr[Query] = js.undefined
}
object elasticsearch {
  
  inline def apply(): elasticsearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[elasticsearch]
  }
  
  extension [Self <: elasticsearch](x: Self) {
    
    inline def setHooks(value: Query): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
  }
}
