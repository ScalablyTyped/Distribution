package typings.cypress.typesNetStubbingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterceptOptions extends StObject {
  
  /**
    * If set to `false`, matching requests will not be shown in the Command Log.
    * @default true
    */
  var log: js.UndefOr[Boolean] = js.undefined
}
object InterceptOptions {
  
  inline def apply(): InterceptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterceptOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterceptOptions] (val x: Self) extends AnyVal {
    
    inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
  }
}
