package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertFirst extends StObject {
  
  var insertFirst: js.UndefOr[Boolean] = js.undefined
  
  var mask: js.UndefOr[Double] = js.undefined
  
  var scope: js.UndefOr[Any] = js.undefined
}
object InsertFirst {
  
  inline def apply(): InsertFirst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertFirst]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertFirst] (val x: Self) extends AnyVal {
    
    inline def setInsertFirst(value: Boolean): Self = StObject.set(x, "insertFirst", value.asInstanceOf[js.Any])
    
    inline def setInsertFirstUndefined: Self = StObject.set(x, "insertFirst", js.undefined)
    
    inline def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setScope(value: Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
