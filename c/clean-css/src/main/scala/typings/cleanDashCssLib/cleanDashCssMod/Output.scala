package typings
package cleanDashCssLib.cleanDashCssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output returned when calling minify functions
  */
trait Output extends js.Object {
  /**
    * A list of errors raised
    */
  var errors: js.Array[java.lang.String]
  /**
    * Output source map if requested with `sourceMap` option
    */
  var sourceMap: java.lang.String
  /**
    * Contains statistics on the minify process
    */
  var stats: cleanDashCssLib.Anon_Efficiency
  /**
    * Optimized output CSS as a string
    */
  var styles: java.lang.String
  /**
    * A list of warnings raised
    */
  var warnings: js.Array[java.lang.String]
}

object Output {
  @scala.inline
  def apply(
    errors: js.Array[java.lang.String],
    sourceMap: java.lang.String,
    stats: cleanDashCssLib.Anon_Efficiency,
    styles: java.lang.String,
    warnings: js.Array[java.lang.String]
  ): Output = {
    val __obj = js.Dynamic.literal(errors = errors, sourceMap = sourceMap, stats = stats, styles = styles, warnings = warnings)
  
    __obj.asInstanceOf[Output]
  }
}

