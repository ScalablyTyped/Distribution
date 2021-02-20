package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEvaluationsInput extends StObject {
  
  /**
    * The equal to operator. The Evaluation results will have FilterVariable values that exactly match the value specified with EQ.
    */
  var EQ: js.UndefOr[ComparatorValue] = js.native
  
  /**
    * Use one of the following variable to filter a list of Evaluation objects:   CreatedAt - Sets the search criteria to the Evaluation creation date.  Status - Sets the search criteria to the Evaluation status.  Name - Sets the search criteria to the contents of Evaluation   Name.  IAMUser - Sets the search criteria to the user account that invoked an Evaluation.  MLModelId - Sets the search criteria to the MLModel that was evaluated.  DataSourceId - Sets the search criteria to the DataSource used in Evaluation.  DataUri - Sets the search criteria to the data file(s) used in Evaluation. The URL can identify either a file or an Amazon Simple Storage Solution (Amazon S3) bucket or directory. 
    */
  var FilterVariable: js.UndefOr[EvaluationFilterVariable] = js.native
  
  /**
    * The greater than or equal to operator. The Evaluation results will have FilterVariable values that are greater than or equal to the value specified with GE. 
    */
  var GE: js.UndefOr[ComparatorValue] = js.native
  
  /**
    * The greater than operator. The Evaluation results will have FilterVariable values that are greater than the value specified with GT.
    */
  var GT: js.UndefOr[ComparatorValue] = js.native
  
  /**
    * The less than or equal to operator. The Evaluation results will have FilterVariable values that are less than or equal to the value specified with LE.
    */
  var LE: js.UndefOr[ComparatorValue] = js.native
  
  /**
    * The less than operator. The Evaluation results will have FilterVariable values that are less than the value specified with LT.
    */
  var LT: js.UndefOr[ComparatorValue] = js.native
  
  /**
    *  The maximum number of Evaluation to include in the result.
    */
  var Limit: js.UndefOr[PageLimit] = js.native
  
  /**
    * The not equal to operator. The Evaluation results will have FilterVariable values not equal to the value specified with NE.
    */
  var NE: js.UndefOr[ComparatorValue] = js.native
  
  /**
    * The ID of the page in the paginated results.
    */
  var NextToken: js.UndefOr[StringType] = js.native
  
  /**
    * A string that is found at the beginning of a variable, such as Name or Id. For example, an Evaluation could have the Name 2014-09-09-HolidayGiftMailer. To search for this Evaluation, select Name for the FilterVariable and any of the following strings for the Prefix:   2014-09 2014-09-09 2014-09-09-Holiday 
    */
  var Prefix: js.UndefOr[ComparatorValue] = js.native
  
  /**
    * A two-value parameter that determines the sequence of the resulting list of Evaluation.   asc - Arranges the list in ascending order (A-Z, 0-9).  dsc - Arranges the list in descending order (Z-A, 9-0).  Results are sorted by FilterVariable.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.machinelearningMod.SortOrder] = js.native
}
object DescribeEvaluationsInput {
  
  @scala.inline
  def apply(): DescribeEvaluationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEvaluationsInput]
  }
  
  @scala.inline
  implicit class DescribeEvaluationsInputMutableBuilder[Self <: DescribeEvaluationsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEQ(value: ComparatorValue): Self = StObject.set(x, "EQ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEQUndefined: Self = StObject.set(x, "EQ", js.undefined)
    
    @scala.inline
    def setFilterVariable(value: EvaluationFilterVariable): Self = StObject.set(x, "FilterVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterVariableUndefined: Self = StObject.set(x, "FilterVariable", js.undefined)
    
    @scala.inline
    def setGE(value: ComparatorValue): Self = StObject.set(x, "GE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGEUndefined: Self = StObject.set(x, "GE", js.undefined)
    
    @scala.inline
    def setGT(value: ComparatorValue): Self = StObject.set(x, "GT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGTUndefined: Self = StObject.set(x, "GT", js.undefined)
    
    @scala.inline
    def setLE(value: ComparatorValue): Self = StObject.set(x, "LE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLEUndefined: Self = StObject.set(x, "LE", js.undefined)
    
    @scala.inline
    def setLT(value: ComparatorValue): Self = StObject.set(x, "LT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLTUndefined: Self = StObject.set(x, "LT", js.undefined)
    
    @scala.inline
    def setLimit(value: PageLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNE(value: ComparatorValue): Self = StObject.set(x, "NE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNEUndefined: Self = StObject.set(x, "NE", js.undefined)
    
    @scala.inline
    def setNextToken(value: StringType): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPrefix(value: ComparatorValue): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
