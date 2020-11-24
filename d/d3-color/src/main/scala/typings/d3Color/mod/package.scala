package typings.d3Color

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GrayColorFactory = /**
    * Constructs a new CIELAB color with the specified l value and a = b = 0.
    *
    * @param l Lightness typically in the range [0, 100].
    * @param opacity Optional opacity value, defaults to 1.
    */
  js.Function2[
    /* l */ scala.Double, 
    /* opacity */ js.UndefOr[scala.Double], 
    typings.d3Color.mod.LabColor
  ]
}
