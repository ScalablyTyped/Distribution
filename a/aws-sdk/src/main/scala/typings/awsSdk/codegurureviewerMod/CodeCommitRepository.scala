package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeCommitRepository extends StObject {
  
  /**
    * The name of the AWS CodeCommit repository. For more information, see repositoryName in the AWS CodeCommit API Reference.
    */
  var Name: typings.awsSdk.codegurureviewerMod.Name = js.native
}
object CodeCommitRepository {
  
  @scala.inline
  def apply(Name: Name): CodeCommitRepository = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeCommitRepository]
  }
  
  @scala.inline
  implicit class CodeCommitRepositoryMutableBuilder[Self <: CodeCommitRepository] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
