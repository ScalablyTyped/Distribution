package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformParameters extends js.Object {
  /**
    * The parameters for the find matches algorithm.
    */
  var FindMatchesParameters: js.UndefOr[typings.awsSdk.glueMod.FindMatchesParameters] = js.native
  /**
    * The type of machine learning transform. For information about the types of machine learning transforms, see Creating Machine Learning Transforms.
    */
  var TransformType: typings.awsSdk.glueMod.TransformType = js.native
}

object TransformParameters {
  @scala.inline
  def apply(TransformType: TransformType): TransformParameters = {
    val __obj = js.Dynamic.literal(TransformType = TransformType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformParameters]
  }
  @scala.inline
  implicit class TransformParametersOps[Self <: TransformParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTransformType(value: TransformType): Self = this.set("TransformType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFindMatchesParameters(value: FindMatchesParameters): Self = this.set("FindMatchesParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindMatchesParameters: Self = this.set("FindMatchesParameters", js.undefined)
  }
  
}

