package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICD10CMConcept extends js.Object {
  /**
    * The ICD-10-CM code that identifies the concept found in the knowledge base from the Centers for Disease Control.
    */
  var Code: js.UndefOr[String] = js.native
  /**
    * The long description of the ICD-10-CM code in the ontology.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to an ICD-10-CM concept.
    */
  var Score: js.UndefOr[Float] = js.native
}

object ICD10CMConcept {
  @scala.inline
  def apply(Code: String = null, Description: String = null, Score: js.UndefOr[Float] = js.undefined): ICD10CMConcept = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(Score)) __obj.updateDynamic("Score")(Score.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICD10CMConcept]
  }
}

