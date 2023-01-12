package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionViewOptions extends StObject {
  
  /**
    * DEPRECATED: If you replace the current view with a new view by calling show, by
    * default it will automatically destroy the previous view. You can
    * prevent this behavior by setting this option to true.
    */
  var preventDestroy: js.UndefOr[Boolean] = js.undefined
}
object RegionViewOptions {
  
  inline def apply(): RegionViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionViewOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegionViewOptions] (val x: Self) extends AnyVal {
    
    inline def setPreventDestroy(value: Boolean): Self = StObject.set(x, "preventDestroy", value.asInstanceOf[js.Any])
    
    inline def setPreventDestroyUndefined: Self = StObject.set(x, "preventDestroy", js.undefined)
  }
}
