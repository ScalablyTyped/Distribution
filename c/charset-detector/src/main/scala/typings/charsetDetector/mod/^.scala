package typings.charsetDetector.mod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("charset-detector", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * ICU based port of charset detection to javascript
    * @param input accept node Buffer, but will work with anything that follow such rules:
    *              - allow indexing by []
    *              - has .length
    *              - each numbered property is byte 0-255
    * @param matchers charset detectors, default value is `detect.DEFAULT_CS_RECOGNIZERS`
    * @returns array of matches sorted by most confident first
    */
  def apply(input: ArrayLike[Double]): js.Array[CharsetMatch] = js.native
  def apply(input: ArrayLike[Double], matchers: js.Array[CharsetMatcher]): js.Array[CharsetMatch] = js.native
}
