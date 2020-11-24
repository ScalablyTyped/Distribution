package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInvalidationResult extends js.Object {
  
  /**
    * The invalidation's information. For more information, see Invalidation Complex Type. 
    */
  var Invalidation: js.UndefOr[typings.awsSdk.cloudfrontMod.Invalidation] = js.native
}
object GetInvalidationResult {
  
  @scala.inline
  def apply(): GetInvalidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInvalidationResult]
  }
  
  @scala.inline
  implicit class GetInvalidationResultOps[Self <: GetInvalidationResult] (val x: Self) extends AnyVal {
    
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
    def setInvalidation(value: Invalidation): Self = this.set("Invalidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidation: Self = this.set("Invalidation", js.undefined)
  }
}
