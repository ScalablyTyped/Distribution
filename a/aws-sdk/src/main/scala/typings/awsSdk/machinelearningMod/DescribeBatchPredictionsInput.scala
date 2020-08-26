package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBatchPredictionsInput extends js.Object {
  /**
    * The equal to operator. The BatchPrediction results will have FilterVariable values that exactly match the value specified with EQ.
    */
  var EQ: js.UndefOr[ComparatorValue] = js.native
  /**
    * Use one of the following variables to filter a list of BatchPrediction:   CreatedAt - Sets the search criteria to the BatchPrediction creation date.  Status - Sets the search criteria to the BatchPrediction status.  Name - Sets the search criteria to the contents of the BatchPrediction  Name.  IAMUser - Sets the search criteria to the user account that invoked the BatchPrediction creation.  MLModelId - Sets the search criteria to the MLModel used in the BatchPrediction.  DataSourceId - Sets the search criteria to the DataSource used in the BatchPrediction.  DataURI - Sets the search criteria to the data file(s) used in the BatchPrediction. The URL can identify either a file or an Amazon Simple Storage Solution (Amazon S3) bucket or directory. 
    */
  var FilterVariable: js.UndefOr[BatchPredictionFilterVariable] = js.native
  /**
    * The greater than or equal to operator. The BatchPrediction results will have FilterVariable values that are greater than or equal to the value specified with GE. 
    */
  var GE: js.UndefOr[ComparatorValue] = js.native
  /**
    * The greater than operator. The BatchPrediction results will have FilterVariable values that are greater than the value specified with GT.
    */
  var GT: js.UndefOr[ComparatorValue] = js.native
  /**
    * The less than or equal to operator. The BatchPrediction results will have FilterVariable values that are less than or equal to the value specified with LE.
    */
  var LE: js.UndefOr[ComparatorValue] = js.native
  /**
    * The less than operator. The BatchPrediction results will have FilterVariable values that are less than the value specified with LT.
    */
  var LT: js.UndefOr[ComparatorValue] = js.native
  /**
    * The number of pages of information to include in the result. The range of acceptable values is 1 through 100. The default value is 100.
    */
  var Limit: js.UndefOr[PageLimit] = js.native
  /**
    * The not equal to operator. The BatchPrediction results will have FilterVariable values not equal to the value specified with NE.
    */
  var NE: js.UndefOr[ComparatorValue] = js.native
  /**
    * An ID of the page in the paginated results.
    */
  var NextToken: js.UndefOr[StringType] = js.native
  /**
    * A string that is found at the beginning of a variable, such as Name or Id. For example, a Batch Prediction operation could have the Name 2014-09-09-HolidayGiftMailer. To search for this BatchPrediction, select Name for the FilterVariable and any of the following strings for the Prefix:   2014-09 2014-09-09 2014-09-09-Holiday 
    */
  var Prefix: js.UndefOr[ComparatorValue] = js.native
  /**
    * A two-value parameter that determines the sequence of the resulting list of MLModels.   asc - Arranges the list in ascending order (A-Z, 0-9).  dsc - Arranges the list in descending order (Z-A, 9-0).  Results are sorted by FilterVariable.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.machinelearningMod.SortOrder] = js.native
}

object DescribeBatchPredictionsInput {
  @scala.inline
  def apply(): DescribeBatchPredictionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBatchPredictionsInput]
  }
  @scala.inline
  implicit class DescribeBatchPredictionsInputOps[Self <: DescribeBatchPredictionsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEQ(value: ComparatorValue): Self = this.set("EQ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEQ: Self = this.set("EQ", js.undefined)
    @scala.inline
    def setFilterVariable(value: BatchPredictionFilterVariable): Self = this.set("FilterVariable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterVariable: Self = this.set("FilterVariable", js.undefined)
    @scala.inline
    def setGE(value: ComparatorValue): Self = this.set("GE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGE: Self = this.set("GE", js.undefined)
    @scala.inline
    def setGT(value: ComparatorValue): Self = this.set("GT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGT: Self = this.set("GT", js.undefined)
    @scala.inline
    def setLE(value: ComparatorValue): Self = this.set("LE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLE: Self = this.set("LE", js.undefined)
    @scala.inline
    def setLT(value: ComparatorValue): Self = this.set("LT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLT: Self = this.set("LT", js.undefined)
    @scala.inline
    def setLimit(value: PageLimit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNE(value: ComparatorValue): Self = this.set("NE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNE: Self = this.set("NE", js.undefined)
    @scala.inline
    def setNextToken(value: StringType): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPrefix(value: ComparatorValue): Self = this.set("Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("Prefix", js.undefined)
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("SortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("SortOrder", js.undefined)
  }
  
}

