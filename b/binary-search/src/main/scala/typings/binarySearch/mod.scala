package typings.binarySearch

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[A, B](
    haystack: ArrayLike[A],
    needle: B,
    comparator: js.Function4[
      /* a */ A, 
      /* b */ B, 
      /* index */ js.UndefOr[Double], 
      /* haystack */ js.UndefOr[js.Array[A]], 
      Any
    ]
  ): Double = (^.asInstanceOf[js.Dynamic].apply(haystack.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply[A, B](
    haystack: ArrayLike[A],
    needle: B,
    comparator: js.Function4[
      /* a */ A, 
      /* b */ B, 
      /* index */ js.UndefOr[Double], 
      /* haystack */ js.UndefOr[js.Array[A]], 
      Any
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
  low: Double
  ): Double = (^.asInstanceOf[js.Dynamic].apply(haystack.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any], low.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply[A, B](
    haystack: ArrayLike[A],
    needle: B,
    comparator: js.Function4[
      /* a */ A, 
      /* b */ B, 
      /* index */ js.UndefOr[Double], 
      /* haystack */ js.UndefOr[js.Array[A]], 
      Any
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
  low: Double,
    high: Double
  ): Double = (^.asInstanceOf[js.Dynamic].apply(haystack.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any], low.asInstanceOf[js.Any], high.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply[A, B](
    haystack: ArrayLike[A],
    needle: B,
    comparator: js.Function4[
      /* a */ A, 
      /* b */ B, 
      /* index */ js.UndefOr[Double], 
      /* haystack */ js.UndefOr[js.Array[A]], 
      Any
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
  low: Unit,
    high: Double
  ): Double = (^.asInstanceOf[js.Dynamic].apply(haystack.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any], low.asInstanceOf[js.Any], high.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("binary-search", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
