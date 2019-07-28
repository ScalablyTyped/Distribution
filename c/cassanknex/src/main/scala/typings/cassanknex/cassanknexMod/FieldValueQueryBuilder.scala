package typings.cassanknex.cassanknexMod

import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.BigDecimal
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.InetAddress
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.LocalDate
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.TimeUuid
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.Uuid
import typings.node.Buffer
import typings.std.Date
import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldValueQueryBuilder[T] extends js.Object {
  def ascii[K /* <: String */](columnName: K): TypeMatchedValue[T, K, String, this.type]
  def bigint[K /* <: String */](columnName: K): TypeMatchedValue[T, K, typings.long.longMod.^, this.type]
  def blob[K /* <: String */](columnName: K): TypeMatchedValue[T, K, Buffer, this.type]
  def boolean[K /* <: String */](columnName: K): TypeMatchedValue[T, K, Boolean, this.type]
  def counter[K /* <: String */](columnName: K): TypeMatchedValue[T, K, typings.long.longMod.^, this.type]
  def date[K /* <: String */](columnName: K): TypeMatchedValue[T, K, LocalDate, this.type]
  def decimal[K /* <: String */](columnName: K): TypeMatchedValue[T, K, BigDecimal, this.type]
  def double[K /* <: String */](columnName: K): TypeMatchedValue[T, K, typings.long.longMod.^, this.type]
  def float[K /* <: String */](columnName: K): TypeMatchedValue[T, K, Double, this.type]
  def inet[K /* <: String */](columnName: K): TypeMatchedValue[T, K, InetAddress, this.type]
  def int[K /* <: String */](columnName: K): TypeMatchedValue[T, K, Double, this.type]
  def list[K /* <: String */](columnName: K, typeName: String): TypeMatchedValue[T, K, js.Array[_], this.type]
  def map[K /* <: String */, A /* <: String */, B](columnName: K, a: A, b: B): TypeMatchedValue[T, K, Map[A, B], this.type]
  def primary(primaryKey: String): this.type
  def set[K /* <: String */, A /* <: String */](columnName: K, a: A): TypeMatchedValue[
    T, 
    K, 
    Set[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any], 
    this.type
  ]
  def text[K /* <: String */](columnName: K): TypeMatchedValue[T, K, String, this.type]
  def timestamp[K /* <: String */](columnName: K): TypeMatchedValue[T, K, Date, this.type]
  def timeuuid[K /* <: String */](columnName: K): TypeMatchedValue[T, K, TimeUuid, this.type]
  def uuid[K /* <: String */](columnName: K): TypeMatchedValue[T, K, Uuid, this.type]
  def varchar[K /* <: String */](columnName: K): TypeMatchedValue[T, K, String, this.type]
}

object FieldValueQueryBuilder {
  @scala.inline
  def apply[T](
    ascii: js.Any => TypeMatchedValue[T, js.Any, String, FieldValueQueryBuilder[T]],
    bigint: js.Any => TypeMatchedValue[T, js.Any, typings.long.longMod.^, FieldValueQueryBuilder[T]],
    blob: js.Any => TypeMatchedValue[T, js.Any, Buffer, FieldValueQueryBuilder[T]],
    boolean: js.Any => TypeMatchedValue[T, js.Any, Boolean, FieldValueQueryBuilder[T]],
    counter: js.Any => TypeMatchedValue[T, js.Any, typings.long.longMod.^, FieldValueQueryBuilder[T]],
    date: js.Any => TypeMatchedValue[T, js.Any, LocalDate, FieldValueQueryBuilder[T]],
    decimal: js.Any => TypeMatchedValue[T, js.Any, BigDecimal, FieldValueQueryBuilder[T]],
    double: js.Any => TypeMatchedValue[T, js.Any, typings.long.longMod.^, FieldValueQueryBuilder[T]],
    float: js.Any => TypeMatchedValue[T, js.Any, Double, FieldValueQueryBuilder[T]],
    inet: js.Any => TypeMatchedValue[T, js.Any, InetAddress, FieldValueQueryBuilder[T]],
    int: js.Any => TypeMatchedValue[T, js.Any, Double, FieldValueQueryBuilder[T]],
    list: (js.Any, String) => TypeMatchedValue[T, js.Any, js.Array[_], FieldValueQueryBuilder[T]],
    map: (js.Any, js.Any, js.Any) => TypeMatchedValue[T, js.Any, Map[js.Any, js.Any], FieldValueQueryBuilder[T]],
    primary: String => FieldValueQueryBuilder[T],
    set: (js.Any, js.Any) => TypeMatchedValue[
      T, 
      js.Any, 
      Set[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any], 
      FieldValueQueryBuilder[T]
    ],
    text: js.Any => TypeMatchedValue[T, js.Any, String, FieldValueQueryBuilder[T]],
    timestamp: js.Any => TypeMatchedValue[T, js.Any, Date, FieldValueQueryBuilder[T]],
    timeuuid: js.Any => TypeMatchedValue[T, js.Any, TimeUuid, FieldValueQueryBuilder[T]],
    uuid: js.Any => TypeMatchedValue[T, js.Any, Uuid, FieldValueQueryBuilder[T]],
    varchar: js.Any => TypeMatchedValue[T, js.Any, String, FieldValueQueryBuilder[T]]
  ): FieldValueQueryBuilder[T] = {
    val __obj = js.Dynamic.literal(ascii = js.Any.fromFunction1(ascii), bigint = js.Any.fromFunction1(bigint), blob = js.Any.fromFunction1(blob), boolean = js.Any.fromFunction1(boolean), counter = js.Any.fromFunction1(counter), date = js.Any.fromFunction1(date), decimal = js.Any.fromFunction1(decimal), double = js.Any.fromFunction1(double), float = js.Any.fromFunction1(float), inet = js.Any.fromFunction1(inet), int = js.Any.fromFunction1(int), list = js.Any.fromFunction2(list), map = js.Any.fromFunction3(map), primary = js.Any.fromFunction1(primary), set = js.Any.fromFunction2(set), text = js.Any.fromFunction1(text), timestamp = js.Any.fromFunction1(timestamp), timeuuid = js.Any.fromFunction1(timeuuid), uuid = js.Any.fromFunction1(uuid), varchar = js.Any.fromFunction1(varchar))
  
    __obj.asInstanceOf[FieldValueQueryBuilder[T]]
  }
}

