package typings.bson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson", "DBRef")
@js.native
class DBRef protected () extends js.Object {
  /**
    * @param namespace The collection name.
    * @param oid The reference ObjectId.
    * @param db Optional db name, if omitted the reference is local to the current db
    */
  def this(namespace: String, oid: ObjectId) = this()
  def this(namespace: String, oid: ObjectId, db: String) = this()
  
  var db: js.UndefOr[String] = js.native
  
  var namespace: String = js.native
  
  var oid: ObjectId = js.native
}
