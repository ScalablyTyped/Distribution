package typings
package backboneDashRelationalLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationalModel
  extends backboneLib.backboneMod.Model {
  /**
          * Do not use, prefer TypeScript's extend functionality.
          **/
  //private static extend(properties:any, classProperties?:any):any;
  var relations: js.Any = js.native
  var subModelTypeAttribute: js.Any = js.native
  var subModelTypes: js.Any = js.native
  def fetchRelated(key: java.lang.String): js.Any = js.native
  def fetchRelated(key: java.lang.String, options: js.Any): js.Any = js.native
  def fetchRelated(key: java.lang.String, options: js.Any, update: scala.Boolean): js.Any = js.native
  def getRelation(name: java.lang.String): Relation = js.native
  def getRelations(): js.Array[Relation] = js.native
  def initializeRelations(options: js.Any): scala.Unit = js.native
  def processQueue(): scala.Unit = js.native
  def queue(func: js.Any): scala.Unit = js.native
  def updateRelations(options: js.Any): scala.Unit = js.native
}

