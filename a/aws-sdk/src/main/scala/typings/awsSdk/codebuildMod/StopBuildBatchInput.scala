package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopBuildBatchInput extends StObject {
  
  /**
    * The identifier of the batch build to stop.
    */
  var id: NonEmptyString
}
object StopBuildBatchInput {
  
  @scala.inline
  def apply(id: NonEmptyString): StopBuildBatchInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopBuildBatchInput]
  }
  
  @scala.inline
  implicit class StopBuildBatchInputMutableBuilder[Self <: StopBuildBatchInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
