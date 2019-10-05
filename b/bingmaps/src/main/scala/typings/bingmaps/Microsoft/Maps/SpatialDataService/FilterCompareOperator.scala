package typings.bingmaps.Microsoft.Maps.SpatialDataService

import typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.equals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterCompareOperator extends js.Object

@JSGlobal("Microsoft.Maps.SpatialDataService.FilterCompareOperator")
@js.native
object FilterCompareOperator extends js.Object {
  /** Determines if a string value ends with a specified string value. */
  @js.native
  sealed trait endsWith extends FilterCompareOperator
  
  /** Determines if two values are equal. */
  @js.native
  sealed trait equals extends FilterCompareOperator
  
  /** Determines if a first value is greater than a second value. */
  @js.native
  sealed trait greaterThan extends FilterCompareOperator
  
  /** Determines if a first value is greater than or equal to a second value. */
  @js.native
  sealed trait greaterThanOrEqual extends FilterCompareOperator
  
  /** Determines if a value is within an array. */
  @js.native
  sealed trait isIn extends FilterCompareOperator
  
  /** Determines if a first value is less than a second value. */
  @js.native
  sealed trait lessThan extends FilterCompareOperator
  
  /**  Determines if a first value is less than or equal a second value. */
  @js.native
  sealed trait lessThanOrEqual extends FilterCompareOperator
  
  /** Determines if a string value does not end with a specified string value. */
  @js.native
  sealed trait notEndsWith extends FilterCompareOperator
  
  /** Determines if two values are not equal. */
  @js.native
  sealed trait notEquals extends FilterCompareOperator
  
  /** Determines if a string value does not start with a specified string value. */
  @js.native
  sealed trait notStartsWith extends FilterCompareOperator
  
  /** Determines if a string value starts with a specified string value. */
  @js.native
  sealed trait startsWith extends FilterCompareOperator
  
  /* 0 */ val endsWith: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.endsWith with Double = js.native
  /* 1 */ @JSName("equals")
  val equals_FFilterCompareOperator: equals with Double = js.native
  /* 2 */ val greaterThan: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.greaterThan with Double = js.native
  /* 3 */ val greaterThanOrEqual: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.greaterThanOrEqual with Double = js.native
  /* 4 */ val isIn: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.isIn with Double = js.native
  /* 5 */ val lessThan: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.lessThan with Double = js.native
  /* 6 */ val lessThanOrEqual: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.lessThanOrEqual with Double = js.native
  /* 7 */ val notEndsWith: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.notEndsWith with Double = js.native
  /* 8 */ val notEquals: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.notEquals with Double = js.native
  /* 9 */ val notStartsWith: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.notStartsWith with Double = js.native
  /* 10 */ val startsWith: typings.bingmaps.Microsoft.Maps.SpatialDataService.FilterCompareOperator.startsWith with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FilterCompareOperator with Double] = js.native
}

