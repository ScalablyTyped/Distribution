package typings.cassandraDriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyBuffer extends js.Object {
  
  var copyBuffer: js.UndefOr[Boolean] = js.native
  
  var map: js.UndefOr[js.Function] = js.native
  
  var set: js.UndefOr[js.Function] = js.native
  
  var useBigIntAsLong: js.UndefOr[Boolean] = js.native
  
  var useBigIntAsVarint: js.UndefOr[Boolean] = js.native
  
  var useUndefinedAsUnset: js.UndefOr[Boolean] = js.native
}
object CopyBuffer {
  
  @scala.inline
  def apply(): CopyBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyBuffer]
  }
  
  @scala.inline
  implicit class CopyBufferOps[Self <: CopyBuffer] (val x: Self) extends AnyVal {
    
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
    def setCopyBuffer(value: Boolean): Self = this.set("copyBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyBuffer: Self = this.set("copyBuffer", js.undefined)
    
    @scala.inline
    def setMap(value: js.Function): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setSet(value: js.Function): Self = this.set("set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    
    @scala.inline
    def setUseBigIntAsLong(value: Boolean): Self = this.set("useBigIntAsLong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseBigIntAsLong: Self = this.set("useBigIntAsLong", js.undefined)
    
    @scala.inline
    def setUseBigIntAsVarint(value: Boolean): Self = this.set("useBigIntAsVarint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseBigIntAsVarint: Self = this.set("useBigIntAsVarint", js.undefined)
    
    @scala.inline
    def setUseUndefinedAsUnset(value: Boolean): Self = this.set("useUndefinedAsUnset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseUndefinedAsUnset: Self = this.set("useUndefinedAsUnset", js.undefined)
  }
}
