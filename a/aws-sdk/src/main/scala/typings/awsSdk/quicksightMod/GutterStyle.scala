package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GutterStyle extends StObject {
  
  /**
    * This Boolean value controls whether to display a gutter space between sheet tiles. 
    */
  var Show: js.UndefOr[scala.Boolean] = js.undefined
}
object GutterStyle {
  
  inline def apply(): GutterStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GutterStyle]
  }
  
  extension [Self <: GutterStyle](x: Self) {
    
    inline def setShow(value: scala.Boolean): Self = StObject.set(x, "Show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "Show", js.undefined)
  }
}
