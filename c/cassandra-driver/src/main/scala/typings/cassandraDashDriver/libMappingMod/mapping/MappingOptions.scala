package typings.cassandraDashDriver.libMappingMod.mapping

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingOptions extends js.Object {
  var models: StringDictionary[ModelOptions]
}

object MappingOptions {
  @scala.inline
  def apply(models: StringDictionary[ModelOptions]): MappingOptions = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MappingOptions]
  }
}

