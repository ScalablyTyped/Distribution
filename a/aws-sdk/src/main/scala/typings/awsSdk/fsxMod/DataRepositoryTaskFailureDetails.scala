package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRepositoryTaskFailureDetails extends StObject {
  
  var Message: js.UndefOr[ErrorMessage] = js.undefined
}
object DataRepositoryTaskFailureDetails {
  
  @scala.inline
  def apply(): DataRepositoryTaskFailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRepositoryTaskFailureDetails]
  }
  
  @scala.inline
  implicit class DataRepositoryTaskFailureDetailsMutableBuilder[Self <: DataRepositoryTaskFailureDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
