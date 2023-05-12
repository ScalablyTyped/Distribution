package typings.blockStream2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Size extends StObject {
    
    var size: js.UndefOr[Double] = js.undefined
    
    var zeroPadding: js.UndefOr[Boolean] = js.undefined
  }
  object Size {
    
    inline def apply(): Size = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setZeroPadding(value: Boolean): Self = StObject.set(x, "zeroPadding", value.asInstanceOf[js.Any])
      
      inline def setZeroPaddingUndefined: Self = StObject.set(x, "zeroPadding", js.undefined)
    }
  }
}
