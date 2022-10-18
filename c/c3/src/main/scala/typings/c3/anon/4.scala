package typings.c3.anon

import typings.c3.c3Strings.`step-after`
import typings.c3.c3Strings.`step-before`
import typings.c3.c3Strings.step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  /**
    * Change step type for step chart.
    * Defaults to `"step"`.
    */
  var `type`: step | `step-before` | `step-after`
}
object `4` {
  
  inline def apply(`type`: step | `step-before` | `step-after`): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setType(value: step | `step-before` | `step-after`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
