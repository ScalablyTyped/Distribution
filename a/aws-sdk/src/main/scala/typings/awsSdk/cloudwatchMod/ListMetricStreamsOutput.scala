package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMetricStreamsOutput extends StObject {
  
  /**
    * The array of metric stream information.
    */
  var Entries: js.UndefOr[MetricStreamEntries] = js.undefined
  
  /**
    * The token that marks the start of the next batch of returned results. You can use this token in a subsequent operation to get the next batch of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.undefined
}
object ListMetricStreamsOutput {
  
  inline def apply(): ListMetricStreamsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMetricStreamsOutput]
  }
  
  extension [Self <: ListMetricStreamsOutput](x: Self) {
    
    inline def setEntries(value: MetricStreamEntries): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "Entries", js.undefined)
    
    inline def setEntriesVarargs(value: MetricStreamEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
