package typings
package backboneDashRelationalLib.backboneDashRelationalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone-relational", "Store")
@js.native
class Store ()
  extends backboneLib.backboneMod.EventsMixin
     with backboneLib.backboneMod.Events {
  def addModelScope(scope: js.Any): scala.Unit = js.native
  def addOrphanRelation(relation: js.Any): scala.Unit = js.native
  def addReverseRelation(relation: js.Any): scala.Unit = js.native
  def addSubModels(subModelTypes: Model, superModelType: Model): scala.Unit = js.native
  def checkId(model: Model, id: js.Any): scala.Unit = js.native
  def getCollection(`type`: Model, create: scala.Boolean): backboneLib.backboneMod.Collection[backboneLib.backboneMod.Model] = js.native
  def getObjectByName(name: java.lang.String): js.Any = js.native
  def initializeRelation(model: js.Any, relation: js.Any, options: js.Any): js.Any = js.native
  def processOrphanRelations(): scala.Unit = js.native
  def register(model: Model): scala.Unit = js.native
  def removeModelScope(scope: js.Any): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def resolveIdForItem(`type`: js.Any, item: js.Any): js.Any = js.native
  def retroFitRelation(relation: Model, create: scala.Boolean): backboneLib.backboneMod.Collection[backboneLib.backboneMod.Model] = js.native
  def setupSuperModel(modelType: Model): scala.Unit = js.native
  def unregister(
    model: Model,
    collection: backboneLib.backboneMod.Collection[backboneLib.backboneMod.Model],
    options: js.Any
  ): scala.Unit = js.native
  def update(model: Model): scala.Unit = js.native
}

/* static members */
@JSImport("backbone-relational", "Store")
@js.native
object Store extends js.Object {
  def find(`type`: js.Any, item: backboneDashRelationalLib.backboneDashRelationalMod.Model): backboneDashRelationalLib.backboneDashRelationalMod.Model = js.native
  def find(`type`: js.Any, item: java.lang.String): backboneDashRelationalLib.backboneDashRelationalMod.Model = js.native
  def find(`type`: js.Any, item: js.Any): backboneDashRelationalLib.backboneDashRelationalMod.Model = js.native
  def find(`type`: js.Any, item: scala.Double): backboneDashRelationalLib.backboneDashRelationalMod.Model = js.native
}

