package typings.chardet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<chardet.chardet.FullOptions> */
  trait PartialFullOptions extends StObject {
    
    var sampleSize: js.UndefOr[Double] = js.undefined
  }
  object PartialFullOptions {
    
    inline def apply(): PartialFullOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFullOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialFullOptions] (val x: Self) extends AnyVal {
      
      inline def setSampleSize(value: Double): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
      
      inline def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    }
  }
}
