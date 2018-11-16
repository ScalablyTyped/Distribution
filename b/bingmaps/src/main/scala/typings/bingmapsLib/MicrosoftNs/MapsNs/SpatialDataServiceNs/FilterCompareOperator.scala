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
  
  val endsWith: endsWith with java.lang.String = js.native
  @JSName("equals")
  val equals_FFilterCompareOperator: equals with java.lang.String = js.native
  val greaterThan: greaterThan with java.lang.String = js.native
  val greaterThanOrEqual: greaterThanOrEqual with java.lang.String = js.native
  val isIn: isIn with java.lang.String = js.native
  val lessThan: lessThan with java.lang.String = js.native
  val lessThanOrEqual: lessThanOrEqual with java.lang.String = js.native
  val notEndsWith: notEndsWith with java.lang.String = js.native
  val notEquals: notEquals with java.lang.String = js.native
  val notStartsWith: notStartsWith with java.lang.String = js.native
  val startsWith: startsWith with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.FilterCompareOperator with java.lang.String
  ] = js.native
}

