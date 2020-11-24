package typings.awsSdkClientCodecommitNode.typesDifferenceMod

import typings.awsSdkClientCodecommitNode.typesBlobMetadataMod.UnmarshalledBlobMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledDifference extends Difference {
  
  /**
    * <p>Information about an <code>afterBlob</code> data type object, including the ID, the file mode permission code, and the path.</p>
    */
  @JSName("afterBlob")
  var afterBlob_UnmarshalledDifference: js.UndefOr[UnmarshalledBlobMetadata] = js.native
  
  /**
    * <p>Information about a <code>beforeBlob</code> data type object, including the ID, the file mode permission code, and the path.</p>
    */
  @JSName("beforeBlob")
  var beforeBlob_UnmarshalledDifference: js.UndefOr[UnmarshalledBlobMetadata] = js.native
}
object UnmarshalledDifference {
  
  @scala.inline
  def apply(): UnmarshalledDifference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledDifference]
  }
  
  @scala.inline
  implicit class UnmarshalledDifferenceOps[Self <: UnmarshalledDifference] (val x: Self) extends AnyVal {
    
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
    def setAfterBlob(value: UnmarshalledBlobMetadata): Self = this.set("afterBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterBlob: Self = this.set("afterBlob", js.undefined)
    
    @scala.inline
    def setBeforeBlob(value: UnmarshalledBlobMetadata): Self = this.set("beforeBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeBlob: Self = this.set("beforeBlob", js.undefined)
  }
}
