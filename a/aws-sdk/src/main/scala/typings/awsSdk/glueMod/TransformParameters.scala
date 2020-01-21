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
  def apply(TransformType: TransformType, FindMatchesParameters: FindMatchesParameters = null): TransformParameters = {
    val __obj = js.Dynamic.literal(TransformType = TransformType.asInstanceOf[js.Any])
    if (FindMatchesParameters != null) __obj.updateDynamic("FindMatchesParameters")(FindMatchesParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformParameters]
  }
}

