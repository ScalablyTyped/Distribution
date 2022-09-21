package typings.ddTrace.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
trait Analyzable extends StObject {
  
  /**
    * Whether to measure the span. Can also be set to a key-value pair with span
    * names as keys and booleans as values for more granular control.
    */
  var measured: js.UndefOr[Boolean | StringDictionary[Boolean]] = js.undefined
}
object Analyzable {
  
  inline def apply(): Analyzable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Analyzable]
  }
  
  extension [Self <: Analyzable](x: Self) {
    
    inline def setMeasured(value: Boolean | StringDictionary[Boolean]): Self = StObject.set(x, "measured", value.asInstanceOf[js.Any])
    
    inline def setMeasuredUndefined: Self = StObject.set(x, "measured", js.undefined)
  }
}
