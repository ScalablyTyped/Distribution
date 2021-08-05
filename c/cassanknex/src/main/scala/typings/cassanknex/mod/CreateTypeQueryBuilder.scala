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

trait CreateTypeQueryBuilder[T]
  extends StObject
     with QueryBuilder
     with FieldValueQueryBuilder[T]
object CreateTypeQueryBuilder {
  
  inline def apply[T](
    ascii: js.Any => TypeMatchedValue[T, js.Any, String, CreateTypeQueryBuilder[T]],
    bigint: js.Any => TypeMatchedValue[T, js.Any, Long, CreateTypeQueryBuilder[T]],
    bindings: () => js.Array[js.Any],
    blob: js.Any => TypeMatchedValue[T, js.Any, Buffer, CreateTypeQueryBuilder[T]],
    boolean: js.Any => TypeMatchedValue[T, js.Any, Boolean, CreateTypeQueryBuilder[T]],
    counter: js.Any => TypeMatchedValue[T, js.Any, Long, CreateTypeQueryBuilder[T]],
    cql: () => String,
    date: js.Any => TypeMatchedValue[T, js.Any, LocalDate, CreateTypeQueryBuilder[T]],
    decimal: js.Any => TypeMatchedValue[T, js.Any, BigDecimal, CreateTypeQueryBuilder[T]],
    double: js.Any => TypeMatchedValue[T, js.Any, Long, CreateTypeQueryBuilder[T]],
    eachRow: (js.Function2[/* n */ Double, /* row */ Row, js.Any], js.Function1[/* err */ Error, js.Any]) => Unit,
    exec: ValueCallback[ResultSet] => Unit,
    float: js.Any => TypeMatchedValue[T, js.Any, Double, CreateTypeQueryBuilder[T]],
    inet: js.Any => TypeMatchedValue[T, js.Any, InetAddress, CreateTypeQueryBuilder[T]],
    int: js.Any => TypeMatchedValue[T, js.Any, Double, CreateTypeQueryBuilder[T]],
    list: (js.Any, String) => TypeMatchedValue[T, js.Any, js.Array[js.Any], CreateTypeQueryBuilder[T]],
    map: (js.Any, js.Any, js.Any) => TypeMatchedValue[T, js.Any, Map[js.Any, js.Any], CreateTypeQueryBuilder[T]],
    primary: String => CreateTypeQueryBuilder[T],
    set: (js.Any, js.Any) => TypeMatchedValue[
      T, 
      js.Any, 
      Set[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      CreateTypeQueryBuilder[T]
    ],
    stream: StreamParams => Unit,
    text: js.Any => TypeMatchedValue[T, js.Any, String, CreateTypeQueryBuilder[T]],
    timestamp: js.Any => TypeMatchedValue[T, js.Any, Date, CreateTypeQueryBuilder[T]],
    timeuuid: js.Any => TypeMatchedValue[T, js.Any, TimeUuid, CreateTypeQueryBuilder[T]],
    uuid: js.Any => TypeMatchedValue[T, js.Any, Uuid, CreateTypeQueryBuilder[T]],
    varchar: js.Any => TypeMatchedValue[T, js.Any, String, CreateTypeQueryBuilder[T]]
  ): CreateTypeQueryBuilder[T] = {
    val __obj = js.Dynamic.literal(ascii = js.Any.fromFunction1(ascii), bigint = js.Any.fromFunction1(bigint), bindings = js.Any.fromFunction0(bindings), blob = js.Any.fromFunction1(blob), boolean = js.Any.fromFunction1(boolean), counter = js.Any.fromFunction1(counter), cql = js.Any.fromFunction0(cql), date = js.Any.fromFunction1(date), decimal = js.Any.fromFunction1(decimal), double = js.Any.fromFunction1(double), eachRow = js.Any.fromFunction2(eachRow), exec = js.Any.fromFunction1(exec), float = js.Any.fromFunction1(float), inet = js.Any.fromFunction1(inet), int = js.Any.fromFunction1(int), list = js.Any.fromFunction2(list), map = js.Any.fromFunction3(map), primary = js.Any.fromFunction1(primary), set = js.Any.fromFunction2(set), stream = js.Any.fromFunction1(stream), text = js.Any.fromFunction1(text), timestamp = js.Any.fromFunction1(timestamp), timeuuid = js.Any.fromFunction1(timeuuid), uuid = js.Any.fromFunction1(uuid), varchar = js.Any.fromFunction1(varchar))
    __obj.asInstanceOf[CreateTypeQueryBuilder[T]]
  }
}
