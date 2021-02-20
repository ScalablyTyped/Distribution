package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletedMultipartUpload extends StObject {
  
  /**
    * Array of CompletedPart data types.
    */
  var Parts: js.UndefOr[CompletedPartList] = js.native
}
object CompletedMultipartUpload {
  
  @scala.inline
  def apply(): CompletedMultipartUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompletedMultipartUpload]
  }
  
  @scala.inline
  implicit class CompletedMultipartUploadMutableBuilder[Self <: CompletedMultipartUpload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParts(value: CompletedPartList): Self = StObject.set(x, "Parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartsUndefined: Self = StObject.set(x, "Parts", js.undefined)
    
    @scala.inline
    def setPartsVarargs(value: CompletedPart*): Self = StObject.set(x, "Parts", js.Array(value :_*))
  }
}
