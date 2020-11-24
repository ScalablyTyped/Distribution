package typings.axiosMockAdapter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsymmetricMatcher extends AsymmetricRequestDataMatcher {
  
  var asymmetricMatch: js.Function = js.native
}
object AsymmetricMatcher {
  
  @scala.inline
  def apply(asymmetricMatch: js.Function): AsymmetricMatcher = {
    val __obj = js.Dynamic.literal(asymmetricMatch = asymmetricMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsymmetricMatcher]
  }
  
  @scala.inline
  implicit class AsymmetricMatcherOps[Self <: AsymmetricMatcher] (val x: Self) extends AnyVal {
    
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
    def setAsymmetricMatch(value: js.Function): Self = this.set("asymmetricMatch", value.asInstanceOf[js.Any])
  }
}
