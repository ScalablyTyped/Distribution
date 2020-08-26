package typings.cassandraDriver.mappingMod.mapping

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MappingOptions extends js.Object {
  var models: StringDictionary[ModelOptions] = js.native
}

object MappingOptions {
  @scala.inline
  def apply(models: StringDictionary[ModelOptions]): MappingOptions = {
    val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingOptions]
  }
  @scala.inline
  implicit class MappingOptionsOps[Self <: MappingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setModels(value: StringDictionary[ModelOptions]): Self = this.set("models", value.asInstanceOf[js.Any])
  }
  
}

