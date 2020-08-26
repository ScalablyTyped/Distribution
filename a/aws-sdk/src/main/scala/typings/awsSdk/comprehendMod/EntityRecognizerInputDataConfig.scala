package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityRecognizerInputDataConfig extends js.Object {
  /**
    * S3 location of the annotations file for an entity recognizer.
    */
  var Annotations: js.UndefOr[EntityRecognizerAnnotations] = js.native
  /**
    * S3 location of the documents folder for an entity recognizer
    */
  var Documents: EntityRecognizerDocuments = js.native
  /**
    * S3 location of the entity list for an entity recognizer.
    */
  var EntityList: js.UndefOr[EntityRecognizerEntityList] = js.native
  /**
    * The entity types in the input data for an entity recognizer. A maximum of 12 entity types can be used at one time to train an entity recognizer.
    */
  var EntityTypes: EntityTypesList = js.native
}

object EntityRecognizerInputDataConfig {
  @scala.inline
  def apply(Documents: EntityRecognizerDocuments, EntityTypes: EntityTypesList): EntityRecognizerInputDataConfig = {
    val __obj = js.Dynamic.literal(Documents = Documents.asInstanceOf[js.Any], EntityTypes = EntityTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityRecognizerInputDataConfig]
  }
  @scala.inline
  implicit class EntityRecognizerInputDataConfigOps[Self <: EntityRecognizerInputDataConfig] (val x: Self) extends AnyVal {
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
    def setDocuments(value: EntityRecognizerDocuments): Self = this.set("Documents", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntityTypesVarargs(value: EntityTypesListItem*): Self = this.set("EntityTypes", js.Array(value :_*))
    @scala.inline
    def setEntityTypes(value: EntityTypesList): Self = this.set("EntityTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnnotations(value: EntityRecognizerAnnotations): Self = this.set("Annotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotations: Self = this.set("Annotations", js.undefined)
    @scala.inline
    def setEntityList(value: EntityRecognizerEntityList): Self = this.set("EntityList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityList: Self = this.set("EntityList", js.undefined)
  }
  
}

