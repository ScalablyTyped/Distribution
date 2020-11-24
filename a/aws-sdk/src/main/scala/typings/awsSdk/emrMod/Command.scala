package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Command extends js.Object {
  
  /**
    * Arguments for Amazon EMR to pass to the command for execution.
    */
  var Args: js.UndefOr[StringList] = js.native
  
  /**
    * The name of the command.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The Amazon S3 location of the command script.
    */
  var ScriptPath: js.UndefOr[String] = js.native
}
object Command {
  
  @scala.inline
  def apply(): Command = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit class CommandOps[Self <: Command] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: String*): Self = this.set("Args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: StringList): Self = this.set("Args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("Args", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setScriptPath(value: String): Self = this.set("ScriptPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptPath: Self = this.set("ScriptPath", js.undefined)
  }
}
