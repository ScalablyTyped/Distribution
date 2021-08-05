package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageConfig extends StObject {
  
  /**
    * Set this to one of the following values:    Platform - The model image is hosted in Amazon ECR.    Vpc - The model image is hosted in a private Docker registry in your VPC.  
    */
  var RepositoryAccessMode: typings.awsSdk.sagemakerMod.RepositoryAccessMode
}
object ImageConfig {
  
  inline def apply(RepositoryAccessMode: RepositoryAccessMode): ImageConfig = {
    val __obj = js.Dynamic.literal(RepositoryAccessMode = RepositoryAccessMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageConfig]
  }
  
  extension [Self <: ImageConfig](x: Self) {
    
    inline def setRepositoryAccessMode(value: RepositoryAccessMode): Self = StObject.set(x, "RepositoryAccessMode", value.asInstanceOf[js.Any])
  }
}
