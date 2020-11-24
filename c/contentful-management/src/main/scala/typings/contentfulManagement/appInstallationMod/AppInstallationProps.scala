package typings.contentfulManagement.appInstallationMod

import org.scalablytyped.runtime.StringDictionary
import typings.contentfulManagement.anon.MetaSysPropsappDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppInstallationProps extends js.Object {
  
  /** App Installation specific configuration variables */
  var parameters: StringDictionary[String] = js.native
  
  var sys: MetaSysPropsappDefinition = js.native
}
object AppInstallationProps {
  
  @scala.inline
  def apply(parameters: StringDictionary[String], sys: MetaSysPropsappDefinition): AppInstallationProps = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInstallationProps]
  }
  
  @scala.inline
  implicit class AppInstallationPropsOps[Self <: AppInstallationProps] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: StringDictionary[String]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSys(value: MetaSysPropsappDefinition): Self = this.set("sys", value.asInstanceOf[js.Any])
  }
}
