package typings.bson

import typings.bson.bsonStrings.base64
import typings.bson.bsonStrings.hex
import typings.bson.libBsonValueMod.BSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libObjectidMod {
  
  @JSImport("bson/lib/objectid", "ObjectId")
  @js.native
  /**
    * Create an ObjectId type
    *
    * @param inputId - Can be a 24 character hex string, 12 byte binary Buffer, or a number.
    */
  open class ObjectId () extends BSONValue {
    def this(inputId: String) = this()
    def this(inputId: js.typedarray.Uint8Array) = this()
    def this(inputId: Double) = this()
    def this(inputId: ObjectId) = this()
    def this(inputId: ObjectIdLike) = this()
    
    /** ObjectId hexString cache @internal */
    /* private */ var __id: Any = js.native
    
    /**
      * Compares the equality of this ObjectId with `otherID`.
      *
      * @param otherId - ObjectId instance to compare against.
      */
    def equals(otherId: String): Boolean = js.native
    def equals(otherId: ObjectId): Boolean = js.native
    def equals(otherId: ObjectIdLike): Boolean = js.native
    
    /** Returns the generation date (accurate up to the second) that this ID was generated. */
    def getTimestamp(): js.Date = js.native
    
    /**
      * The ObjectId bytes
      * @readonly
      */
    def id: js.typedarray.Uint8Array = js.native
    def id_=(value: js.typedarray.Uint8Array): Unit = js.native
    
    /** Returns the ObjectId id as a 24 character hex string representation */
    def toHexString(): String = js.native
    
    /** Converts to its JSON the 24 character hex string representation. */
    def toJSON(): String = js.native
    
    def toString(encoding: hex | base64): String = js.native
  }
  /* static members */
  object ObjectId {
    
    @JSImport("bson/lib/objectid", "ObjectId")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bson/lib/objectid", "ObjectId.cacheHexString")
    @js.native
    def cacheHexString: Boolean = js.native
    inline def cacheHexString_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cacheHexString")(x.asInstanceOf[js.Any])
    
    /** Creates an ObjectId instance from a base64 string */
    inline def createFromBase64(base64: String): ObjectId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[ObjectId]
    
    /**
      * Creates an ObjectId from a hex string representation of an ObjectId.
      *
      * @param hexString - create a ObjectId from a passed in 24 character hexstring.
      */
    inline def createFromHexString(hexString: String): ObjectId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromHexString")(hexString.asInstanceOf[js.Any]).asInstanceOf[ObjectId]
    
    /**
      * Creates an ObjectId from a second based number, with the rest of the ObjectId zeroed out. Used for comparisons or sorting the ObjectId.
      *
      * @param time - an integer number representing a number of seconds.
      */
    inline def createFromTime(time: Double): ObjectId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromTime")(time.asInstanceOf[js.Any]).asInstanceOf[ObjectId]
    
    /** @internal */
    inline def createPk(): ObjectId = ^.asInstanceOf[js.Dynamic].applyDynamic("createPk")().asInstanceOf[ObjectId]
    
    /** @internal */
    inline def fromExtendedJSON(doc: ObjectIdExtended): ObjectId = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[ObjectId]
    
    /**
      * Generate a 12 byte id buffer used in ObjectId's
      *
      * @param time - pass in a second based timestamp.
      */
    inline def generate(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[js.typedarray.Uint8Array]
    inline def generate(time: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(time.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    /**
      * Update the ObjectId index
      * @internal
      */
    @JSImport("bson/lib/objectid", "ObjectId.getInc")
    @js.native
    def getInc: Any = js.native
    inline def getInc_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInc")(x.asInstanceOf[js.Any])
    
    /** @internal */
    @JSImport("bson/lib/objectid", "ObjectId.index")
    @js.native
    def index: Any = js.native
    inline def index_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("index")(x.asInstanceOf[js.Any])
    
    /**
      * Checks if a value is a valid bson ObjectId
      *
      * @param id - ObjectId instance to validate.
      */
    inline def isValid(id: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isValid(id: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isValid(id: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isValid(id: ObjectId): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isValid(id: ObjectIdLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  trait ObjectIdExtended extends StObject {
    
    @JSName("$oid")
    var $oid: String
  }
  object ObjectIdExtended {
    
    inline def apply($oid: String): ObjectIdExtended = {
      val __obj = js.Dynamic.literal($oid = $oid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectIdExtended]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectIdExtended] (val x: Self) extends AnyVal {
      
      inline def set$oid(value: String): Self = StObject.set(x, "$oid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ObjectIdLike extends StObject {
    
    var __id: js.UndefOr[String] = js.undefined
    
    var id: String | js.typedarray.Uint8Array
    
    def toHexString(): String
  }
  object ObjectIdLike {
    
    inline def apply(id: String | js.typedarray.Uint8Array, toHexString: () => String): ObjectIdLike = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], toHexString = js.Any.fromFunction0(toHexString))
      __obj.asInstanceOf[ObjectIdLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectIdLike] (val x: Self) extends AnyVal {
      
      inline def setId(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setToHexString(value: () => String): Self = StObject.set(x, "toHexString", js.Any.fromFunction0(value))
      
      inline def set__id(value: String): Self = StObject.set(x, "__id", value.asInstanceOf[js.Any])
      
      inline def set__idUndefined: Self = StObject.set(x, "__id", js.undefined)
    }
  }
}
