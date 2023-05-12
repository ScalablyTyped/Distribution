package typings.bson

import typings.bson.libBsonMod.Document
import typings.bson.libBsonValueMod.BSONValue
import typings.bson.libExtendedJsonMod.EJSONOptions
import typings.bson.libObjectidMod.ObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDbRefMod {
  
  @JSImport("bson/lib/db_ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bson/lib/db_ref", "DBRef")
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
    
    /** @internal */
    def namespace: String = js.native
    def namespace_=(value: String): Unit = js.native
    
    var oid: ObjectId = js.native
    
    def toExtendedJSON(options: EJSONOptions): DBRefLike = js.native
    
    def toJSON(): DBRefLike & Document = js.native
  }
  /* static members */
  object DBRef {
    
    @JSImport("bson/lib/db_ref", "DBRef")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromExtendedJSON(doc: DBRefLike): DBRef = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[DBRef]
  }
  
  inline def isDBRefLike(value: Any): /* is bson.bson/lib/db_ref.DBRefLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDBRefLike")(value.asInstanceOf[js.Any]).asInstanceOf[/* is bson.bson/lib/db_ref.DBRefLike */ Boolean]
  
  trait DBRefLike extends StObject {
    
    @JSName("$db")
    var $db: js.UndefOr[String] = js.undefined
    
    @JSName("$id")
    var $id: ObjectId
    
    @JSName("$ref")
    var $ref: String
  }
  object DBRefLike {
    
    inline def apply($id: ObjectId, $ref: String): DBRefLike = {
      val __obj = js.Dynamic.literal($id = $id.asInstanceOf[js.Any], $ref = $ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[DBRefLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DBRefLike] (val x: Self) extends AnyVal {
      
      inline def set$db(value: String): Self = StObject.set(x, "$db", value.asInstanceOf[js.Any])
      
      inline def set$dbUndefined: Self = StObject.set(x, "$db", js.undefined)
      
      inline def set$id(value: ObjectId): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
      
      inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    }
  }
}
