package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCodeRepositoryInput extends StObject {
  
  /**
    * The name of the Git repository to describe.
    */
  var CodeRepositoryName: EntityName = js.native
}
object DescribeCodeRepositoryInput {
  
  @scala.inline
  def apply(CodeRepositoryName: EntityName): DescribeCodeRepositoryInput = {
    val __obj = js.Dynamic.literal(CodeRepositoryName = CodeRepositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCodeRepositoryInput]
  }
  
  @scala.inline
  implicit class DescribeCodeRepositoryInputMutableBuilder[Self <: DescribeCodeRepositoryInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeRepositoryName(value: EntityName): Self = StObject.set(x, "CodeRepositoryName", value.asInstanceOf[js.Any])
  }
}
