package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Difference extends js.Object {
  
  /**
    * Information about an afterBlob data type object, including the ID, the file mode permission code, and the path.
    */
  var afterBlob: js.UndefOr[BlobMetadata] = js.native
  
  /**
    * Information about a beforeBlob data type object, including the ID, the file mode permission code, and the path.
    */
  var beforeBlob: js.UndefOr[BlobMetadata] = js.native
  
  /**
    * Whether the change type of the difference is an addition (A), deletion (D), or modification (M).
    */
  var changeType: js.UndefOr[ChangeTypeEnum] = js.native
}
object Difference {
  
  @scala.inline
  def apply(): Difference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Difference]
  }
  
  @scala.inline
  implicit class DifferenceOps[Self <: Difference] (val x: Self) extends AnyVal {
    
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
    def setAfterBlob(value: BlobMetadata): Self = this.set("afterBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterBlob: Self = this.set("afterBlob", js.undefined)
    
    @scala.inline
    def setBeforeBlob(value: BlobMetadata): Self = this.set("beforeBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeBlob: Self = this.set("beforeBlob", js.undefined)
    
    @scala.inline
    def setChangeType(value: ChangeTypeEnum): Self = this.set("changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeType: Self = this.set("changeType", js.undefined)
  }
}
