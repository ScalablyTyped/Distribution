package typings.cassandraDashDriver.cassandraDashDriverMod.mapping

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDashDriver.cassandraDashDriverMod.types.ResultSet
import typings.cassandraDashDriver.cassandraDashDriverMod.types.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultStatic
  extends Instantiable3[
      /* rs */ ResultSet, 
      /* info */ ModelMappingInfo, 
      /* rowAdapter */ js.Function2[/* row */ Row, /* info */ ModelMappingInfo, StringDictionary[js.Any]], 
      Result
    ]

