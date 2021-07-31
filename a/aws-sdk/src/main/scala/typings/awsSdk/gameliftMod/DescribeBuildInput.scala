package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBuildInput extends StObject {
  
  /**
    * A unique identifier for a build to retrieve properties for. You can use either the build ID or ARN value. 
    */
  var BuildId: BuildIdOrArn
}
object DescribeBuildInput {
  
  @scala.inline
  def apply(BuildId: BuildIdOrArn): DescribeBuildInput = {
    val __obj = js.Dynamic.literal(BuildId = BuildId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBuildInput]
  }
  
  @scala.inline
  implicit class DescribeBuildInputMutableBuilder[Self <: DescribeBuildInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildId(value: BuildIdOrArn): Self = StObject.set(x, "BuildId", value.asInstanceOf[js.Any])
  }
}
