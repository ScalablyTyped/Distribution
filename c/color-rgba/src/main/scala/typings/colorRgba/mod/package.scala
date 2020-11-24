package typings.colorRgba

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.colorRgba.mod.RGBTuple
    - typings.colorRgba.mod.RGBColor
    - typings.colorRgba.mod.RGBKeyedColor
    - typings.colorRgba.mod.HSL
  */
  type ColorValue = typings.colorRgba.mod._ColorValue | java.lang.String | typings.colorRgba.mod.RGBTuple
  
  type RGBTuple = js.Tuple3[scala.Double, scala.Double, scala.Double]
}
