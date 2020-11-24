package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SolutionStackDescription extends js.Object {
  
  /**
    * The permitted file types allowed for a solution stack.
    */
  var PermittedFileTypes: js.UndefOr[SolutionStackFileTypeList] = js.native
  
  /**
    * The name of the solution stack.
    */
  var SolutionStackName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.native
}
object SolutionStackDescription {
  
  @scala.inline
  def apply(): SolutionStackDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SolutionStackDescription]
  }
  
  @scala.inline
  implicit class SolutionStackDescriptionOps[Self <: SolutionStackDescription] (val x: Self) extends AnyVal {
    
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
    def setPermittedFileTypesVarargs(value: FileTypeExtension*): Self = this.set("PermittedFileTypes", js.Array(value :_*))
    
    @scala.inline
    def setPermittedFileTypes(value: SolutionStackFileTypeList): Self = this.set("PermittedFileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermittedFileTypes: Self = this.set("PermittedFileTypes", js.undefined)
    
    @scala.inline
    def setSolutionStackName(value: SolutionStackName): Self = this.set("SolutionStackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolutionStackName: Self = this.set("SolutionStackName", js.undefined)
  }
}
