package typings.cloudConfigClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigData extends js.Object {
  var label: String = js.native
  var name: String = js.native
  var profiles: js.Array[String] = js.native
  var propertySources: js.Array[ConfigFile] = js.native
  var version: String = js.native
}

object ConfigData {
  @scala.inline
  def apply(
    label: String,
    name: String,
    profiles: js.Array[String],
    propertySources: js.Array[ConfigFile],
    version: String
  ): ConfigData = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profiles = profiles.asInstanceOf[js.Any], propertySources = propertySources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigData]
  }
  @scala.inline
  implicit class ConfigDataOps[Self <: ConfigData] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfilesVarargs(value: String*): Self = this.set("profiles", js.Array(value :_*))
    @scala.inline
    def setProfiles(value: js.Array[String]): Self = this.set("profiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertySourcesVarargs(value: ConfigFile*): Self = this.set("propertySources", js.Array(value :_*))
    @scala.inline
    def setPropertySources(value: js.Array[ConfigFile]): Self = this.set("propertySources", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

