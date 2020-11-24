package typings.copyWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyPluginOptions extends js.Object {
  
  var options: js.UndefOr[Options] = js.native
  
  var patterns: js.Array[StringPattern | ObjectPattern] = js.native
}
object CopyPluginOptions {
  
  @scala.inline
  def apply(patterns: js.Array[StringPattern | ObjectPattern]): CopyPluginOptions = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyPluginOptions]
  }
  
  @scala.inline
  implicit class CopyPluginOptionsOps[Self <: CopyPluginOptions] (val x: Self) extends AnyVal {
    
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
    def setPatternsVarargs(value: (StringPattern | ObjectPattern)*): Self = this.set("patterns", js.Array(value :_*))
    
    @scala.inline
    def setPatterns(value: js.Array[StringPattern | ObjectPattern]): Self = this.set("patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
