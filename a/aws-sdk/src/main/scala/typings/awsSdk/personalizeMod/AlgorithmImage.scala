package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlgorithmImage extends StObject {
  
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
  implicit class AlgorithmImageMutableBuilder[Self <: AlgorithmImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDockerURI(value: DockerURI): Self = StObject.set(x, "dockerURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
