package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsService extends StObject {
  
  /**
    * The name of the AWS service that performed the action.
    */
  var invokedBy: js.UndefOr[string] = js.native
}
object AwsService {
  
  @scala.inline
  def apply(): AwsService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsService]
  }
  
  @scala.inline
  implicit class AwsServiceMutableBuilder[Self <: AwsService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvokedBy(value: string): Self = StObject.set(x, "invokedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvokedByUndefined: Self = StObject.set(x, "invokedBy", js.undefined)
  }
}
