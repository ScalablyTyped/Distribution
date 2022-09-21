package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxLoadIndicatorOptions
  extends StObject
     with WidgetOptions[dxLoadIndicator] {
  
  /**
    * Specifies the path to an image used as the indicator.
    */
  var indicatorSrc: js.UndefOr[String] = js.undefined
}
object dxLoadIndicatorOptions {
  
  inline def apply(): dxLoadIndicatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLoadIndicatorOptions]
  }
  
  extension [Self <: dxLoadIndicatorOptions](x: Self) {
    
    inline def setIndicatorSrc(value: String): Self = StObject.set(x, "indicatorSrc", value.asInstanceOf[js.Any])
    
    inline def setIndicatorSrcUndefined: Self = StObject.set(x, "indicatorSrc", js.undefined)
  }
}
