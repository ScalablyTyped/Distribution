package typings.backboneRelational.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone-relational", "Model")
@js.native
class Model ()
  extends typings.backbone.mod.Model {
  /**
    * Do not use, prefer TypeScript's extend functionality.
    **/
  //private static extend(properties:any, classProperties?:any):any;
  var relations: js.Any = js.native
  var subModelTypeAttribute: js.Any = js.native
  var subModelTypes: js.Any = js.native
  def fetchRelated(key: String): js.Any = js.native
  def fetchRelated(key: String, options: js.Any): js.Any = js.native
  def fetchRelated(key: String, options: js.Any, update: Boolean): js.Any = js.native
  def getRelation(name: String): Relation = js.native
  def getRelations(): js.Array[Relation] = js.native
  def initializeRelations(options: js.Any): Unit = js.native
  def processQueue(): Unit = js.native
  def queue(func: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toJSON(options: js.Any): js.Any = js.native
  def updateRelations(options: js.Any): Unit = js.native
}

/* static members */
@JSImport("backbone-relational", "Model")
@js.native
object Model extends js.Object {
  def build(attributes: js.Any): js.Any = js.native
  def build(attributes: js.Any, options: js.Any): js.Any = js.native
  def findOrCreate(attributes: String): js.Any = js.native
  def findOrCreate(attributes: String, options: js.Any): js.Any = js.native
  def findOrCreate(attributes: js.Any): js.Any = js.native
  def findOrCreate(attributes: js.Any, options: js.Any): js.Any = js.native
  def findOrCreate(attributes: Double): js.Any = js.native
  def findOrCreate(attributes: Double, options: js.Any): js.Any = js.native
  def setup(): js.Any = js.native
}

