package typings.bson

import typings.bson.anon.Options
import typings.bson.libBsonValueMod.BSONValue
import typings.bson.libExtendedJsonMod.EJSONOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRegexpMod {
  
  @JSImport("bson/lib/regexp", "BSONRegExp")
  @js.native
  open class BSONRegExp protected () extends BSONValue {
    /**
      * @param pattern - The regular expression pattern to match
      * @param options - The regular expression options
      */
    def this(pattern: String) = this()
    def this(pattern: String, options: String) = this()
    
    var options: String = js.native
    
    var pattern: String = js.native
    
    def toExtendedJSON(options: EJSONOptions): BSONRegExpExtendedLegacy | BSONRegExpExtended = js.native
  }
  /* static members */
  object BSONRegExp {
    
    @JSImport("bson/lib/regexp", "BSONRegExp")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromExtendedJSON(doc: BSONRegExpExtended): BSONRegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[BSONRegExp]
    /** @internal */
    inline def fromExtendedJSON(doc: BSONRegExpExtendedLegacy): BSONRegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[BSONRegExp]
    
    inline def parseOptions(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseOptions")().asInstanceOf[String]
    inline def parseOptions(options: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseOptions")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  trait BSONRegExpExtended extends StObject {
    
    @JSName("$regularExpression")
    var $regularExpression: Options
  }
  object BSONRegExpExtended {
    
    inline def apply($regularExpression: Options): BSONRegExpExtended = {
      val __obj = js.Dynamic.literal($regularExpression = $regularExpression.asInstanceOf[js.Any])
      __obj.asInstanceOf[BSONRegExpExtended]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BSONRegExpExtended] (val x: Self) extends AnyVal {
      
      inline def set$regularExpression(value: Options): Self = StObject.set(x, "$regularExpression", value.asInstanceOf[js.Any])
    }
  }
  
  trait BSONRegExpExtendedLegacy extends StObject {
    
    @JSName("$options")
    var $options: String
    
    @JSName("$regex")
    var $regex: String | BSONRegExp
  }
  object BSONRegExpExtendedLegacy {
    
    inline def apply($options: String, $regex: String | BSONRegExp): BSONRegExpExtendedLegacy = {
      val __obj = js.Dynamic.literal($options = $options.asInstanceOf[js.Any], $regex = $regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[BSONRegExpExtendedLegacy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BSONRegExpExtendedLegacy] (val x: Self) extends AnyVal {
      
      inline def set$options(value: String): Self = StObject.set(x, "$options", value.asInstanceOf[js.Any])
      
      inline def set$regex(value: String | BSONRegExp): Self = StObject.set(x, "$regex", value.asInstanceOf[js.Any])
    }
  }
}
