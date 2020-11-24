package typings.backboneRelational.mod

import typings.backbone.mod.Collection
import typings.backbone.mod.ModelSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backbone-relational", "HasOne")
@js.native
class HasOne () extends Relation {
  
  def addRelated(model: typings.backbone.mod.Model[_, ModelSetOptions, js.Object], options: js.Any): Unit = js.native
  
  var collectionType: js.Any = js.native
  
  def findRelated(options: js.Any): typings.backbone.mod.Model[_, ModelSetOptions, js.Object] = js.native
  
  def handleAddition(
    model: typings.backbone.mod.Model[_, ModelSetOptions, js.Object],
    coll: Collection[typings.backbone.mod.Model[_, ModelSetOptions, js.Object]],
    options: js.Any
  ): Unit = js.native
  
  def handleRemoval(
    model: typings.backbone.mod.Model[_, ModelSetOptions, js.Object],
    coll: Collection[typings.backbone.mod.Model[_, ModelSetOptions, js.Object]],
    options: js.Any
  ): Unit = js.native
  
  def handleReset(coll: Collection[typings.backbone.mod.Model[_, ModelSetOptions, js.Object]], options: js.Any): Unit = js.native
  
  def onChange(model: typings.backbone.mod.Model[_, ModelSetOptions, js.Object], attr: js.Any, options: js.Any): Unit = js.native
  
  def removeRelated(model: typings.backbone.mod.Model[_, ModelSetOptions, js.Object], coll: js.Any, options: js.Any): Unit = js.native
  
  def setKeyContents(keyContents: String): Unit = js.native
  def setKeyContents(keyContents: js.Array[Double | String]): Unit = js.native
  def setKeyContents(keyContents: Double): Unit = js.native
  def setKeyContents(keyContents: Collection[typings.backbone.mod.Model[_, ModelSetOptions, js.Object]]): Unit = js.native
  
  def tryAddRelated(model: typings.backbone.mod.Model[_, ModelSetOptions, js.Object], coll: js.Any, options: js.Any): Unit = js.native
}
