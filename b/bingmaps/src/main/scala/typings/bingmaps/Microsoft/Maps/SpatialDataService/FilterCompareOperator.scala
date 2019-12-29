package typings.bingmaps.Microsoft.Maps.SpatialDataService

import org.scalablytyped.runtime.TopLevel
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
  
  /* 1 */ @JSName("equals")
  val equals_ : equals with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FilterCompareOperator with Double] = js.native
  /* 0 */ @js.native
  object endsWith extends TopLevel[endsWith with Double]
  
  /* 2 */ @js.native
  object greaterThan extends TopLevel[greaterThan with Double]
  
  /* 3 */ @js.native
  object greaterThanOrEqual extends TopLevel[greaterThanOrEqual with Double]
  
  /* 4 */ @js.native
  object isIn extends TopLevel[isIn with Double]
  
  /* 5 */ @js.native
  object lessThan extends TopLevel[lessThan with Double]
  
  /* 6 */ @js.native
  object lessThanOrEqual extends TopLevel[lessThanOrEqual with Double]
  
  /* 7 */ @js.native
  object notEndsWith extends TopLevel[notEndsWith with Double]
  
  /* 8 */ @js.native
  object notEquals extends TopLevel[notEquals with Double]
  
  /* 9 */ @js.native
  object notStartsWith extends TopLevel[notStartsWith with Double]
  
  /* 10 */ @js.native
  object startsWith extends TopLevel[startsWith with Double]
  
}

