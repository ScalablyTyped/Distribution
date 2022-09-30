package typings.compare

import typings.compare.compareInts.`-1`
import typings.compare.compareInts.`0`
import typings.compare.compareInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(left: String, right: String): `-1` | `0` | `1` = (^.asInstanceOf[js.Dynamic].apply(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[`-1` | `0` | `1`]
  /**
    * Compare primitives the right way (using `<`, `>` and `==`).
    *
    * This function does the right thing with numbers and ascii strings. Normally
    * `String.prototype.localeCompare` is recommended for strings, but that can have nasty
    * side effects on some machines, eg.
    * ```
    * 'cu'.localeCompare('cs', 'hu')
    * ```
    * Compare the above in stock node (which doesn't come with `Intl`) and a browser of
    * your choice (which most likely has `Intl` support).
    *
    * @example
    * import compare = require('compare')
    * [1, 2, 10].sort() // [1, 10, 2]
    * [1, 2, 10].sort(compare) // [1, 2, 10]
    *
    * // Below is sorted correctly according to Hungarian, but runtimes without Intl
    * // support will reorder them
    * ['cu', 'cs'].sort((a, b) => a.localeCompare(b, 'hu'))
    * ['cu', 'cs'].sort(compare) // This will always sort the same
    */
  inline def apply(left: Double, right: Double): `-1` | `0` | `1` = (^.asInstanceOf[js.Dynamic].apply(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[`-1` | `0` | `1`]
  
  @JSImport("compare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
