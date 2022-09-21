package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.Instantiable2
import typings.awsSdk.mod.CloudFront.Signer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCloudFront extends StObject {
  
  val Signer: Instantiable2[
    /* keyPairId */ String, 
    /* privateKey */ String, 
    typings.awsSdk.mod.CloudFront.Signer
  ]
  
  val Types: this.type
}
object TypeofCloudFront {
  
  inline def apply(
    Signer: Instantiable2[/* keyPairId */ String, /* privateKey */ String, Signer],
    Types: TypeofCloudFront
  ): TypeofCloudFront = {
    val __obj = js.Dynamic.literal(Signer = Signer.asInstanceOf[js.Any], Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCloudFront]
  }
  
  extension [Self <: TypeofCloudFront](x: Self) {
    
    inline def setSigner(value: Instantiable2[/* keyPairId */ String, /* privateKey */ String, Signer]): Self = StObject.set(x, "Signer", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: TypeofCloudFront): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
  }
}
