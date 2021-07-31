package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelInput extends StObject {
  
  /**
    * The name of the model.
    */
  var ModelName: typings.awsSdk.sagemakerMod.ModelName
}
object DescribeModelInput {
  
  @scala.inline
  def apply(ModelName: ModelName): DescribeModelInput = {
    val __obj = js.Dynamic.literal(ModelName = ModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelInput]
  }
  
  @scala.inline
  implicit class DescribeModelInputMutableBuilder[Self <: DescribeModelInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
  }
}
