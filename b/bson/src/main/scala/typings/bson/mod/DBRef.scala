package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson", "DBRef")
@js.native
open class DBRef protected () extends BSONValue {
  /**
    * @param collection - the collection name.
    * @param oid - the reference ObjectId.
    * @param db - optional db name, if omitted the reference is local to the current db.
    */
  def this(collection: String, oid: ObjectId) = this()
  def this(collection: String, oid: ObjectId, db: String) = this()
  def this(collection: String, oid: ObjectId, db: String, fields: Document) = this()
  def this(collection: String, oid: ObjectId, db: Unit, fields: Document) = this()
  
  var collection: String = js.native
  
  var db: js.UndefOr[String] = js.native
  
  var fields: Document = js.native
  
  var oid: ObjectId = js.native
  
  /* Excluded from this release type: namespace */
  /* Excluded from this release type: namespace */
  def toJSON(): DBRefLike & Document = js.native
}
