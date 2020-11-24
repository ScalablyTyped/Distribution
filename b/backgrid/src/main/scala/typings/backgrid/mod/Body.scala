package typings.backgrid.mod

import typings.backbone.mod.Collection
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import typings.backbone.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backgrid", "Body")
@js.native
class Body ()
  extends View[Model[js.Any, ModelSetOptions, js.Object]] {
  
  def initialize(options: js.Any): Unit = js.native
  
  def insertRow(
    model: Model[_, ModelSetOptions, js.Object],
    collection: Collection[Model[_, ModelSetOptions, js.Object]],
    options: js.Any
  ): js.Any = js.native
  
  def moveToNextCell(model: Model[_, ModelSetOptions, js.Object], cell: Column, command: Command): js.Any = js.native
  
  def refresh(): Body = js.native
  
  def removeRow(
    model: Model[_, ModelSetOptions, js.Object],
    collection: Collection[Model[_, ModelSetOptions, js.Object]],
    options: js.Any
  ): js.Any = js.native
}
