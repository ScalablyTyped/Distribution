package typings
package bsonLib.bsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bson", "DBRef")
@js.native
class DBRef protected () extends js.Object {
  /**
    * @param namespace The collection name.
    * @param oid The reference ObjectID.
    * @param db Optional db name, if omitted the reference is local to the current db
    */
  def this(namespace: java.lang.String, oid: ObjectID) = this()
  def this(namespace: java.lang.String, oid: ObjectID, db: java.lang.String) = this()
  var db: js.UndefOr[java.lang.String] = js.native
  var namespace: java.lang.String = js.native
  var oid: ObjectID = js.native
}

