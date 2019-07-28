package typings.backboneDashAssociations.backboneMod.AssociationsNs

import org.scalablytyped.runtime.Instantiable0
import typings.backbone.backboneMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRelation extends js.Object {
  /** Determines the type of collection used. If used, the relatedModel property is ignored */
  var collectionType: js.UndefOr[String | Instantiable0[Collection[js.Any]]] = js.undefined
  /** If set to true, then the attribute will not be serialized in toJSON() calls. Defaults to false */
  var isTransient: js.UndefOr[Boolean] = js.undefined
  /** The key for this relationship on this model */
  var key: String
  /** A transformation function to convert the value before it is assigned to the key on the relatedModel */
  var map: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  /** The type of model for this relationship */
  var relatedModel: String | Instantiable0[typings.backboneDashAssociations.backboneMod.AssociationsNs.AssociatedModel]
  /** Specify remoteKey to serialize the key to a different key name in toJSON() calls. Useful in ROR nested-attributes like scenarios. */
  var remoteKey: js.UndefOr[String] = js.undefined
  /** the attributes to serialize when calling toJSON */
  var serialize: js.UndefOr[js.Array[String]] = js.undefined
  // meh, no string enums in TS. Just have to trust the user not to be a fool
  /** The cardinality of this relationship. */
  var `type`: String
}

object IRelation {
  @scala.inline
  def apply(
    key: String,
    relatedModel: String | Instantiable0[typings.backboneDashAssociations.backboneMod.AssociationsNs.AssociatedModel],
    `type`: String,
    collectionType: String | Instantiable0[Collection[js.Any]] = null,
    isTransient: js.UndefOr[Boolean] = js.undefined,
    map: /* repeated */ js.Any => _ = null,
    remoteKey: String = null,
    serialize: js.Array[String] = null
  ): IRelation = {
    val __obj = js.Dynamic.literal(key = key, relatedModel = relatedModel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (collectionType != null) __obj.updateDynamic("collectionType")(collectionType.asInstanceOf[js.Any])
    if (!js.isUndefined(isTransient)) __obj.updateDynamic("isTransient")(isTransient)
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1(map))
    if (remoteKey != null) __obj.updateDynamic("remoteKey")(remoteKey)
    if (serialize != null) __obj.updateDynamic("serialize")(serialize)
    __obj.asInstanceOf[IRelation]
  }
}

