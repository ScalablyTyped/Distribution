package typings.dashdash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HelpConfiguration extends js.Object {
  
  /**
    * Set to a number (for that many spaces) or a string for the literal indent.
    * This indent applies to group heading lines, between normal option lines.
    * Default: half length of `indent`
    */
  var headingIndent: js.UndefOr[Double | String] = js.native
  
  /**
    * If not set a reasonable value will be determined between minHelpCol and maxHelpCol.
    */
  var helpCol: js.UndefOr[Double] = js.native
  
  /**
    * Set to `false` to have option `help` strings not be textwrapped to the helpCol..maxCol range.
    * Default: true
    */
  var helpWrap: js.UndefOr[Boolean] = js.native
  
  /**
    * If the option has a default value (via the default option spec attribute, or a default on the option's type), then a "Default: VALUE" string will be appended to the help string.
    * Default: false
    */
  var includeDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * If the option has associated environment variables (via the env option spec attribute), then append mentioned of those envvars to the help string.
    * Default: false
    */
  var includeEnv: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to a number (for that many spaces) or a string for the literal indent.
    * Default: 4
    */
  var indent: js.UndefOr[Double | String] = js.native
  
  /**
    * Note that reflow is just done on whitespace so a long token in the option help can overflow maxCol.
    * Default: 80
    */
  var maxCol: js.UndefOr[Double] = js.native
  
  /**
    * Default: 40
    */
  var maxHelpCol: js.UndefOr[Double] = js.native
  
  /**
    * Default: 20
    */
  var minHelpCol: js.UndefOr[Double] = js.native
  
  /**
    * By default the names are sorted to put the short opts first (i.e. '-h, --help' preferred to '--help, -h').
    * Set to 'none' to not do this sorting.
    * Default: 'length'
    */
  var nameSort: js.UndefOr[String] = js.native
}
object HelpConfiguration {
  
  @scala.inline
  def apply(): HelpConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HelpConfiguration]
  }
  
  @scala.inline
  implicit class HelpConfigurationOps[Self <: HelpConfiguration] (val x: Self) extends AnyVal {
    
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
    def setHeadingIndent(value: Double | String): Self = this.set("headingIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadingIndent: Self = this.set("headingIndent", js.undefined)
    
    @scala.inline
    def setHelpCol(value: Double): Self = this.set("helpCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelpCol: Self = this.set("helpCol", js.undefined)
    
    @scala.inline
    def setHelpWrap(value: Boolean): Self = this.set("helpWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelpWrap: Self = this.set("helpWrap", js.undefined)
    
    @scala.inline
    def setIncludeDefault(value: Boolean): Self = this.set("includeDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDefault: Self = this.set("includeDefault", js.undefined)
    
    @scala.inline
    def setIncludeEnv(value: Boolean): Self = this.set("includeEnv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeEnv: Self = this.set("includeEnv", js.undefined)
    
    @scala.inline
    def setIndent(value: Double | String): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setMaxCol(value: Double): Self = this.set("maxCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCol: Self = this.set("maxCol", js.undefined)
    
    @scala.inline
    def setMaxHelpCol(value: Double): Self = this.set("maxHelpCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHelpCol: Self = this.set("maxHelpCol", js.undefined)
    
    @scala.inline
    def setMinHelpCol(value: Double): Self = this.set("minHelpCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHelpCol: Self = this.set("minHelpCol", js.undefined)
    
    @scala.inline
    def setNameSort(value: String): Self = this.set("nameSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameSort: Self = this.set("nameSort", js.undefined)
  }
}
