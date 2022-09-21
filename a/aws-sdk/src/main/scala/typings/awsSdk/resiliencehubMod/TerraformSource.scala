package typings.awsSdk.resiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerraformSource extends StObject {
  
  /**
    *  The Terraform s3 state file you need to import. 
    */
  var s3StateFileUrl: S3Url
}
object TerraformSource {
  
  inline def apply(s3StateFileUrl: S3Url): TerraformSource = {
    val __obj = js.Dynamic.literal(s3StateFileUrl = s3StateFileUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerraformSource]
  }
  
  extension [Self <: TerraformSource](x: Self) {
    
    inline def setS3StateFileUrl(value: S3Url): Self = StObject.set(x, "s3StateFileUrl", value.asInstanceOf[js.Any])
  }
}
