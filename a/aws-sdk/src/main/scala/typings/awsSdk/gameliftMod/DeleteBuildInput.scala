package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBuildInput extends StObject {
  
  /**
    * A unique identifier for a build to delete. You can use either the build ID or ARN value. 
    */
  var BuildId: BuildIdOrArn = js.native
}
object DeleteBuildInput {
  
  @scala.inline
  def apply(BuildId: BuildIdOrArn): DeleteBuildInput = {
    val __obj = js.Dynamic.literal(BuildId = BuildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBuildInput]
  }
  
  @scala.inline
  implicit class DeleteBuildInputMutableBuilder[Self <: DeleteBuildInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildId(value: BuildIdOrArn): Self = StObject.set(x, "BuildId", value.asInstanceOf[js.Any])
  }
}
