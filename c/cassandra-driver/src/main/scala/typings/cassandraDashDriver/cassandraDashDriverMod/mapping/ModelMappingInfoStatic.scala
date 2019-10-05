package typings.cassandraDashDriver.cassandraDashDriverMod.mapping

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelMappingInfoStatic
  extends Instantiable4[
      /* keyspace */ String, 
      /* tables */ js.Array[ModelTables], 
      /* mappings */ TableMappings, 
      /* columns */ StringDictionary[String], 
      ModelMappingInfo
    ] {
  def createDefault(modelName: String, currentKeyspace: String): ModelMappingInfo = js.native
  def parse(options: MappingOptions, currentKeyspace: String): StringDictionary[ModelMappingInfo] = js.native
}

