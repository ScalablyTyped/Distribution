package typings.bloomFilter.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterOptions extends js.Object {
  
  var nFlags: js.UndefOr[Double] = js.native
  
  var nHashFuncs: Double = js.native
  
  var nTweak: js.UndefOr[Double] = js.native
  
  var vData: Buffer = js.native
}
object FilterOptions {
  
  @scala.inline
  def apply(nHashFuncs: Double, vData: Buffer): FilterOptions = {
    val __obj = js.Dynamic.literal(nHashFuncs = nHashFuncs.asInstanceOf[js.Any], vData = vData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptions]
  }
  
  @scala.inline
  implicit class FilterOptionsOps[Self <: FilterOptions] (val x: Self) extends AnyVal {
    
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
    def setNHashFuncs(value: Double): Self = this.set("nHashFuncs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVData(value: Buffer): Self = this.set("vData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNFlags(value: Double): Self = this.set("nFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNFlags: Self = this.set("nFlags", js.undefined)
    
    @scala.inline
    def setNTweak(value: Double): Self = this.set("nTweak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNTweak: Self = this.set("nTweak", js.undefined)
  }
}
