package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataflowDetail extends StObject {
  
  var destination: js.UndefOr[Destination] = js.undefined
  
  /**
    * Error message for a dataflow.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[Source] = js.undefined
}
object DataflowDetail {
  
  @scala.inline
  def apply(): DataflowDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataflowDetail]
  }
  
  @scala.inline
  implicit class DataflowDetailMutableBuilder[Self <: DataflowDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: Destination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
