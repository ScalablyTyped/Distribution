package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTimeToLiveOutput extends StObject {
  
  /**
    * Represents the output of an UpdateTimeToLive operation.
    */
  var TimeToLiveSpecification: js.UndefOr[typings.awsSdk.dynamodbMod.TimeToLiveSpecification] = js.native
}
object UpdateTimeToLiveOutput {
  
  @scala.inline
  def apply(): UpdateTimeToLiveOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTimeToLiveOutput]
  }
  
  @scala.inline
  implicit class UpdateTimeToLiveOutputMutableBuilder[Self <: UpdateTimeToLiveOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeToLiveSpecification(value: TimeToLiveSpecification): Self = StObject.set(x, "TimeToLiveSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToLiveSpecificationUndefined: Self = StObject.set(x, "TimeToLiveSpecification", js.undefined)
  }
}
