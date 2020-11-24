package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCuratedEnvironmentImagesOutput extends js.Object {
  
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
  implicit class ListCuratedEnvironmentImagesOutputOps[Self <: ListCuratedEnvironmentImagesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPlatformsVarargs(value: EnvironmentPlatform*): Self = this.set("platforms", js.Array(value :_*))
    
    @scala.inline
    def setPlatforms(value: EnvironmentPlatforms): Self = this.set("platforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatforms: Self = this.set("platforms", js.undefined)
  }
}
