package typings
package bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs

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
  sealed trait endsWith
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.FilterCompareOperator
  
  /** Determines if two values are equal. */
  @js.native
  sealed trait equals
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.FilterCompareOperator
  
  /** Determines if a first value is greater than a second value. */
  @js.native
  sealed trait greaterThan
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.FilterCompareOperator
  
  /** Determines if a first value is greater than or equal to a second value. */
  @js.native
  sealed trait greaterThanOrEqual
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.FilterCompareOperator
  
  /** Determines if a value is within an array. */
  @js.native
  sealed trait isIn
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.FilterCompareOperator
  
  /** Determines if a first value is less than a second value. */
  @js.native
  sealed trait lessThan
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.FilterCompareOperator
  
  /**  Determines if a first value is less than or equal a second value. */
  @js.native
  sealed trait lessThanOrEqual
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.FilterCompareOperator
  
  /** Determines if a string value does not end with a specified string value. */
  @js.native
  sealed trait notEndsWith
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.FilterCompareOperator
  
  /** Determines if two values are not equal. */
  @js.native
  sealed trait notEquals
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.FilterCompareOperator
  
  /** Determines if a string value does not start with a specified string value. */
  @js.native
  sealed trait notStartsWith
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.FilterCompareOperator
  
  /** Determines if a string value starts with a specified string value. */
  @js.native
  sealed trait startsWith
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.FilterCompareOperator
  
  /* 0 */ val endsWith: endsWith with scala.Double = js.native
  /* 1 */ @JSName("equals")
  val equals_FFilterCompareOperator: equals with scala.Double = js.native
  /* 2 */ val greaterThan: greaterThan with scala.Double = js.native
  /* 3 */ val greaterThanOrEqual: greaterThanOrEqual with scala.Double = js.native
  /* 4 */ val isIn: isIn with scala.Double = js.native
  /* 5 */ val lessThan: lessThan with scala.Double = js.native
  /* 6 */ val lessThanOrEqual: lessThanOrEqual with scala.Double = js.native
  /* 7 */ val notEndsWith: notEndsWith with scala.Double = js.native
  /* 8 */ val notEquals: notEquals with scala.Double = js.native
  /* 9 */ val notStartsWith: notStartsWith with scala.Double = js.native
  /* 10 */ val startsWith: startsWith with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.FilterCompareOperator with scala.Double
  ] = js.native
}

