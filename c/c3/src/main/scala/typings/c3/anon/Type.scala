package typings.c3.anon

import typings.c3.c3Strings.`basis-closed`
import typings.c3.c3Strings.`basis-open`
import typings.c3.c3Strings.`cardinal-closed`
import typings.c3.c3Strings.`cardinal-open`
import typings.c3.c3Strings.`linear-closed`
import typings.c3.c3Strings.`step-after`
import typings.c3.c3Strings.`step-before`
import typings.c3.c3Strings.basis
import typings.c3.c3Strings.bundle
import typings.c3.c3Strings.cardinal
import typings.c3.c3Strings.linear
import typings.c3.c3Strings.monotone
import typings.c3.c3Strings.step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  /**
    * Set custom spline interpolation
    */
  var `type`: js.UndefOr[
    linear | `linear-closed` | basis | `basis-open` | `basis-closed` | bundle | cardinal | `cardinal-open` | `cardinal-closed` | monotone | step | `step-before` | `step-after`
  ] = js.undefined
}
object Type {
  
  inline def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setType(
      value: linear | `linear-closed` | basis | `basis-open` | `basis-closed` | bundle | cardinal | `cardinal-open` | `cardinal-closed` | monotone | step | `step-before` | `step-after`
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
