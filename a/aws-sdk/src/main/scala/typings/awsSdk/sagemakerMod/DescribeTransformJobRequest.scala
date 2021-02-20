package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTransformJobRequest extends StObject {
  
  /**
    * The name of the transform job that you want to view details of.
    */
  var TransformJobName: typings.awsSdk.sagemakerMod.TransformJobName = js.native
}
object DescribeTransformJobRequest {
  
  @scala.inline
  def apply(TransformJobName: TransformJobName): DescribeTransformJobRequest = {
    val __obj = js.Dynamic.literal(TransformJobName = TransformJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTransformJobRequest]
  }
  
  @scala.inline
  implicit class DescribeTransformJobRequestMutableBuilder[Self <: DescribeTransformJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransformJobName(value: TransformJobName): Self = StObject.set(x, "TransformJobName", value.asInstanceOf[js.Any])
  }
}
