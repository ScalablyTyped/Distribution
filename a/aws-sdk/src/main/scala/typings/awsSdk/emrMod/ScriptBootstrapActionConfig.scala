package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptBootstrapActionConfig extends js.Object {
  
  /**
    * A list of command line arguments to pass to the bootstrap action script.
    */
  var Args: js.UndefOr[XmlStringList] = js.native
  
  /**
    * Location of the script to run during a bootstrap action. Can be either a location in Amazon S3 or on a local file system.
    */
  var Path: XmlString = js.native
}
object ScriptBootstrapActionConfig {
  
  @scala.inline
  def apply(Path: XmlString): ScriptBootstrapActionConfig = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptBootstrapActionConfig]
  }
  
  @scala.inline
  implicit class ScriptBootstrapActionConfigOps[Self <: ScriptBootstrapActionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPath(value: XmlString): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: XmlString*): Self = this.set("Args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: XmlStringList): Self = this.set("Args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("Args", js.undefined)
  }
}
