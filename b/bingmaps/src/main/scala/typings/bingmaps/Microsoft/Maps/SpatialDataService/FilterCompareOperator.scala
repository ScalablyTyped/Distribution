package typings.bingmaps.Microsoft.Maps.SpatialDataService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterCompareOperator extends StObject
@JSGlobal("Microsoft.Maps.SpatialDataService.FilterCompareOperator")
@js.native
object FilterCompareOperator extends StObject {
  
  /** Determines if a string value ends with a specified string value. */
  @js.native
  sealed trait endsWith
    extends StObject
       with FilterCompareOperator
  
  /** Determines if two values are equal. */
  @js.native
  sealed trait equals
    extends StObject
       with FilterCompareOperator
  
  /** Determines if a first value is greater than a second value. */
  @js.native
  sealed trait greaterThan
    extends StObject
       with FilterCompareOperator
  
  /** Determines if a first value is greater than or equal to a second value. */
  @js.native
  sealed trait greaterThanOrEqual
    extends StObject
       with FilterCompareOperator
  
  /** Determines if a value is within an array. */
  @js.native
  sealed trait isIn
    extends StObject
       with FilterCompareOperator
  
  /** Determines if a first value is less than a second value. */
  @js.native
  sealed trait lessThan
    extends StObject
       with FilterCompareOperator
  
  /**  Determines if a first value is less than or equal a second value. */
  @js.native
  sealed trait lessThanOrEqual
    extends StObject
       with FilterCompareOperator
  
  /** Determines if a string value does not end with a specified string value. */
  @js.native
  sealed trait notEndsWith
    extends StObject
       with FilterCompareOperator
  
  /** Determines if two values are not equal. */
  @js.native
  sealed trait notEquals
    extends StObject
       with FilterCompareOperator
  
  /** Determines if a string value does not start with a specified string value. */
  @js.native
  sealed trait notStartsWith
    extends StObject
       with FilterCompareOperator
  
  /** Determines if a string value starts with a specified string value. */
  @js.native
  sealed trait startsWith
    extends StObject
       with FilterCompareOperator
}
