package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCompilationJobResponse extends StObject {
  
  /**
    * If the action is successful, the service sends back an HTTP 200 response. Amazon SageMaker returns the following data in JSON format:    CompilationJobArn: The Amazon Resource Name (ARN) of the compiled job.  
    */
  var CompilationJobArn: typings.awsSdk.sagemakerMod.CompilationJobArn
}
object CreateCompilationJobResponse {
  
  @scala.inline
  def apply(CompilationJobArn: CompilationJobArn): CreateCompilationJobResponse = {
    val __obj = js.Dynamic.literal(CompilationJobArn = CompilationJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCompilationJobResponse]
  }
  
  @scala.inline
  implicit class CreateCompilationJobResponseMutableBuilder[Self <: CreateCompilationJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompilationJobArn(value: CompilationJobArn): Self = StObject.set(x, "CompilationJobArn", value.asInstanceOf[js.Any])
  }
}
