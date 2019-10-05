package typings.cassandraDashDriver.cassandraDashDriverMod.mapping

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDashDriver.cassandraDashDriverMod.types.ResultSet
import typings.cassandraDashDriver.cassandraDashDriverMod.types.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "mapping.Result")
@js.native
class ResultCls protected () extends Result {
  def this(
    rs: ResultSet,
    info: ModelMappingInfo,
    rowAdapter: js.Function2[/* row */ Row, /* info */ ModelMappingInfo, StringDictionary[_]]
  ) = this()
}

