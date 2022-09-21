package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypeSymbol
  extends StObject
     with EnumSymbol {
  
  var defaultValue: Any = js.native
  
  /** Function to format this DataType for OData queries. */
  def fmtOData(`val`: Any): Any = js.native
  
  /** Optional function to get the next value when the datatype is used as a concurrency property. */
  var getConcurrencyValue: js.UndefOr[js.Function1[/* val */ Any, Any]] = js.native
  
  /** Optional function to get the next value for key generation, if this datatype is used as a key.  Uses an internal table of previous values. */
  var getNext: js.UndefOr[js.Function0[Any]] = js.native
  
  var isDate: js.UndefOr[Boolean] = js.native
  
  var isFloat: js.UndefOr[Boolean] = js.native
  
  var isInteger: js.UndefOr[Boolean] = js.native
  
  var isNumeric: js.UndefOr[Boolean] = js.native
  
  /** Optional function to normalize a data value for comparison, if its value cannot be used directly.  Note that this will be called each time a property is changed, so make it fast. */
  var normalize: js.UndefOr[js.Function1[/* val */ Any, Any]] = js.native
  
  /** Function to convert a value from string to this DataType.  Note that this will be called each time a property is changed, so make it fast. */
  var parse: js.UndefOr[js.Function2[/* val */ Any, /* sourceTypeName */ js.UndefOr[String], Any]] = js.native
  
  /** Optional function to convert a raw (server) value from string to this DataType. */
  var parseRawValue: js.UndefOr[js.Function1[/* val */ Any, Any]] = js.native
  
  var quoteJsonOData: js.UndefOr[Boolean] = js.native
  
  def validatorCtor(): Validator = js.native
  def validatorCtor(context: Any): Validator = js.native
}
