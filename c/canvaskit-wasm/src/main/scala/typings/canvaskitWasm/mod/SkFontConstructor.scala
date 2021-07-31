package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkFontConstructor
  extends StObject
     with DefaultConstructor[SkFont]
     with /**
  * Constructs SkFont with default values with SkTypeface and size in points,
  * horizontal scale, and horizontal skew. Horizontal scale emulates condensed
  * and expanded fonts. Horizontal skew emulates oblique fonts.
  * @param face
  * @param size
  * @param scaleX
  * @param skewX
  */
Instantiable4[
      (/* face */ Null) | (/* face */ SkTypeface), 
      /* size */ Double, 
      /* scaleX */ Double, 
      /* skewX */ Double, 
      SkFont
    ]
     with Instantiable1[/* face */ SkTypeface, SkFont]
     with Instantiable2[(/* face */ Null) | (/* face */ SkTypeface), /* size */ Double, SkFont]
