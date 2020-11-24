package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentImage extends js.Object {
  
  /**
    * The description of the Docker image.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The name of the Docker image.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A list of environment image versions.
    */
  var versions: js.UndefOr[ImageVersions] = js.native
}
object EnvironmentImage {
  
  @scala.inline
  def apply(): EnvironmentImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentImage]
  }
  
  @scala.inline
  implicit class EnvironmentImageOps[Self <: EnvironmentImage] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: String*): Self = this.set("versions", js.Array(value :_*))
    
    @scala.inline
    def setVersions(value: ImageVersions): Self = this.set("versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
  }
}
