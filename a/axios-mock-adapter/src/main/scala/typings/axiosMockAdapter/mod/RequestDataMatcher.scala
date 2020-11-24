package typings.axiosMockAdapter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestDataMatcher
  extends /* index */ StringDictionary[js.Any]
     with AsymmetricRequestDataMatcher {
  
  var params: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object RequestDataMatcher {
  
  @scala.inline
  def apply(): RequestDataMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestDataMatcher]
  }
  
  @scala.inline
  implicit class RequestDataMatcherOps[Self <: RequestDataMatcher] (val x: Self) extends AnyVal {
    
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
    def setParams(value: StringDictionary[js.Any]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
}
