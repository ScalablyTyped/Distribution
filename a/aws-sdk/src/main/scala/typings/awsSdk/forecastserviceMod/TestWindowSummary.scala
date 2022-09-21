package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestWindowSummary extends StObject {
  
  /**
    * If the test failed, the reason why it failed.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The status of the test. Possible status values are:    ACTIVE     CREATE_IN_PROGRESS     CREATE_FAILED   
    */
  var Status: js.UndefOr[typings.awsSdk.forecastserviceMod.Status] = js.undefined
  
  /**
    * The time at which the test ended.
    */
  var TestWindowEnd: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which the test began.
    */
  var TestWindowStart: js.UndefOr[js.Date] = js.undefined
}
object TestWindowSummary {
  
  inline def apply(): TestWindowSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestWindowSummary]
  }
  
  extension [Self <: TestWindowSummary](x: Self) {
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTestWindowEnd(value: js.Date): Self = StObject.set(x, "TestWindowEnd", value.asInstanceOf[js.Any])
    
    inline def setTestWindowEndUndefined: Self = StObject.set(x, "TestWindowEnd", js.undefined)
    
    inline def setTestWindowStart(value: js.Date): Self = StObject.set(x, "TestWindowStart", value.asInstanceOf[js.Any])
    
    inline def setTestWindowStartUndefined: Self = StObject.set(x, "TestWindowStart", js.undefined)
  }
}
