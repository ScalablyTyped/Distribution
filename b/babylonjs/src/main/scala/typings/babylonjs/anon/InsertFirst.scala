package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertFirst extends js.Object {
  
  var insertFirst: js.UndefOr[Boolean] = js.native
  
  var mask: js.UndefOr[Double] = js.native
  
  var scope: js.UndefOr[js.Any] = js.native
}
object InsertFirst {
  
  @scala.inline
  def apply(): InsertFirst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertFirst]
  }
  
  @scala.inline
  implicit class InsertFirstOps[Self <: InsertFirst] (val x: Self) extends AnyVal {
    
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
    def setInsertFirst(value: Boolean): Self = this.set("insertFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertFirst: Self = this.set("insertFirst", js.undefined)
    
    @scala.inline
    def setMask(value: Double): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
