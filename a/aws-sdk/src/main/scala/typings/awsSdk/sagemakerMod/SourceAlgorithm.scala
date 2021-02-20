package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceAlgorithm extends StObject {
  
  /**
    * The name of an algorithm that was used to create the model package. The algorithm must be either an algorithm resource in your Amazon SageMaker account or an algorithm in AWS Marketplace that you are subscribed to.
    */
  var AlgorithmName: ArnOrName = js.native
  
  /**
    * The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix).  The model artifacts must be in an S3 bucket that is in the same region as the algorithm. 
    */
  var ModelDataUrl: js.UndefOr[Url] = js.native
}
object SourceAlgorithm {
  
  @scala.inline
  def apply(AlgorithmName: ArnOrName): SourceAlgorithm = {
    val __obj = js.Dynamic.literal(AlgorithmName = AlgorithmName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceAlgorithm]
  }
  
  @scala.inline
  implicit class SourceAlgorithmMutableBuilder[Self <: SourceAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmName(value: ArnOrName): Self = StObject.set(x, "AlgorithmName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelDataUrl(value: Url): Self = StObject.set(x, "ModelDataUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelDataUrlUndefined: Self = StObject.set(x, "ModelDataUrl", js.undefined)
  }
}
