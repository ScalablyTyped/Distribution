package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBuildBatchInput extends StObject {
  
  /**
    * The identifier of the batch build to delete.
    */
  var id: NonEmptyString = js.native
}
object DeleteBuildBatchInput {
  
  @scala.inline
  def apply(id: NonEmptyString): DeleteBuildBatchInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBuildBatchInput]
  }
  
  @scala.inline
  implicit class DeleteBuildBatchInputMutableBuilder[Self <: DeleteBuildBatchInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
