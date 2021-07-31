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
  var TestWindowEnd: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The time at which the test began.
    */
  var TestWindowStart: js.UndefOr[Timestamp] = js.undefined
}
object TestWindowSummary {
  
  @scala.inline
  def apply(): TestWindowSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestWindowSummary]
  }
  
  @scala.inline
  implicit class TestWindowSummaryMutableBuilder[Self <: TestWindowSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTestWindowEnd(value: Timestamp): Self = StObject.set(x, "TestWindowEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestWindowEndUndefined: Self = StObject.set(x, "TestWindowEnd", js.undefined)
    
    @scala.inline
    def setTestWindowStart(value: Timestamp): Self = StObject.set(x, "TestWindowStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestWindowStartUndefined: Self = StObject.set(x, "TestWindowStart", js.undefined)
  }
}
