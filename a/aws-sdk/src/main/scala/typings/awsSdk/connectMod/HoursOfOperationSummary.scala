package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoursOfOperationSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the hours of operation.
    */
  var Arn: js.UndefOr[ARN] = js.native
  
  /**
    * The identifier of the hours of operation.
    */
  var Id: js.UndefOr[HoursOfOperationId] = js.native
  
  /**
    * The name of the hours of operation.
    */
  var Name: js.UndefOr[HoursOfOperationName] = js.native
}
object HoursOfOperationSummary {
  
  @scala.inline
  def apply(): HoursOfOperationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoursOfOperationSummary]
  }
  
  @scala.inline
  implicit class HoursOfOperationSummaryMutableBuilder[Self <: HoursOfOperationSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setId(value: HoursOfOperationId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: HoursOfOperationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
