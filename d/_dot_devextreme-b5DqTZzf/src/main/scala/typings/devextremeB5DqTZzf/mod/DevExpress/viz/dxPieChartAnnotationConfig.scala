package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPieChartAnnotationConfig
  extends StObject
     with dxPieChartCommonAnnotationConfig {
  
  /**
    * Specifies the annotation&apos;s name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object dxPieChartAnnotationConfig {
  
  inline def apply(): dxPieChartAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPieChartAnnotationConfig]
  }
  
  extension [Self <: dxPieChartAnnotationConfig](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
