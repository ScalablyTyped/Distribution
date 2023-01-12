package typings.browserSync.mod

import typings.browserSync.anon.Port
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIOptions extends StObject {
  
  /** set the default port */
  var port: js.UndefOr[Double] = js.undefined
  
  /** set the default weinre port */
  var weinre: js.UndefOr[Port] = js.undefined
}
object UIOptions {
  
  inline def apply(): UIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UIOptions] (val x: Self) extends AnyVal {
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setWeinre(value: Port): Self = StObject.set(x, "weinre", value.asInstanceOf[js.Any])
    
    inline def setWeinreUndefined: Self = StObject.set(x, "weinre", js.undefined)
  }
}
