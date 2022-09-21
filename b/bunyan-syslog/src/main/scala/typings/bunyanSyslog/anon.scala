package typings.bunyanSyslog

import typings.bunyanSyslog.mod.EnumerateInternal
import typings.bunyanSyslog.mod.PrependNextNum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[A /* <: js.Array[Any] */, N /* <: Double */] extends StObject {
    
    var `0`: A
    
    var `1`: EnumerateInternal[PrependNextNum[A], N]
  }
  object `0` {
    
    inline def apply[A /* <: js.Array[Any] */, N /* <: Double */](`0`: A, `1`: EnumerateInternal[PrependNextNum[A], N]): `0`[A, N] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`[A, N]]
    }
    
    extension [Self <: `0`[?, ?], A /* <: js.Array[Any] */, N /* <: Double */](x: Self & (`0`[A, N])) {
      
      inline def set0(value: A): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set1(value: EnumerateInternal[PrependNextNum[A], N]): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    }
  }
}
