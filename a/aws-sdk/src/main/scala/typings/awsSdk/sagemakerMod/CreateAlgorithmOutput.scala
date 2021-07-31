package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAlgorithmOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the new algorithm.
    */
  var AlgorithmArn: typings.awsSdk.sagemakerMod.AlgorithmArn
}
object CreateAlgorithmOutput {
  
  @scala.inline
  def apply(AlgorithmArn: AlgorithmArn): CreateAlgorithmOutput = {
    val __obj = js.Dynamic.literal(AlgorithmArn = AlgorithmArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAlgorithmOutput]
  }
  
  @scala.inline
  implicit class CreateAlgorithmOutputMutableBuilder[Self <: CreateAlgorithmOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmArn(value: AlgorithmArn): Self = StObject.set(x, "AlgorithmArn", value.asInstanceOf[js.Any])
  }
}
