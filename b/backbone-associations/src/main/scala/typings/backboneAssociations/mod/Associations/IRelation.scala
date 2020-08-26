package typings.backboneAssociations.mod.Associations

import org.scalablytyped.runtime.Instantiable0
import typings.backbone.mod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRelation extends js.Object {
  /** Determines the type of collection used. If used, the relatedModel property is ignored */
  var collectionType: js.UndefOr[String | Instantiable0[Collection[js.Any]]] = js.native
  /** If set to true, then the attribute will not be serialized in toJSON() calls. Defaults to false */
  var isTransient: js.UndefOr[Boolean] = js.native
  /** The key for this relationship on this model */
  var key: String = js.native
  /** A transformation function to convert the value before it is assigned to the key on the relatedModel */
  var map: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  /** The type of model for this relationship */
  var relatedModel: String | Instantiable0[AssociatedModel] = js.native
  /** Specify remoteKey to serialize the key to a different key name in toJSON() calls. Useful in ROR nested-attributes like scenarios. */
  var remoteKey: js.UndefOr[String] = js.native
  /** the attributes to serialize when calling toJSON */
  var serialize: js.UndefOr[js.Array[String]] = js.native
  // meh, no string enums in TS. Just have to trust the user not to be a fool
  /** The cardinality of this relationship. */
  var `type`: String = js.native
}

object IRelation {
  @scala.inline
  def apply(key: String, relatedModel: String | Instantiable0[AssociatedModel], `type`: String): IRelation = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], relatedModel = relatedModel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRelation]
  }
  @scala.inline
  implicit class IRelationOps[Self <: IRelation] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelatedModel(value: String | Instantiable0[AssociatedModel]): Self = this.set("relatedModel", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollectionType(value: String | Instantiable0[Collection[js.Any]]): Self = this.set("collectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectionType: Self = this.set("collectionType", js.undefined)
    @scala.inline
    def setIsTransient(value: Boolean): Self = this.set("isTransient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTransient: Self = this.set("isTransient", js.undefined)
    @scala.inline
    def setMap(value: /* repeated */ js.Any => _): Self = this.set("map", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setRemoteKey(value: String): Self = this.set("remoteKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteKey: Self = this.set("remoteKey", js.undefined)
    @scala.inline
    def setSerializeVarargs(value: String*): Self = this.set("serialize", js.Array(value :_*))
    @scala.inline
    def setSerialize(value: js.Array[String]): Self = this.set("serialize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
  }
  
}

