package typings.cleanCss.mod

import typings.cleanCss.AnonEfficiency
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
  var stats: AnonEfficiency
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
    stats: AnonEfficiency,
    styles: String,
    warnings: js.Array[String]
  ): Output = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Output]
  }
}

