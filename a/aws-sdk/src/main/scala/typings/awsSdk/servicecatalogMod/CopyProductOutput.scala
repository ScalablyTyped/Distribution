package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyProductOutput extends js.Object {
  
  /**
    * The token to use to track the progress of the operation.
    */
  var CopyProductToken: js.UndefOr[Id] = js.native
}
object CopyProductOutput {
  
  @scala.inline
  def apply(): CopyProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyProductOutput]
  }
  
  @scala.inline
  implicit class CopyProductOutputOps[Self <: CopyProductOutput] (val x: Self) extends AnyVal {
    
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
    def setCopyProductToken(value: Id): Self = this.set("CopyProductToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyProductToken: Self = this.set("CopyProductToken", js.undefined)
  }
}
