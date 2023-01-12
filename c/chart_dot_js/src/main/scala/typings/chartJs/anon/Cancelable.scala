package typings.chartJs.anon

import typings.chartJs.chartJsBooleans.`true`
import typings.chartJs.mod.UpdateMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancelable extends StObject {
  
  var cancelable: `true`
  
  var mode: UpdateMode
}
object Cancelable {
  
  inline def apply(mode: UpdateMode): Cancelable = {
    val __obj = js.Dynamic.literal(cancelable = true, mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancelable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cancelable] (val x: Self) extends AnyVal {
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setMode(value: UpdateMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
