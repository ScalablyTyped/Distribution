package typings.chartJs.mod

import typings.chartJs.anon.BarEnd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarParsedData
  extends StObject
     with CartesianParsedData {
  
  // Only specified if floating bars are show
  var _custom: js.UndefOr[BarEnd] = js.undefined
}
object BarParsedData {
  
  inline def apply(x: Double, y: Double): BarParsedData = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarParsedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarParsedData] (val x: Self) extends AnyVal {
    
    inline def set_custom(value: BarEnd): Self = StObject.set(x, "_custom", value.asInstanceOf[js.Any])
    
    inline def set_customUndefined: Self = StObject.set(x, "_custom", js.undefined)
  }
}
