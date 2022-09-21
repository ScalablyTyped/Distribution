package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateModelPackageOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the model.
    */
  var ModelPackageArn: typings.awsSdk.sagemakerMod.ModelPackageArn
}
object UpdateModelPackageOutput {
  
  inline def apply(ModelPackageArn: ModelPackageArn): UpdateModelPackageOutput = {
    val __obj = js.Dynamic.literal(ModelPackageArn = ModelPackageArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateModelPackageOutput]
  }
  
  extension [Self <: UpdateModelPackageOutput](x: Self) {
    
    inline def setModelPackageArn(value: ModelPackageArn): Self = StObject.set(x, "ModelPackageArn", value.asInstanceOf[js.Any])
  }
}
