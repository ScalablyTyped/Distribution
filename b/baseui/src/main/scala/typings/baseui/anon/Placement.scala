package typings.baseui.anon

import typings.baseui.toastTypesMod.PlacementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placement extends StObject {
  
  @JSName("$placement")
  var $placement: PlacementType
}
object Placement {
  
  inline def apply($placement: PlacementType): Placement = {
    val __obj = js.Dynamic.literal($placement = $placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Placement] (val x: Self) extends AnyVal {
    
    inline def set$placement(value: PlacementType): Self = StObject.set(x, "$placement", value.asInstanceOf[js.Any])
  }
}
