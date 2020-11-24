package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsStartIncluded extends js.Object {
  
  var data: js.UndefOr[js.Any] = js.native
  
  var isStartIncluded: js.UndefOr[Boolean] = js.native
  
  var isStopIncluded: js.UndefOr[Boolean] = js.native
  
  var iso8601: String = js.native
}
object IsStartIncluded {
  
  @scala.inline
  def apply(iso8601: String): IsStartIncluded = {
    val __obj = js.Dynamic.literal(iso8601 = iso8601.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsStartIncluded]
  }
  
  @scala.inline
  implicit class IsStartIncludedOps[Self <: IsStartIncluded] (val x: Self) extends AnyVal {
    
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
    def setIso8601(value: String): Self = this.set("iso8601", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setIsStartIncluded(value: Boolean): Self = this.set("isStartIncluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsStartIncluded: Self = this.set("isStartIncluded", js.undefined)
    
    @scala.inline
    def setIsStopIncluded(value: Boolean): Self = this.set("isStopIncluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsStopIncluded: Self = this.set("isStopIncluded", js.undefined)
  }
}
