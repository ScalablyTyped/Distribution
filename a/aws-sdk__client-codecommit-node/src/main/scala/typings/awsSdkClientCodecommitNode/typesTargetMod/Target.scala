package typings.awsSdkClientCodecommitNode.typesTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Target extends js.Object {
  
  /**
    * <p>The branch of the repository where the pull request changes will be merged into. Also known as the destination branch.</p>
    */
  var destinationReference: js.UndefOr[String] = js.native
  
  /**
    * <p>The name of the repository that contains the pull request.</p>
    */
  var repositoryName: String = js.native
  
  /**
    * <p>The branch of the repository that contains the changes for the pull request. Also known as the source branch.</p>
    */
  var sourceReference: String = js.native
}
object Target {
  
  @scala.inline
  def apply(repositoryName: String, sourceReference: String): Target = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], sourceReference = sourceReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit class TargetOps[Self <: Target] (val x: Self) extends AnyVal {
    
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
    def setRepositoryName(value: String): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceReference(value: String): Self = this.set("sourceReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationReference(value: String): Self = this.set("destinationReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationReference: Self = this.set("destinationReference", js.undefined)
  }
}
