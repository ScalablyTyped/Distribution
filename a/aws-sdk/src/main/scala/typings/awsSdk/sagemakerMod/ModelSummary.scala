package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelSummary extends StObject {
  
  /**
    * A timestamp that indicates when the model was created.
    */
  var CreationTime: Timestamp = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the model.
    */
  var ModelArn: typings.awsSdk.sagemakerMod.ModelArn = js.native
  
  /**
    * The name of the model that you want a summary for.
    */
  var ModelName: typings.awsSdk.sagemakerMod.ModelName = js.native
}
object ModelSummary {
  
  @scala.inline
  def apply(CreationTime: Timestamp, ModelArn: ModelArn, ModelName: ModelName): ModelSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ModelArn = ModelArn.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelSummary]
  }
  
  @scala.inline
  implicit class ModelSummaryMutableBuilder[Self <: ModelSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelArn(value: ModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
  }
}
