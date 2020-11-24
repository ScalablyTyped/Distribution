package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlgorithmImage extends js.Object {
  
  /**
    * The URI of the Docker container for the algorithm image.
    */
  var dockerURI: DockerURI = js.native
  
  /**
    * The name of the algorithm image.
    */
  var name: js.UndefOr[Name] = js.native
}
object AlgorithmImage {
  
  @scala.inline
  def apply(dockerURI: DockerURI): AlgorithmImage = {
    val __obj = js.Dynamic.literal(dockerURI = dockerURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmImage]
  }
  
  @scala.inline
  implicit class AlgorithmImageOps[Self <: AlgorithmImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDockerURI(value: DockerURI): Self = this.set("dockerURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
