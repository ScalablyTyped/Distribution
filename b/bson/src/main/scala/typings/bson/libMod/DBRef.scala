package typings.bson.libMod

import typings.bson.libBsonMod.Document
import typings.bson.libDbRefMod.DBRefLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson/lib", "DBRef")
@js.native
open class DBRef protected ()
  extends typings.bson.libBsonMod.DBRef {
  /**
    * @param collection - the collection name.
    * @param oid - the reference ObjectId.
    * @param db - optional db name, if omitted the reference is local to the current db.
    */
  def this(collection: String, oid: typings.bson.libObjectidMod.ObjectId) = this()
  def this(collection: String, oid: typings.bson.libObjectidMod.ObjectId, db: String) = this()
  def this(collection: String, oid: typings.bson.libObjectidMod.ObjectId, db: String, fields: Document) = this()
  def this(collection: String, oid: typings.bson.libObjectidMod.ObjectId, db: Unit, fields: Document) = this()
}
/* static members */
object DBRef {
  
  @JSImport("bson/lib", "DBRef")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  inline def fromExtendedJSON(doc: DBRefLike): typings.bson.libDbRefMod.DBRef = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libDbRefMod.DBRef]
}
