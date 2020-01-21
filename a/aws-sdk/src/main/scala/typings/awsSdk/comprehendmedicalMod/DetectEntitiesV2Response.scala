package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectEntitiesV2Response extends js.Object {
  /**
    * The collection of medical entities extracted from the input text and their associated information. For each entity, the response provides the entity text, the entity category, where the entity text begins and ends, and the level of confidence in the detection and analysis. Attributes and traits of the entity are also returned.
    */
  var Entities: EntityList = js.native
  /**
    * The version of the model used to analyze the documents. The version number looks like X.X.X. You can use this information to track the model used for a particular batch of documents.
    */
  var ModelVersion: String = js.native
  /**
    * If the result to the DetectEntitiesV2 operation was truncated, include the PaginationToken to fetch the next page of entities.
    */
  var PaginationToken: js.UndefOr[String] = js.native
  /**
    * Attributes extracted from the input text that couldn't be related to an entity.
    */
  var UnmappedAttributes: js.UndefOr[UnmappedAttributeList] = js.native
}

object DetectEntitiesV2Response {
  @scala.inline
  def apply(
    Entities: EntityList,
    ModelVersion: String,
    PaginationToken: String = null,
    UnmappedAttributes: UnmappedAttributeList = null
  ): DetectEntitiesV2Response = {
    val __obj = js.Dynamic.literal(Entities = Entities.asInstanceOf[js.Any], ModelVersion = ModelVersion.asInstanceOf[js.Any])
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken.asInstanceOf[js.Any])
    if (UnmappedAttributes != null) __obj.updateDynamic("UnmappedAttributes")(UnmappedAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectEntitiesV2Response]
  }
}

