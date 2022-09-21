package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDescribeModelPackageInput extends StObject {
  
  /**
    * The list of Amazon Resource Name (ARN) of the model package groups.
    */
  var ModelPackageArnList: typings.awsSdk.sagemakerMod.ModelPackageArnList
}
object BatchDescribeModelPackageInput {
  
  inline def apply(ModelPackageArnList: ModelPackageArnList): BatchDescribeModelPackageInput = {
    val __obj = js.Dynamic.literal(ModelPackageArnList = ModelPackageArnList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDescribeModelPackageInput]
  }
  
  extension [Self <: BatchDescribeModelPackageInput](x: Self) {
    
    inline def setModelPackageArnList(value: ModelPackageArnList): Self = StObject.set(x, "ModelPackageArnList", value.asInstanceOf[js.Any])
    
    inline def setModelPackageArnListVarargs(value: ModelPackageArn*): Self = StObject.set(x, "ModelPackageArnList", js.Array(value*))
  }
}
