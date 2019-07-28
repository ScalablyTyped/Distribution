package typings.breeze.breezeNs

import typings.breeze.Anon_NextNumber
import typings.breeze.breezeNs.coreNs.IEnum
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataType extends IEnum {
  var Binary: DataTypeSymbol = js.native
  var Boolean: DataTypeSymbol = js.native
  var Byte: DataTypeSymbol = js.native
  var DateTime: DataTypeSymbol = js.native
  var DateTimeOffset: DataTypeSymbol = js.native
  var Decimal: DataTypeSymbol = js.native
  var Double: DataTypeSymbol = js.native
  var Guid: DataTypeSymbol = js.native
  var Int16: DataTypeSymbol = js.native
  var Int32: DataTypeSymbol = js.native
  var Int64: DataTypeSymbol = js.native
  var Single: DataTypeSymbol = js.native
  var String: DataTypeSymbol = js.native
  var Time: DataTypeSymbol = js.native
  var Undefined: DataTypeSymbol = js.native
  var constants: Anon_NextNumber = js.native
  def fromEdmDataType(typeName: String): DataTypeSymbol = js.native
  def fromValue(`val`: js.Any): DataTypeSymbol = js.native
  def getComparableFn(dataType: DataTypeSymbol): js.Function1[/* value */ js.Any, _] = js.native
  def parseDateAsUTC(source: js.Any): Date = js.native
  def parseDateFromServer(date: js.Any): Date = js.native
  def parseRawValue(`val`: js.Any): js.Any = js.native
  def parseRawValue(`val`: js.Any, dataType: DataTypeSymbol): js.Any = js.native
  def parseTimeFromServer(source: js.Any): String = js.native
}

