package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteReportInput extends StObject {
  
  /**
    *  The ARN of the report to delete. 
    */
  var arn: NonEmptyString = js.native
}
object DeleteReportInput {
  
  @scala.inline
  def apply(arn: NonEmptyString): DeleteReportInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReportInput]
  }
  
  @scala.inline
  implicit class DeleteReportInputMutableBuilder[Self <: DeleteReportInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
