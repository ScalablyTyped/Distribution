package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoursOfOperationSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the hours of operation.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the hours of operation.
    */
  var Id: js.UndefOr[HoursOfOperationId] = js.undefined
  
  /**
    * The name of the hours of operation.
    */
  var Name: js.UndefOr[HoursOfOperationName] = js.undefined
}
object HoursOfOperationSummary {
  
  inline def apply(): HoursOfOperationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoursOfOperationSummary]
  }
  
  extension [Self <: HoursOfOperationSummary](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: HoursOfOperationId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: HoursOfOperationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
