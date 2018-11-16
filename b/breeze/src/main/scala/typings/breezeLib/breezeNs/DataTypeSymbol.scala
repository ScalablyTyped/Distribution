package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.DataTypeSymbol")
@js.native
class DataTypeSymbol ()
  extends breezeLib.breezeNs.coreNs.EnumSymbol {
  var defaultValue: js.Any = js.native
  /** Optional function to get the next value when the datatype is used as a concurrency property. */
  var getConcurrencyValue: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.native
  /** Optional function to get the next value for key generation, if this datatype is used as a key.  Uses an internal table of previous values. */
  var getNext: js.UndefOr[js.Function0[_]] = js.native
  var isDate: js.UndefOr[scala.Boolean] = js.native
  var isFloat: js.UndefOr[scala.Boolean] = js.native
  var isInteger: js.UndefOr[scala.Boolean] = js.native
  var isNumeric: js.UndefOr[scala.Boolean] = js.native
  /** Optional function to normalize a data value for comparison, if its value cannot be used directly.  Note that this will be called each time a property is changed, so make it fast. */
  var normalize: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.native
  /** Function to convert a value from string to this DataType.  Note that this will be called each time a property is changed, so make it fast. */
  var parse: js.UndefOr[
    js.Function2[/* val */ js.Any, /* sourceTypeName */ js.UndefOr[java.lang.String], _]
  ] = js.native
  /** Optional function to convert a raw (server) value from string to this DataType. */
  var parseRawValue: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.native
  var quoteJsonOData: js.UndefOr[scala.Boolean] = js.native
  /** Function to format this DataType for OData queries. */
  def fmtOData(`val`: js.Any): js.Any = js.native
  def validatorCtor(context: js.Any): Validator = js.native
}

