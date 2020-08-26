package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceAlgorithm extends js.Object {
  /**
    * The name of an algorithm that was used to create the model package. The algorithm must be either an algorithm resource in your Amazon SageMaker account or an algorithm in AWS Marketplace that you are subscribed to.
    */
  var AlgorithmName: ArnOrName = js.native
  /**
    * The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix).
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
  implicit class SourceAlgorithmOps[Self <: SourceAlgorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlgorithmName(value: ArnOrName): Self = this.set("AlgorithmName", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelDataUrl(value: Url): Self = this.set("ModelDataUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelDataUrl: Self = this.set("ModelDataUrl", js.undefined)
  }
  
}

