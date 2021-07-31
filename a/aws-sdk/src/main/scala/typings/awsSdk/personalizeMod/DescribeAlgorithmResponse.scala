package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAlgorithmResponse extends StObject {
  
  /**
    * A listing of the properties of the algorithm.
    */
  var algorithm: js.UndefOr[Algorithm] = js.undefined
}
object DescribeAlgorithmResponse {
  
  @scala.inline
  def apply(): DescribeAlgorithmResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlgorithmResponse]
  }
  
  @scala.inline
  implicit class DescribeAlgorithmResponseMutableBuilder[Self <: DescribeAlgorithmResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
  }
}
