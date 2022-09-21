package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventTopicsResult extends StObject {
  
  /**
    * A list of Amazon SNS topic names that receive status messages from the specified Directory ID.
    */
  var EventTopics: js.UndefOr[typings.awsSdk.directoryserviceMod.EventTopics] = js.undefined
}
object DescribeEventTopicsResult {
  
  inline def apply(): DescribeEventTopicsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventTopicsResult]
  }
  
  extension [Self <: DescribeEventTopicsResult](x: Self) {
    
    inline def setEventTopics(value: EventTopics): Self = StObject.set(x, "EventTopics", value.asInstanceOf[js.Any])
    
    inline def setEventTopicsUndefined: Self = StObject.set(x, "EventTopics", js.undefined)
    
    inline def setEventTopicsVarargs(value: EventTopic*): Self = StObject.set(x, "EventTopics", js.Array(value*))
  }
}
