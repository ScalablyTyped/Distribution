package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCodeRepositoryOutput extends StObject {
  
  /**
    * The ARN of the Git repository.
    */
  var CodeRepositoryArn: typings.awsSdk.sagemakerMod.CodeRepositoryArn = js.native
}
object UpdateCodeRepositoryOutput {
  
  @scala.inline
  def apply(CodeRepositoryArn: CodeRepositoryArn): UpdateCodeRepositoryOutput = {
    val __obj = js.Dynamic.literal(CodeRepositoryArn = CodeRepositoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCodeRepositoryOutput]
  }
  
  @scala.inline
  implicit class UpdateCodeRepositoryOutputMutableBuilder[Self <: UpdateCodeRepositoryOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeRepositoryArn(value: CodeRepositoryArn): Self = StObject.set(x, "CodeRepositoryArn", value.asInstanceOf[js.Any])
  }
}
