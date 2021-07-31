package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterContainerImageResult extends StObject {
  
  var containerImage: js.UndefOr[ContainerImage] = js.undefined
}
object RegisterContainerImageResult {
  
  @scala.inline
  def apply(): RegisterContainerImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterContainerImageResult]
  }
  
  @scala.inline
  implicit class RegisterContainerImageResultMutableBuilder[Self <: RegisterContainerImageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerImage(value: ContainerImage): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerImageUndefined: Self = StObject.set(x, "containerImage", js.undefined)
  }
}
