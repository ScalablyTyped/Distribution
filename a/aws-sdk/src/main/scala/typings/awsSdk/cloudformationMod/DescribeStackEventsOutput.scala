package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStackEventsOutput extends StObject {
  
  /**
    * If the output exceeds 1 MB in size, a string that identifies the next page of events. If no additional page exists, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.undefined
  
  /**
    * A list of StackEvents structures.
    */
  var StackEvents: js.UndefOr[typings.awsSdk.cloudformationMod.StackEvents] = js.undefined
}
object DescribeStackEventsOutput {
  
  inline def apply(): DescribeStackEventsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackEventsOutput]
  }
  
  extension [Self <: DescribeStackEventsOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStackEvents(value: StackEvents): Self = StObject.set(x, "StackEvents", value.asInstanceOf[js.Any])
    
    inline def setStackEventsUndefined: Self = StObject.set(x, "StackEvents", js.undefined)
    
    inline def setStackEventsVarargs(value: StackEvent*): Self = StObject.set(x, "StackEvents", js.Array(value :_*))
  }
}
