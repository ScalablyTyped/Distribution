package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BubbleParsedData
  extends StObject
     with CartesianParsedData {
  
  // The bubble radius value
  var _custom: Double
}
object BubbleParsedData {
  
  inline def apply(_custom: Double, x: Double, y: Double): BubbleParsedData = {
    val __obj = js.Dynamic.literal(_custom = _custom.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BubbleParsedData]
  }
  
  extension [Self <: BubbleParsedData](x: Self) {
    
    inline def set_custom(value: Double): Self = StObject.set(x, "_custom", value.asInstanceOf[js.Any])
  }
}
