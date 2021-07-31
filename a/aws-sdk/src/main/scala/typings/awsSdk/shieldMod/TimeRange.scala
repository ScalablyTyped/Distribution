package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeRange extends StObject {
  
  /**
    * The start time, in Unix time in seconds. For more information see timestamp.
    */
  var FromInclusive: js.UndefOr[AttackTimestamp] = js.undefined
  
  /**
    * The end time, in Unix time in seconds. For more information see timestamp.
    */
  var ToExclusive: js.UndefOr[AttackTimestamp] = js.undefined
}
object TimeRange {
  
  @scala.inline
  def apply(): TimeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeRange]
  }
  
  @scala.inline
  implicit class TimeRangeMutableBuilder[Self <: TimeRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromInclusive(value: AttackTimestamp): Self = StObject.set(x, "FromInclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromInclusiveUndefined: Self = StObject.set(x, "FromInclusive", js.undefined)
    
    @scala.inline
    def setToExclusive(value: AttackTimestamp): Self = StObject.set(x, "ToExclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToExclusiveUndefined: Self = StObject.set(x, "ToExclusive", js.undefined)
  }
}
