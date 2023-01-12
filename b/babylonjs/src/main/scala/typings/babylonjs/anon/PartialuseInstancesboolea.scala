package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  useInstances :boolean}> */
trait PartialuseInstancesboolea extends StObject {
  
  var useInstances: js.UndefOr[Boolean] = js.undefined
}
object PartialuseInstancesboolea {
  
  inline def apply(): PartialuseInstancesboolea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialuseInstancesboolea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialuseInstancesboolea] (val x: Self) extends AnyVal {
    
    inline def setUseInstances(value: Boolean): Self = StObject.set(x, "useInstances", value.asInstanceOf[js.Any])
    
    inline def setUseInstancesUndefined: Self = StObject.set(x, "useInstances", js.undefined)
  }
}
