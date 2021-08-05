package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelPackageInput extends StObject {
  
  /**
    * The name of the model package to describe.
    */
  var ModelPackageName: VersionedArnOrName
}
object DescribeModelPackageInput {
  
  inline def apply(ModelPackageName: VersionedArnOrName): DescribeModelPackageInput = {
    val __obj = js.Dynamic.literal(ModelPackageName = ModelPackageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelPackageInput]
  }
  
  extension [Self <: DescribeModelPackageInput](x: Self) {
    
    inline def setModelPackageName(value: VersionedArnOrName): Self = StObject.set(x, "ModelPackageName", value.asInstanceOf[js.Any])
  }
}
