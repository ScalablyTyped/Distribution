package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIndexRequest extends StObject {
  
  /**
    * The consistency level to execute the request at.
    */
  var ConsistencyLevel: js.UndefOr[typings.awsSdk.clouddirectoryMod.ConsistencyLevel] = js.undefined
  
  /**
    * The ARN of the directory that the index exists in.
    */
  var DirectoryArn: Arn
  
  /**
    * The reference to the index to list.
    */
  var IndexReference: ObjectReference
  
  /**
    * The maximum number of objects in a single page to retrieve from the index during a request. For more information, see Amazon Cloud Directory Limits.
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
object ListIndexRequest {
  
  inline def apply(DirectoryArn: Arn, IndexReference: ObjectReference): ListIndexRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], IndexReference = IndexReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIndexRequest]
  }
  
  extension [Self <: ListIndexRequest](x: Self) {
    
    inline def setConsistencyLevel(value: ConsistencyLevel): Self = StObject.set(x, "ConsistencyLevel", value.asInstanceOf[js.Any])
    
    inline def setConsistencyLevelUndefined: Self = StObject.set(x, "ConsistencyLevel", js.undefined)
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
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
