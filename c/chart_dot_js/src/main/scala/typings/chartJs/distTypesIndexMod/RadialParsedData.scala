package typings.chartJs.distTypesIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadialParsedData extends StObject {
  
  var r: Double
}
object RadialParsedData {
  
  inline def apply(r: Double): RadialParsedData = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialParsedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RadialParsedData] (val x: Self) extends AnyVal {
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
