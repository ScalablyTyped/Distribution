package typings.contentfulManagement.environmentMod

import typings.contentfulManagement.anon.MetaSysPropsspacesysMetaLArchivedVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentProps extends js.Object {
  
  /**
    * Name of the environmant
    */
  var name: String = js.native
  
  /**
    * System metadata
    */
  var sys: MetaSysPropsspacesysMetaLArchivedVersion = js.native
}
object EnvironmentProps {
  
  @scala.inline
  def apply(name: String, sys: MetaSysPropsspacesysMetaLArchivedVersion): EnvironmentProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentProps]
  }
  
  @scala.inline
  implicit class EnvironmentPropsOps[Self <: EnvironmentProps] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSys(value: MetaSysPropsspacesysMetaLArchivedVersion): Self = this.set("sys", value.asInstanceOf[js.Any])
  }
}
