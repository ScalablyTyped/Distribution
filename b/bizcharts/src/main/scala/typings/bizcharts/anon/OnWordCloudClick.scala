package typings.bizcharts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnWordCloudClick extends StObject {
  
  var onWordCloudClick: js.UndefOr[js.Function3[/* item */ Any, /* dim */ Any, /* e */ Any, Unit]] = js.undefined
  
  var onWordCloudHover: js.UndefOr[js.Function3[/* item */ Any, /* dim */ Any, /* e */ Any, Unit]] = js.undefined
}
object OnWordCloudClick {
  
  inline def apply(): OnWordCloudClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnWordCloudClick]
  }
  
  extension [Self <: OnWordCloudClick](x: Self) {
    
    inline def setOnWordCloudClick(value: (/* item */ Any, /* dim */ Any, /* e */ Any) => Unit): Self = StObject.set(x, "onWordCloudClick", js.Any.fromFunction3(value))
    
    inline def setOnWordCloudClickUndefined: Self = StObject.set(x, "onWordCloudClick", js.undefined)
    
    inline def setOnWordCloudHover(value: (/* item */ Any, /* dim */ Any, /* e */ Any) => Unit): Self = StObject.set(x, "onWordCloudHover", js.Any.fromFunction3(value))
    
    inline def setOnWordCloudHoverUndefined: Self = StObject.set(x, "onWordCloudHover", js.undefined)
  }
}
