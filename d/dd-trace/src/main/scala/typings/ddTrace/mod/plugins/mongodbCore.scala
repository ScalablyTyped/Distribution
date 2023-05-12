package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [mongodb-core](https://github.com/mongodb-js/mongodb-core) module.
  */
trait mongodbCore
  extends StObject
     with Instrumentation {
  
  /**
    * Whether to include the query contents in the resource name.
    */
  var queryInResourceName: js.UndefOr[Boolean] = js.undefined
}
object mongodbCore {
  
  inline def apply(): mongodbCore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[mongodbCore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: mongodbCore] (val x: Self) extends AnyVal {
    
    inline def setQueryInResourceName(value: Boolean): Self = StObject.set(x, "queryInResourceName", value.asInstanceOf[js.Any])
    
    inline def setQueryInResourceNameUndefined: Self = StObject.set(x, "queryInResourceName", js.undefined)
  }
}
