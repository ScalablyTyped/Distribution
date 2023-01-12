package typings.chartist.anon

import typings.chartist.distCoreTypesMod.NormalizedMulti
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XNumber
  extends StObject
     with NormalizedMulti {
  
  var x: Double
}
object XNumber {
  
  inline def apply(x: Double): XNumber = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[XNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XNumber] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
  }
}
