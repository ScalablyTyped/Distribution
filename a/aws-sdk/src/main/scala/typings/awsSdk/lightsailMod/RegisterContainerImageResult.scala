package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterContainerImageResult extends StObject {
  
  var containerImage: js.UndefOr[ContainerImage] = js.undefined
}
object RegisterContainerImageResult {
  
  inline def apply(): RegisterContainerImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterContainerImageResult]
  }
  
  extension [Self <: RegisterContainerImageResult](x: Self) {
    
    inline def setContainerImage(value: ContainerImage): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
    
    inline def setContainerImageUndefined: Self = StObject.set(x, "containerImage", js.undefined)
  }
}
