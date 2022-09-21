package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelPackageGroupInput extends StObject {
  
  /**
    * The name of gthe model group to describe.
    */
  var ModelPackageGroupName: ArnOrName
}
object DescribeModelPackageGroupInput {
  
  inline def apply(ModelPackageGroupName: ArnOrName): DescribeModelPackageGroupInput = {
    val __obj = js.Dynamic.literal(ModelPackageGroupName = ModelPackageGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelPackageGroupInput]
  }
  
  extension [Self <: DescribeModelPackageGroupInput](x: Self) {
    
    inline def setModelPackageGroupName(value: ArnOrName): Self = StObject.set(x, "ModelPackageGroupName", value.asInstanceOf[js.Any])
  }
}
