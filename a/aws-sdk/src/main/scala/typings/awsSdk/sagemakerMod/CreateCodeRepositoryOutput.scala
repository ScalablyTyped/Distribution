package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCodeRepositoryOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the new repository.
    */
  var CodeRepositoryArn: typings.awsSdk.sagemakerMod.CodeRepositoryArn
}
object CreateCodeRepositoryOutput {
  
  inline def apply(CodeRepositoryArn: CodeRepositoryArn): CreateCodeRepositoryOutput = {
    val __obj = js.Dynamic.literal(CodeRepositoryArn = CodeRepositoryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCodeRepositoryOutput]
  }
  
  extension [Self <: CreateCodeRepositoryOutput](x: Self) {
    
    inline def setCodeRepositoryArn(value: CodeRepositoryArn): Self = StObject.set(x, "CodeRepositoryArn", value.asInstanceOf[js.Any])
  }
}
