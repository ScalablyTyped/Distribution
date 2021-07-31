package typings.cassanknex.mod

import typings.cassandraDriver.mod.ValueCallback
import typings.cassandraDriver.mod.types.BigDecimal
import typings.cassandraDriver.mod.types.InetAddress
import typings.cassandraDriver.mod.types.LocalDate
import typings.cassandraDriver.mod.types.TimeUuid
import typings.cassandraDriver.mod.types.Uuid
import typings.cassandraDriver.typesMod.types.ResultSet
import typings.cassandraDriver.typesMod.types.Row
import typings.long.mod.Long
import typings.node.Buffer
import typings.std.Date
import typings.std.Error
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlterColumnFamilyQueryBuilder[T]
  extends StObject
     with QueryBuilder
     with AlterableQueryBuilder[T]
     with FieldValueQueryBuilder[T]
object AlterColumnFamilyQueryBuilder {
  
  @scala.inline
  def apply[T](
    alter: (js.Any, String) => AlterColumnFamilyQueryBuilder[T],
    ascii: js.Any => TypeMatchedValue[T, js.Any, String, AlterColumnFamilyQueryBuilder[T]],
    bigint: js.Any => TypeMatchedValue[T, js.Any, Long, AlterColumnFamilyQueryBuilder[T]],
    bindings: () => js.Array[js.Any],
    blob: js.Any => TypeMatchedValue[T, js.Any, Buffer, AlterColumnFamilyQueryBuilder[T]],
    boolean: js.Any => TypeMatchedValue[T, js.Any, Boolean, AlterColumnFamilyQueryBuilder[T]],
    counter: js.Any => TypeMatchedValue[T, js.Any, Long, AlterColumnFamilyQueryBuilder[T]],
    cql: () => String,
    date: js.Any => TypeMatchedValue[T, js.Any, LocalDate, AlterColumnFamilyQueryBuilder[T]],
    decimal: js.Any => TypeMatchedValue[T, js.Any, BigDecimal, AlterColumnFamilyQueryBuilder[T]],
    double: js.Any => TypeMatchedValue[T, js.Any, Long, AlterColumnFamilyQueryBuilder[T]],
    drop: /* repeated */ js.Any => AlterColumnFamilyQueryBuilder[T],
    eachRow: (js.Function2[/* n */ Double, /* row */ Row, js.Any], js.Function1[/* err */ Error, js.Any]) => Unit,
    exec: ValueCallback[ResultSet] => Unit,
    float: js.Any => TypeMatchedValue[T, js.Any, Double, AlterColumnFamilyQueryBuilder[T]],
    inet: js.Any => TypeMatchedValue[T, js.Any, InetAddress, AlterColumnFamilyQueryBuilder[T]],
    int: js.Any => TypeMatchedValue[T, js.Any, Double, AlterColumnFamilyQueryBuilder[T]],
    list: (js.Any, String) => TypeMatchedValue[T, js.Any, js.Array[js.Any], AlterColumnFamilyQueryBuilder[T]],
    map: (js.Any, js.Any, js.Any) => TypeMatchedValue[T, js.Any, Map[js.Any, js.Any], AlterColumnFamilyQueryBuilder[T]],
    primary: String => AlterColumnFamilyQueryBuilder[T],
    rename: (js.Any, js.Any) => AlterColumnFamilyQueryBuilder[T],
    set: (js.Any, js.Any) => TypeMatchedValue[
      T, 
      js.Any, 
      Set[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      AlterColumnFamilyQueryBuilder[T]
    ],
    stream: StreamParams => Unit,
    text: js.Any => TypeMatchedValue[T, js.Any, String, AlterColumnFamilyQueryBuilder[T]],
    timestamp: js.Any => TypeMatchedValue[T, js.Any, Date, AlterColumnFamilyQueryBuilder[T]],
    timeuuid: js.Any => TypeMatchedValue[T, js.Any, TimeUuid, AlterColumnFamilyQueryBuilder[T]],
    uuid: js.Any => TypeMatchedValue[T, js.Any, Uuid, AlterColumnFamilyQueryBuilder[T]],
    varchar: js.Any => TypeMatchedValue[T, js.Any, String, AlterColumnFamilyQueryBuilder[T]]
  ): AlterColumnFamilyQueryBuilder[T] = {
    val __obj = js.Dynamic.literal(alter = js.Any.fromFunction2(alter), ascii = js.Any.fromFunction1(ascii), bigint = js.Any.fromFunction1(bigint), bindings = js.Any.fromFunction0(bindings), blob = js.Any.fromFunction1(blob), boolean = js.Any.fromFunction1(boolean), counter = js.Any.fromFunction1(counter), cql = js.Any.fromFunction0(cql), date = js.Any.fromFunction1(date), decimal = js.Any.fromFunction1(decimal), double = js.Any.fromFunction1(double), drop = js.Any.fromFunction1(drop), eachRow = js.Any.fromFunction2(eachRow), exec = js.Any.fromFunction1(exec), float = js.Any.fromFunction1(float), inet = js.Any.fromFunction1(inet), int = js.Any.fromFunction1(int), list = js.Any.fromFunction2(list), map = js.Any.fromFunction3(map), primary = js.Any.fromFunction1(primary), rename = js.Any.fromFunction2(rename), set = js.Any.fromFunction2(set), stream = js.Any.fromFunction1(stream), text = js.Any.fromFunction1(text), timestamp = js.Any.fromFunction1(timestamp), timeuuid = js.Any.fromFunction1(timeuuid), uuid = js.Any.fromFunction1(uuid), varchar = js.Any.fromFunction1(varchar))
    __obj.asInstanceOf[AlterColumnFamilyQueryBuilder[T]]
  }
}
