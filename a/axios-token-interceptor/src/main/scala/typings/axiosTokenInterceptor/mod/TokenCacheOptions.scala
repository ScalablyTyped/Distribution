package typings.axiosTokenInterceptor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenCacheOptions extends js.Object {
  
  var getMaxAge: js.UndefOr[js.Function0[Double]] = js.native
  
  var maxAge: js.UndefOr[Double] = js.native
}
object TokenCacheOptions {
  
  @scala.inline
  def apply(): TokenCacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenCacheOptions]
  }
  
  @scala.inline
  implicit class TokenCacheOptionsOps[Self <: TokenCacheOptions] (val x: Self) extends AnyVal {
    
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
    def setGetMaxAge(value: () => Double): Self = this.set("getMaxAge", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMaxAge: Self = this.set("getMaxAge", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
  }
}
