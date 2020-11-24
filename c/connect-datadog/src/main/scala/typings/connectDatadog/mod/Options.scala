package typings.connectDatadog.mod

import typings.hotShots.mod.StatsD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var base_url: js.UndefOr[Boolean] = js.native
  
  var dogstatsd: js.UndefOr[StatsD] = js.native
  
  var method: js.UndefOr[Boolean] = js.native
  
  var path: js.UndefOr[Boolean] = js.native
  
  var protocol: js.UndefOr[Boolean] = js.native
  
  var response_code: js.UndefOr[Boolean] = js.native
  
  var stat: js.UndefOr[String] = js.native
  
  var tags: js.UndefOr[js.Array[String]] = js.native
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
    def setBase_url(value: Boolean): Self = this.set("base_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase_url: Self = this.set("base_url", js.undefined)
    
    @scala.inline
    def setDogstatsd(value: StatsD): Self = this.set("dogstatsd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDogstatsd: Self = this.set("dogstatsd", js.undefined)
    
    @scala.inline
    def setMethod(value: Boolean): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setPath(value: Boolean): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setProtocol(value: Boolean): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setResponse_code(value: Boolean): Self = this.set("response_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse_code: Self = this.set("response_code", js.undefined)
    
    @scala.inline
    def setStat(value: String): Self = this.set("stat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStat: Self = this.set("stat", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
