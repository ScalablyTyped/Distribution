package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentMetadataConfiguration extends js.Object {
  /**
    * The name of the index field.
    */
  var Name: DocumentMetadataConfigurationName = js.native
  /**
    * Provides manual tuning parameters to determine how the field affects the search results.
    */
  var Relevance: js.UndefOr[typings.awsSdk.kendraMod.Relevance] = js.native
  /**
    * Provides information about how the field is used during a search.
    */
  var Search: js.UndefOr[typings.awsSdk.kendraMod.Search] = js.native
  /**
    * The data type of the index field. 
    */
  var Type: DocumentAttributeValueType = js.native
}

object DocumentMetadataConfiguration {
  @scala.inline
  def apply(
    Name: DocumentMetadataConfigurationName,
    Type: DocumentAttributeValueType,
    Relevance: Relevance = null,
    Search: Search = null
  ): DocumentMetadataConfiguration = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (Relevance != null) __obj.updateDynamic("Relevance")(Relevance.asInstanceOf[js.Any])
    if (Search != null) __obj.updateDynamic("Search")(Search.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentMetadataConfiguration]
  }
}

