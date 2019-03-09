package typings
package cassanknexLib.cassanknexMod.CassanKnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldValueQueryBuilder[T] extends js.Object {
  def ascii[K /* <: java.lang.String */](columnName: K): TypeMatchedValue[T, K, java.lang.String, this.type]
  def bigint[K /* <: java.lang.String */](columnName: K): TypeMatchedValue[T, K, longLib.longMod.namespaced, this.type]
  def blob[K /* <: java.lang.String */](columnName: K): TypeMatchedValue[T, K, nodeLib.Buffer, this.type]
  def boolean[K /* <: java.lang.String */](columnName: K): TypeMatchedValue[T, K, scala.Boolean, this.type]
  def counter[K /* <: java.lang.String */](columnName: K): TypeMatchedValue[T, K, longLib.longMod.namespaced, this.type]
  def date[K /* <: java.lang.String */](columnName: K): TypeMatchedValue[T, K, cassandraDashDriverLib.cassandraDashDriverMod.typesNs.LocalDate, this.type]
  def decimal[K /* <: java.lang.String */](columnName: K): TypeMatchedValue[T, K, cassandraDashDriverLib.cassandraDashDriverMod.typesNs.BigDecimal, this.type]
  def double[K /* <: java.lang.String */](columnName: K): TypeMatchedValue[T, K, longLib.longMod.namespaced, this.type]
  def float[K /* <: java.lang.String */](columnName: K): TypeMatchedValue[T, K, scala.Double, this.type]
  def inet[K /* <: java.lang.String */](columnName: K): TypeMatchedValue[T, K, cassandraDashDriverLib.cassandraDashDriverMod.typesNs.InetAddress, this.type]
  def int[K /* <: java.lang.String */](columnName: K): TypeMatchedValue[T, K, scala.Double, this.type]
  def list[K /* <: java.lang.String */](columnName: K, typeName: java.lang.String): TypeMatchedValue[T, K, js.Array[_], this.type]
  def map[K /* <: java.lang.String */, A /* <: java.lang.String */, B](columnName: K, a: A, b: B): TypeMatchedValue[T, K, nodeLib.Map[A, B], this.type]
  def primary(primaryKey: java.lang.String): this.type
  def set[K /* <: java.lang.String */, A /* <: java.lang.String */](columnName: K, a: A): TypeMatchedValue[
    T, 
    K, 
    nodeLib.Set[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any], 
    this.type
  ]
  def text[K /* <: java.lang.String */](columnName: K): TypeMatchedValue[T, K, java.lang.String, this.type]
  def timestamp[K /* <: java.lang.String */](columnName: K): TypeMatchedValue[T, K, stdLib.Date, this.type]
  def timeuuid[K /* <: java.lang.String */](columnName: K): TypeMatchedValue[T, K, cassandraDashDriverLib.cassandraDashDriverMod.typesNs.TimeUuid, this.type]
  def uuid[K /* <: java.lang.String */](columnName: K): TypeMatchedValue[T, K, cassandraDashDriverLib.cassandraDashDriverMod.typesNs.Uuid, this.type]
  def varchar[K /* <: java.lang.String */](columnName: K): TypeMatchedValue[T, K, java.lang.String, this.type]
}

object FieldValueQueryBuilder {
  @scala.inline
  def apply[T](
    ascii: js.Function1[js.Any, TypeMatchedValue[T, js.Any, java.lang.String, FieldValueQueryBuilder[T]]],
    bigint: js.Function1[
      js.Any, 
      TypeMatchedValue[T, js.Any, longLib.longMod.namespaced, FieldValueQueryBuilder[T]]
    ],
    blob: js.Function1[js.Any, TypeMatchedValue[T, js.Any, nodeLib.Buffer, FieldValueQueryBuilder[T]]],
    boolean: js.Function1[js.Any, TypeMatchedValue[T, js.Any, scala.Boolean, FieldValueQueryBuilder[T]]],
    counter: js.Function1[
      js.Any, 
      TypeMatchedValue[T, js.Any, longLib.longMod.namespaced, FieldValueQueryBuilder[T]]
    ],
    date: js.Function1[
      js.Any, 
      TypeMatchedValue[
        T, 
        js.Any, 
        cassandraDashDriverLib.cassandraDashDriverMod.typesNs.LocalDate, 
        FieldValueQueryBuilder[T]
      ]
    ],
    decimal: js.Function1[
      js.Any, 
      TypeMatchedValue[
        T, 
        js.Any, 
        cassandraDashDriverLib.cassandraDashDriverMod.typesNs.BigDecimal, 
        FieldValueQueryBuilder[T]
      ]
    ],
    double: js.Function1[
      js.Any, 
      TypeMatchedValue[T, js.Any, longLib.longMod.namespaced, FieldValueQueryBuilder[T]]
    ],
    float: js.Function1[js.Any, TypeMatchedValue[T, js.Any, scala.Double, FieldValueQueryBuilder[T]]],
    inet: js.Function1[
      js.Any, 
      TypeMatchedValue[
        T, 
        js.Any, 
        cassandraDashDriverLib.cassandraDashDriverMod.typesNs.InetAddress, 
        FieldValueQueryBuilder[T]
      ]
    ],
    int: js.Function1[js.Any, TypeMatchedValue[T, js.Any, scala.Double, FieldValueQueryBuilder[T]]],
    list: js.Function2[
      js.Any, 
      java.lang.String, 
      TypeMatchedValue[T, js.Any, js.Array[_], FieldValueQueryBuilder[T]]
    ],
    map: js.Function3[
      js.Any, 
      js.Any, 
      js.Any, 
      TypeMatchedValue[T, js.Any, nodeLib.Map[js.Any, js.Any], FieldValueQueryBuilder[T]]
    ],
    primary: js.Function1[java.lang.String, FieldValueQueryBuilder[T]],
    set: js.Function2[
      js.Any, 
      js.Any, 
      TypeMatchedValue[
        T, 
        js.Any, 
        nodeLib.Set[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any], 
        FieldValueQueryBuilder[T]
      ]
    ],
    text: js.Function1[js.Any, TypeMatchedValue[T, js.Any, java.lang.String, FieldValueQueryBuilder[T]]],
    timestamp: js.Function1[js.Any, TypeMatchedValue[T, js.Any, stdLib.Date, FieldValueQueryBuilder[T]]],
    timeuuid: js.Function1[
      js.Any, 
      TypeMatchedValue[
        T, 
        js.Any, 
        cassandraDashDriverLib.cassandraDashDriverMod.typesNs.TimeUuid, 
        FieldValueQueryBuilder[T]
      ]
    ],
    uuid: js.Function1[
      js.Any, 
      TypeMatchedValue[
        T, 
        js.Any, 
        cassandraDashDriverLib.cassandraDashDriverMod.typesNs.Uuid, 
        FieldValueQueryBuilder[T]
      ]
    ],
    varchar: js.Function1[js.Any, TypeMatchedValue[T, js.Any, java.lang.String, FieldValueQueryBuilder[T]]]
  ): FieldValueQueryBuilder[T] = {
    val __obj = js.Dynamic.literal(ascii = ascii, bigint = bigint, blob = blob, boolean = boolean, counter = counter, date = date, decimal = decimal, double = double, float = float, inet = inet, int = int, list = list, map = map, primary = primary, set = set, text = text, timestamp = timestamp, timeuuid = timeuuid, uuid = uuid, varchar = varchar)
  
    __obj.asInstanceOf[FieldValueQueryBuilder[T]]
  }
}

