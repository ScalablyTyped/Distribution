package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailureDescription extends StObject {
  
  /**
    * A message providing details about the error that caused the failure.
    */
  var Details: NonEmptyString = js.native
  
  /**
    * The type of error that caused the failure.
    */
  var Type: DeliveryStreamFailureType = js.native
}
object FailureDescription {
  
  @scala.inline
  def apply(Details: NonEmptyString, Type: DeliveryStreamFailureType): FailureDescription = {
    val __obj = js.Dynamic.literal(Details = Details.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailureDescription]
  }
  
  @scala.inline
  implicit class FailureDescriptionMutableBuilder[Self <: FailureDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: NonEmptyString): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DeliveryStreamFailureType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
