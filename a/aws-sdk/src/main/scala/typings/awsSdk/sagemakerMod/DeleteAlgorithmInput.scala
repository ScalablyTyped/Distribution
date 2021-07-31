package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAlgorithmInput extends StObject {
  
  /**
    * The name of the algorithm to delete.
    */
  var AlgorithmName: EntityName
}
object DeleteAlgorithmInput {
  
  @scala.inline
  def apply(AlgorithmName: EntityName): DeleteAlgorithmInput = {
    val __obj = js.Dynamic.literal(AlgorithmName = AlgorithmName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAlgorithmInput]
  }
  
  @scala.inline
  implicit class DeleteAlgorithmInputMutableBuilder[Self <: DeleteAlgorithmInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmName(value: EntityName): Self = StObject.set(x, "AlgorithmName", value.asInstanceOf[js.Any])
  }
}
