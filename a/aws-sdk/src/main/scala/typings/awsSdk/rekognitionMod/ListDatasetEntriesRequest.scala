package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetEntriesRequest extends StObject {
  
  /**
    * Specifies a label filter for the response. The response includes an entry only if one or more of the labels in ContainsLabels exist in the entry. 
    */
  var ContainsLabels: js.UndefOr[DatasetLabels] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) for the dataset that you want to use. 
    */
  var DatasetArn: typings.awsSdk.rekognitionMod.DatasetArn
  
  /**
    * Specifies an error filter for the response. Specify True to only include entries that have errors. 
    */
  var HasErrors: js.UndefOr[typings.awsSdk.rekognitionMod.HasErrors] = js.undefined
  
  /**
    *  Specify true to get only the JSON Lines where the image is labeled. Specify false to get only the JSON Lines where the image isn't labeled. If you don't specify Labeled, ListDatasetEntries returns JSON Lines for labeled and unlabeled images. 
    */
  var Labeled: js.UndefOr[IsLabeled] = js.undefined
  
  /**
    * The maximum number of results to return per paginated call. The largest value you can specify is 100. If you specify a value greater than 100, a ValidationException error occurs. The default value is 100. 
    */
  var MaxResults: js.UndefOr[ListDatasetEntriesPageSize] = js.undefined
  
  /**
    * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of results. 
    */
  var NextToken: js.UndefOr[ExtendedPaginationToken] = js.undefined
  
  /**
    * If specified, ListDatasetEntries only returns JSON Lines where the value of SourceRefContains is part of the source-ref field. The source-ref field contains the Amazon S3 location of the image. You can use SouceRefContains for tasks such as getting the JSON Line for a single image, or gettting JSON Lines for all images within a specific folder.
    */
  var SourceRefContains: js.UndefOr[QueryString] = js.undefined
}
object ListDatasetEntriesRequest {
  
  inline def apply(DatasetArn: DatasetArn): ListDatasetEntriesRequest = {
    val __obj = js.Dynamic.literal(DatasetArn = DatasetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatasetEntriesRequest]
  }
  
  extension [Self <: ListDatasetEntriesRequest](x: Self) {
    
    inline def setContainsLabels(value: DatasetLabels): Self = StObject.set(x, "ContainsLabels", value.asInstanceOf[js.Any])
    
    inline def setContainsLabelsUndefined: Self = StObject.set(x, "ContainsLabels", js.undefined)
    
    inline def setContainsLabelsVarargs(value: DatasetLabel*): Self = StObject.set(x, "ContainsLabels", js.Array(value*))
    
    inline def setDatasetArn(value: DatasetArn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    inline def setHasErrors(value: HasErrors): Self = StObject.set(x, "HasErrors", value.asInstanceOf[js.Any])
    
    inline def setHasErrorsUndefined: Self = StObject.set(x, "HasErrors", js.undefined)
    
    inline def setLabeled(value: IsLabeled): Self = StObject.set(x, "Labeled", value.asInstanceOf[js.Any])
    
    inline def setLabeledUndefined: Self = StObject.set(x, "Labeled", js.undefined)
    
    inline def setMaxResults(value: ListDatasetEntriesPageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: ExtendedPaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSourceRefContains(value: QueryString): Self = StObject.set(x, "SourceRefContains", value.asInstanceOf[js.Any])
    
    inline def setSourceRefContainsUndefined: Self = StObject.set(x, "SourceRefContains", js.undefined)
  }
}
