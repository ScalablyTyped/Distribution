package typings
package cassanknexLib.cassanknexMod.CassanKnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryBuilder extends js.Object {
  def bindings(): js.Array[_]
  def cql(): java.lang.String
  def eachRow(
    onEachRow: js.Function2[
      /* n */ scala.Double, 
      /* row */ cassandraDashDriverLib.cassandraDashDriverMod.typesNs.Row, 
      _
    ],
    onError: js.Function1[/* err */ nodeLib.Error, _]
  ): js.UndefOr[scala.Nothing]
  def exec(cb: cassandraDashDriverLib.cassandraDashDriverMod.ResultCallback): js.UndefOr[scala.Nothing]
  def stream(params: StreamParams): js.UndefOr[scala.Nothing]
}

object QueryBuilder {
  @scala.inline
  def apply(
    bindings: js.Function0[js.Array[_]],
    cql: js.Function0[java.lang.String],
    eachRow: js.Function2[
      js.Function2[
        /* n */ scala.Double, 
        /* row */ cassandraDashDriverLib.cassandraDashDriverMod.typesNs.Row, 
        _
      ], 
      js.Function1[/* err */ nodeLib.Error, _], 
      js.UndefOr[scala.Nothing]
    ],
    exec: js.Function1[
      cassandraDashDriverLib.cassandraDashDriverMod.ResultCallback, 
      js.UndefOr[scala.Nothing]
    ],
    stream: js.Function1[StreamParams, js.UndefOr[scala.Nothing]]
  ): QueryBuilder = {
    val __obj = js.Dynamic.literal(bindings = bindings, cql = cql, eachRow = eachRow, exec = exec, stream = stream)
  
    __obj.asInstanceOf[QueryBuilder]
  }
}

