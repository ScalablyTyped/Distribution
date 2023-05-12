package typings.bson

import typings.bson.libBsonValueMod.BSONValue
import typings.bson.libExtendedJsonMod.EJSONOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDoubleMod {
  
  @JSImport("bson/lib/double", "Double")
  @js.native
  open class Double protected () extends BSONValue {
    /**
      * Create a Double type
      *
      * @param value - the number we want to represent as a double.
      */
    def this(value: scala.Double) = this()
    
    def toExtendedJSON(options: EJSONOptions): scala.Double | DoubleExtended = js.native
    
    def toJSON(): scala.Double = js.native
    
    def toString(radix: scala.Double): String = js.native
    
    var value: scala.Double = js.native
  }
  /* static members */
  object Double {
    
    @JSImport("bson/lib/double", "Double")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromExtendedJSON(doc: DoubleExtended): scala.Double | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[scala.Double | Double]
    inline def fromExtendedJSON(doc: DoubleExtended, options: EJSONOptions): scala.Double | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double | Double]
  }
  
  trait DoubleExtended extends StObject {
    
    @JSName("$numberDouble")
    var $numberDouble: String
  }
  object DoubleExtended {
    
    inline def apply($numberDouble: String): DoubleExtended = {
      val __obj = js.Dynamic.literal($numberDouble = $numberDouble.asInstanceOf[js.Any])
      __obj.asInstanceOf[DoubleExtended]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DoubleExtended] (val x: Self) extends AnyVal {
      
      inline def set$numberDouble(value: String): Self = StObject.set(x, "$numberDouble", value.asInstanceOf[js.Any])
    }
  }
}
