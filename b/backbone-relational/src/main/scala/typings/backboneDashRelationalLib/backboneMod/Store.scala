package typings
package backboneDashRelationalLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone", "Store")
@js.native
class Store ()
  extends backboneLib.backboneMod.BackboneNs.Events {
  def addModelScope(scope: js.Any): scala.Unit = js.native
  def addOrphanRelation(relation: js.Any): scala.Unit = js.native
  def addReverseRelation(relation: js.Any): scala.Unit = js.native
  def addSubModels(subModelTypes: RelationalModel, superModelType: RelationalModel): scala.Unit = js.native
  def checkId(model: RelationalModel, id: js.Any): scala.Unit = js.native
  def getCollection(`type`: RelationalModel, create: scala.Boolean): backboneLib.backboneMod.Collection[backboneLib.backboneMod.Model] = js.native
  def getObjectByName(name: java.lang.String): js.Any = js.native
  def initializeRelation(model: js.Any, relation: js.Any, options: js.Any): js.Any = js.native
  def on(eventName: js.Any): js.Any = js.native
  def on(eventName: js.Any, callback: js.Any): js.Any = js.native
  def on(eventName: js.Any, callback: js.Any, context: js.Any): js.Any = js.native
  def processOrphanRelations(): scala.Unit = js.native
  def register(model: RelationalModel): scala.Unit = js.native
  def removeModelScope(scope: js.Any): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def resolveIdForItem(`type`: js.Any, item: js.Any): js.Any = js.native
  def retroFitRelation(relation: RelationalModel, create: scala.Boolean): backboneLib.backboneMod.Collection[backboneLib.backboneMod.Model] = js.native
  def setupSuperModel(modelType: RelationalModel): scala.Unit = js.native
  def unregister(
    model: RelationalModel,
    collection: backboneLib.backboneMod.Collection[backboneLib.backboneMod.Model],
    options: js.Any
  ): scala.Unit = js.native
  def update(model: RelationalModel): scala.Unit = js.native
}

/* static members */
@JSImport("backbone", "Store")
@js.native
object Store extends js.Object {
  def find(`type`: js.Any, item: backboneDashRelationalLib.backboneMod.RelationalModel): backboneDashRelationalLib.backboneMod.RelationalModel = js.native
  def find(`type`: js.Any, item: java.lang.String): backboneDashRelationalLib.backboneMod.RelationalModel = js.native
  def find(`type`: js.Any, item: js.Any): backboneDashRelationalLib.backboneMod.RelationalModel = js.native
  def find(`type`: js.Any, item: scala.Double): backboneDashRelationalLib.backboneMod.RelationalModel = js.native
}

