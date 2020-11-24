package typings.cleanCss.mod

import typings.cleanCss.anon.Efficiency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output returned when calling minify functions
  */
@js.native
trait Output extends js.Object {
  
  /**
    * A list of errors raised
    */
  var errors: js.Array[String] = js.native
  
  /**
    * Output source map if requested with `sourceMap` option
    */
  var sourceMap: String = js.native
  
  /**
    * Contains statistics on the minify process
    */
  var stats: Efficiency = js.native
  
  /**
    * Optimized output CSS as a string
    */
  var styles: String = js.native
  
  /**
    * A list of warnings raised
    */
  var warnings: js.Array[String] = js.native
}
object Output {
  
  @scala.inline
  def apply(
    errors: js.Array[String],
    sourceMap: String,
    stats: Efficiency,
    styles: String,
    warnings: js.Array[String]
  ): Output = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorsVarargs(value: String*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMap(value: String): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: Efficiency): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: String): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = this.set("warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = this.set("warnings", value.asInstanceOf[js.Any])
  }
}
