package typings.bson

import typings.bson.libBsonValueMod.BSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDecimal128Mod {
  
  @JSImport("bson/lib/decimal128", "Decimal128")
  @js.native
  open class Decimal128 protected () extends BSONValue {
    def this(bytes: String) = this()
    /**
      * @param bytes - a buffer containing the raw Decimal128 bytes in little endian order,
      *                or a string representation as returned by .toString()
      */
    def this(bytes: js.typedarray.Uint8Array) = this()
    
    val bytes: js.typedarray.Uint8Array = js.native
    
    def toJSON(): Decimal128Extended = js.native
  }
  /* static members */
  object Decimal128 {
    
    @JSImport("bson/lib/decimal128", "Decimal128")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromExtendedJSON(doc: Decimal128Extended): Decimal128 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[Decimal128]
    
    /**
      * Create a Decimal128 instance from a string representation
      *
      * @param representation - a numeric string representation.
      */
    inline def fromString(representation: String): Decimal128 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(representation.asInstanceOf[js.Any]).asInstanceOf[Decimal128]
  }
  
  trait Decimal128Extended extends StObject {
    
    @JSName("$numberDecimal")
    var $numberDecimal: String
  }
  object Decimal128Extended {
    
    inline def apply($numberDecimal: String): Decimal128Extended = {
      val __obj = js.Dynamic.literal($numberDecimal = $numberDecimal.asInstanceOf[js.Any])
      __obj.asInstanceOf[Decimal128Extended]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Decimal128Extended] (val x: Self) extends AnyVal {
      
      inline def set$numberDecimal(value: String): Self = StObject.set(x, "$numberDecimal", value.asInstanceOf[js.Any])
    }
  }
}
