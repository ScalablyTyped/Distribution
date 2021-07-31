package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAlgorithmInput extends StObject {
  
  /**
    * The name of the algorithm to describe.
    */
  var AlgorithmName: ArnOrName
}
object DescribeAlgorithmInput {
  
  @scala.inline
  def apply(AlgorithmName: ArnOrName): DescribeAlgorithmInput = {
    val __obj = js.Dynamic.literal(AlgorithmName = AlgorithmName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlgorithmInput]
  }
  
  @scala.inline
  implicit class DescribeAlgorithmInputMutableBuilder[Self <: DescribeAlgorithmInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmName(value: ArnOrName): Self = StObject.set(x, "AlgorithmName", value.asInstanceOf[js.Any])
  }
}
