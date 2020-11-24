package typings.awsSdkRegionProvider.fromEnvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvConfiguration extends js.Object {
  
  var environmentVariableName: js.UndefOr[String] = js.native
}
object EnvConfiguration {
  
  @scala.inline
  def apply(): EnvConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvConfiguration]
  }
  
  @scala.inline
  implicit class EnvConfigurationOps[Self <: EnvConfiguration] (val x: Self) extends AnyVal {
    
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
    def setEnvironmentVariableName(value: String): Self = this.set("environmentVariableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentVariableName: Self = this.set("environmentVariableName", js.undefined)
  }
}
