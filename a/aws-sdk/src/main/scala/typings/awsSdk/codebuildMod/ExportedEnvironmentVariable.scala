package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportedEnvironmentVariable extends js.Object {
  
  /**
    *  The name of this exported environment variable. 
    */
  var name: js.UndefOr[NonEmptyString] = js.native
  
  /**
    *  The value assigned to this exported environment variable.    During a build, the value of a variable is available starting with the install phase. It can be updated between the start of the install phase and the end of the post_build phase. After the post_build phase ends, the value of exported variables cannot change. 
    */
  var value: js.UndefOr[String] = js.native
}
object ExportedEnvironmentVariable {
  
  @scala.inline
  def apply(): ExportedEnvironmentVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportedEnvironmentVariable]
  }
  
  @scala.inline
  implicit class ExportedEnvironmentVariableOps[Self <: ExportedEnvironmentVariable] (val x: Self) extends AnyVal {
    
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
    def setName(value: NonEmptyString): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
