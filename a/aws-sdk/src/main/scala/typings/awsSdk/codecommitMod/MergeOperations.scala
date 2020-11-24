package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeOperations extends js.Object {
  
  /**
    * The operation on a file in the destination of a merge or pull request.
    */
  var destination: js.UndefOr[ChangeTypeEnum] = js.native
  
  /**
    * The operation (add, modify, or delete) on a file in the source of a merge or pull request.
    */
  var source: js.UndefOr[ChangeTypeEnum] = js.native
}
object MergeOperations {
  
  @scala.inline
  def apply(): MergeOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeOperations]
  }
  
  @scala.inline
  implicit class MergeOperationsOps[Self <: MergeOperations] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: ChangeTypeEnum): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setSource(value: ChangeTypeEnum): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
