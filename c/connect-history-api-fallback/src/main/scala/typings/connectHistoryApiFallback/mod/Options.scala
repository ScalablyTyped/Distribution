package typings.connectHistoryApiFallback.mod

import typings.connectHistoryApiFallback.anon.FnCall
import typings.connectHistoryApiFallback.connectHistoryApiFallbackBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var disableDotRule: js.UndefOr[`true`] = js.native
  
  var htmlAcceptHeaders: js.UndefOr[js.Array[String]] = js.native
  
  var index: js.UndefOr[String] = js.native
  
  var logger: js.UndefOr[FnCall] = js.native
  
  var rewrites: js.UndefOr[js.Array[Rewrite]] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDisableDotRule(value: `true`): Self = this.set("disableDotRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDotRule: Self = this.set("disableDotRule", js.undefined)
    
    @scala.inline
    def setHtmlAcceptHeadersVarargs(value: String*): Self = this.set("htmlAcceptHeaders", js.Array(value :_*))
    
    @scala.inline
    def setHtmlAcceptHeaders(value: js.Array[String]): Self = this.set("htmlAcceptHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlAcceptHeaders: Self = this.set("htmlAcceptHeaders", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setLogger(value: FnCall): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setRewritesVarargs(value: Rewrite*): Self = this.set("rewrites", js.Array(value :_*))
    
    @scala.inline
    def setRewrites(value: js.Array[Rewrite]): Self = this.set("rewrites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRewrites: Self = this.set("rewrites", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
