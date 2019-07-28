package typings.cleanDashCss.cleanDashCssMod

import typings.cleanDashCss.Anon_Efficiency
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
  var errors: js.Array[String]
  /**
    * Output source map if requested with `sourceMap` option
    */
  var sourceMap: String
  /**
    * Contains statistics on the minify process
    */
  var stats: Anon_Efficiency
  /**
    * Optimized output CSS as a string
    */
  var styles: String
  /**
    * A list of warnings raised
    */
  var warnings: js.Array[String]
}

object Output {
  @scala.inline
  def apply(
    errors: js.Array[String],
    sourceMap: String,
    stats: Anon_Efficiency,
    styles: String,
    warnings: js.Array[String]
  ): Output = {
    val __obj = js.Dynamic.literal(errors = errors, sourceMap = sourceMap, stats = stats, styles = styles, warnings = warnings)
  
    __obj.asInstanceOf[Output]
  }
}

