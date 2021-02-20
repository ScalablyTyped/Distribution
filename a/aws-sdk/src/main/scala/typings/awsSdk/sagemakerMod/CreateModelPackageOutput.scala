package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateModelPackageOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the new model package.
    */
  var ModelPackageArn: typings.awsSdk.sagemakerMod.ModelPackageArn = js.native
}
object CreateModelPackageOutput {
  
  @scala.inline
  def apply(ModelPackageArn: ModelPackageArn): CreateModelPackageOutput = {
    val __obj = js.Dynamic.literal(ModelPackageArn = ModelPackageArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelPackageOutput]
  }
  
  @scala.inline
  implicit class CreateModelPackageOutputMutableBuilder[Self <: CreateModelPackageOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelPackageArn(value: ModelPackageArn): Self = StObject.set(x, "ModelPackageArn", value.asInstanceOf[js.Any])
  }
}
