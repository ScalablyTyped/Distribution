package typings.chartJs.mod

import typings.chartJs.chartJsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TickOptions
  extends StObject
     with NestedTickOptions {
  
  var major: js.UndefOr[MajorTickOptions | `false`] = js.undefined
  
  var minor: js.UndefOr[NestedTickOptions | `false`] = js.undefined
}
object TickOptions {
  
  inline def apply(): TickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TickOptions]
  }
  
  extension [Self <: TickOptions](x: Self) {
    
    inline def setMajor(value: MajorTickOptions | `false`): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
    
    inline def setMinor(value: NestedTickOptions | `false`): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    inline def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
  }
}
