package typings
package colorDashNamerLib.colorDashNamerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ColorNamerNs {
  type Colors[T /* <: Palette */] = stdLib.Record[T, js.Array[Color]]
  type Palette = colorDashNamerLib.colorDashNamerLibStrings.roygbiv | colorDashNamerLib.colorDashNamerLibStrings.basic | colorDashNamerLib.colorDashNamerLibStrings.html | colorDashNamerLib.colorDashNamerLibStrings.x11 | colorDashNamerLib.colorDashNamerLibStrings.pantone | colorDashNamerLib.colorDashNamerLibStrings.ntc
}
