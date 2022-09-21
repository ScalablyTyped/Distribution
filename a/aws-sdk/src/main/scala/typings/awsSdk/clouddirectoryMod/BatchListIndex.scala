package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchListIndex extends StObject {
  
  /**
    * The reference to the index to list.
    */
  var IndexReference: ObjectReference
  
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.undefined
  
  /**
    * Specifies the ranges of indexed values that you want to query.
    */
  var RangesOnIndexedValues: js.UndefOr[ObjectAttributeRangeList] = js.undefined
}
object BatchListIndex {
  
  inline def apply(IndexReference: ObjectReference): BatchListIndex = {
    val __obj = js.Dynamic.literal(IndexReference = IndexReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchListIndex]
  }
  
  extension [Self <: BatchListIndex](x: Self) {
    
    inline def setIndexReference(value: ObjectReference): Self = StObject.set(x, "IndexReference", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: NumberResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRangesOnIndexedValues(value: ObjectAttributeRangeList): Self = StObject.set(x, "RangesOnIndexedValues", value.asInstanceOf[js.Any])
    
    inline def setRangesOnIndexedValuesUndefined: Self = StObject.set(x, "RangesOnIndexedValues", js.undefined)
    
    inline def setRangesOnIndexedValuesVarargs(value: ObjectAttributeRange*): Self = StObject.set(x, "RangesOnIndexedValues", js.Array(value*))
  }
}
