package typings.codeExcerpt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("code-excerpt", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Extract code excerpts
    */
  def apply(
    /**
  	 * Source code
  	 */
  source: String,
    /**
  	 * Line number to extract excerpt for.
  	 */
  line: Double
  ): js.UndefOr[js.Array[ExcerptLine]] = js.native
  def apply(
    /**
  	 * Source code
  	 */
  source: String,
    /**
  	 * Line number to extract excerpt for.
  	 */
  line: Double,
    /**
  	 * Options
  	 */
  options: Options
  ): js.UndefOr[js.Array[ExcerptLine]] = js.native
}

