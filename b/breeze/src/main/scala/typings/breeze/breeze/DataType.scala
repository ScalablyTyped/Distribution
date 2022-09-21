package typings.breeze.breeze

import typings.breeze.anon.NextNumber
import typings.breeze.breeze.core.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataType
  extends StObject
     with IEnum {
  
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
  
  def addSymbol(): DataTypeSymbol = js.native
  def addSymbol(propertiesObj: Any): DataTypeSymbol = js.native
  
  var constants: NextNumber = js.native
  
  def fromEdmDataType(typeName: String): DataTypeSymbol = js.native
  
  def fromValue(`val`: Any): DataTypeSymbol = js.native
  
  def getComparableFn(dataType: DataTypeSymbol): js.Function1[/* value */ Any, Any] = js.native
  
  def parseDateAsUTC(source: Any): js.Date = js.native
  
  def parseDateFromServer(date: Any): js.Date = js.native
  
  def parseRawValue(`val`: Any): Any = js.native
  def parseRawValue(`val`: Any, dataType: DataTypeSymbol): Any = js.native
  
  def parseTimeFromServer(source: Any): String = js.native
}
