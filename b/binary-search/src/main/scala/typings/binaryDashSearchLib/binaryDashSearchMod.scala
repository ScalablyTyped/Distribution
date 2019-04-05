package typings
package binaryDashSearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("binary-search", JSImport.Namespace)
@js.native
object binaryDashSearchMod extends js.Object {
  def apply[A, B](
    haystack: stdLib.ArrayLike[A],
    needle: B,
    comparator: js.Function4[
      /* a */ A, 
      /* b */ B, 
      /* index */ js.UndefOr[scala.Double], 
      /* haystack */ js.UndefOr[js.Array[A]], 
      _
    ]
  ): scala.Double = js.native
  def apply[A, B](
    haystack: stdLib.ArrayLike[A],
    needle: B,
    comparator: js.Function4[
      /* a */ A, 
      /* b */ B, 
      /* index */ js.UndefOr[scala.Double], 
      /* haystack */ js.UndefOr[js.Array[A]], 
      _
    ],
    // Notes about comparator return value:
  // * when a<b the comparator's returned value should be:
  //   * negative number or a value such that `+value` is a negative number
  //   * examples: `-1` or the string `"-1"`
  // * when a>b the comparator's returned value should be:
  //   * positive number or a value such that `+value` is a positive number
  //   * examples: `1` or the string `"1"`
  // * when a===b
  //    * any value other than the return cases for a<b and a>b
  //    * examples: undefined, NaN, 'abc'
  low: scala.Double
  ): scala.Double = js.native
  def apply[A, B](
    haystack: stdLib.ArrayLike[A],
    needle: B,
    comparator: js.Function4[
      /* a */ A, 
      /* b */ B, 
      /* index */ js.UndefOr[scala.Double], 
      /* haystack */ js.UndefOr[js.Array[A]], 
      _
    ],
    // Notes about comparator return value:
  // * when a<b the comparator's returned value should be:
  //   * negative number or a value such that `+value` is a negative number
  //   * examples: `-1` or the string `"-1"`
  // * when a>b the comparator's returned value should be:
  //   * positive number or a value such that `+value` is a positive number
  //   * examples: `1` or the string `"1"`
  // * when a===b
  //    * any value other than the return cases for a<b and a>b
  //    * examples: undefined, NaN, 'abc'
  low: scala.Double,
    high: scala.Double
  ): scala.Double = js.native
}

