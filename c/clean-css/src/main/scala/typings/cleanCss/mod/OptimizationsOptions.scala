package typings.cleanCss.mod

import typings.cleanCss.anon.All
import typings.cleanCss.anon.MergeAdjacentRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fine grained options for configuring optimizations
  */
@js.native
trait OptimizationsOptions extends js.Object {
  
  var `1`: js.UndefOr[All] = js.native
  
  var `2`: js.UndefOr[MergeAdjacentRules] = js.native
}
object OptimizationsOptions {
  
  @scala.inline
  def apply(): OptimizationsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptimizationsOptions]
  }
  
  @scala.inline
  implicit class OptimizationsOptionsOps[Self <: OptimizationsOptions] (val x: Self) extends AnyVal {
    
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
    def set1(value: All): Self = this.set("1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete1: Self = this.set("1", js.undefined)
    
    @scala.inline
    def set2(value: MergeAdjacentRules): Self = this.set("2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete2: Self = this.set("2", js.undefined)
  }
}
