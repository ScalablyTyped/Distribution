package typings.bson

import typings.bson.libBsonValueMod.BSONValue
import typings.bson.libExtendedJsonMod.EJSONOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInt32Mod {
  
  @JSImport("bson/lib/int_32", "Int32")
  @js.native
  open class Int32 protected () extends BSONValue {
    def this(value: String) = this()
    /**
      * Create an Int32 type
      *
      * @param value - the number we want to represent as an int32.
      */
    def this(value: Double) = this()
    
    def toExtendedJSON(options: EJSONOptions): Double | Int32Extended = js.native
    
    def toJSON(): Double = js.native
    
    def toString(radix: Double): String = js.native
    
    var value: Double = js.native
  }
  /* static members */
  object Int32 {
    
    @JSImport("bson/lib/int_32", "Int32")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromExtendedJSON(doc: Int32Extended): Double | Int32 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[Double | Int32]
    inline def fromExtendedJSON(doc: Int32Extended, options: EJSONOptions): Double | Int32 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double | Int32]
  }
  
  trait Int32Extended extends StObject {
    
    @JSName("$numberInt")
    var $numberInt: String
  }
  object Int32Extended {
    
    inline def apply($numberInt: String): Int32Extended = {
      val __obj = js.Dynamic.literal($numberInt = $numberInt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Int32Extended]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Int32Extended] (val x: Self) extends AnyVal {
      
      inline def set$numberInt(value: String): Self = StObject.set(x, "$numberInt", value.asInstanceOf[js.Any])
    }
  }
}
