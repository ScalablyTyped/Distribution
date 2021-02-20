package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBuildInput extends StObject {
  
  /**
    * A unique identifier for a build to update. You can use either the build ID or ARN value. 
    */
  var BuildId: BuildIdOrArn = js.native
  
  /**
    * A descriptive label that is associated with a build. Build names do not need to be unique. 
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * Version information that is associated with a build or script. Version strings do not need to be unique.
    */
  var Version: js.UndefOr[NonZeroAndMaxString] = js.native
}
object UpdateBuildInput {
  
  @scala.inline
  def apply(BuildId: BuildIdOrArn): UpdateBuildInput = {
    val __obj = js.Dynamic.literal(BuildId = BuildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBuildInput]
  }
  
  @scala.inline
  implicit class UpdateBuildInputMutableBuilder[Self <: UpdateBuildInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildId(value: BuildIdOrArn): Self = StObject.set(x, "BuildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NonZeroAndMaxString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setVersion(value: NonZeroAndMaxString): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
