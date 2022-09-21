package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontConstructor
  extends StObject
     with DefaultConstructor[Font]
     with /**
  * Constructs Font with default values with Typeface and size in points,
  * horizontal scale, and horizontal skew. Horizontal scale emulates condensed
  * and expanded fonts. Horizontal skew emulates oblique fonts.
  * @param face
  * @param size
  * @param scaleX
  * @param skewX
  */
Instantiable4[
      (/* face */ Null) | (/* face */ Typeface), 
      /* size */ Double, 
      /* scaleX */ Double, 
      /* skewX */ Double, 
      Font
    ]
     with Instantiable1[/* face */ Typeface, Font]
     with Instantiable2[(/* face */ Null) | (/* face */ Typeface), /* size */ Double, Font]
