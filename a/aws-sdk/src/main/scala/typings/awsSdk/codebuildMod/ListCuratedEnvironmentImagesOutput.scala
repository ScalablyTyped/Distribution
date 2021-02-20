package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCuratedEnvironmentImagesOutput extends StObject {
  
  /**
    * Information about supported platforms for Docker images that are managed by AWS CodeBuild.
    */
  var platforms: js.UndefOr[EnvironmentPlatforms] = js.native
}
object ListCuratedEnvironmentImagesOutput {
  
  @scala.inline
  def apply(): ListCuratedEnvironmentImagesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCuratedEnvironmentImagesOutput]
  }
  
  @scala.inline
  implicit class ListCuratedEnvironmentImagesOutputMutableBuilder[Self <: ListCuratedEnvironmentImagesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlatforms(value: EnvironmentPlatforms): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    @scala.inline
    def setPlatformsVarargs(value: EnvironmentPlatform*): Self = StObject.set(x, "platforms", js.Array(value :_*))
  }
}
