package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearTickOptions
  extends StObject
     with TickOptions {
  
  var precision: js.UndefOr[Double] = js.undefined
}
object LinearTickOptions {
  
  inline def apply(): LinearTickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearTickOptions]
  }
  
  extension [Self <: LinearTickOptions](x: Self) {
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
  }
}
