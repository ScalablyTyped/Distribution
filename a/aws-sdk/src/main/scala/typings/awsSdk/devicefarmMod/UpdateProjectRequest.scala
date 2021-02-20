package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProjectRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the project whose name to update.
    */
  var arn: AmazonResourceName = js.native
  
  /**
    * The number of minutes a test run in the project executes before it times out.
    */
  var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.native
  
  /**
    * A string that represents the new name of the project that you are updating.
    */
  var name: js.UndefOr[Name] = js.native
}
object UpdateProjectRequest {
  
  @scala.inline
  def apply(arn: AmazonResourceName): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectRequest]
  }
  
  @scala.inline
  implicit class UpdateProjectRequestMutableBuilder[Self <: UpdateProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultJobTimeoutMinutes(value: JobTimeoutMinutes): Self = StObject.set(x, "defaultJobTimeoutMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultJobTimeoutMinutesUndefined: Self = StObject.set(x, "defaultJobTimeoutMinutes", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
