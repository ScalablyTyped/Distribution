package typings.csvtojson9Fxy25kk

import typings.csvtojson9Fxy25kk.anon.Err
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csverrorDTsMod {
  
  @JSImport(".csvtojson-9Fxy25kk/v2/CSVError.d.ts", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CSVError {
    def this(err: String, line: Double) = this()
    def this(err: String, line: Double, extra: String) = this()
    
    /* CompleteClass */
    var err: String = js.native
    
    /* CompleteClass */
    var line: Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def toJSON(): Err = js.native
  }
  /* static members */
  object default {
    
    @JSImport(".csvtojson-9Fxy25kk/v2/CSVError.d.ts", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def column_mismatched(index: Double): CSVError = ^.asInstanceOf[js.Dynamic].applyDynamic("column_mismatched")(index.asInstanceOf[js.Any]).asInstanceOf[CSVError]
    inline def column_mismatched(index: Double, extra: String): CSVError = (^.asInstanceOf[js.Dynamic].applyDynamic("column_mismatched")(index.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[CSVError]
    
    inline def fromJSON(obj: Any): CSVError = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(obj.asInstanceOf[js.Any]).asInstanceOf[CSVError]
    
    inline def unclosed_quote(index: Double): CSVError = ^.asInstanceOf[js.Dynamic].applyDynamic("unclosed_quote")(index.asInstanceOf[js.Any]).asInstanceOf[CSVError]
    inline def unclosed_quote(index: Double, extra: String): CSVError = (^.asInstanceOf[js.Dynamic].applyDynamic("unclosed_quote")(index.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[CSVError]
  }
  
  trait CSVError
    extends StObject
       with Error {
    
    var err: String
    
    var extra: js.UndefOr[String] = js.undefined
    
    var line: Double
    
    def toJSON(): Err
  }
  object CSVError {
    
    inline def apply(err: String, line: Double, message: String, name: String, toJSON: () => Err): CSVError = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[CSVError]
    }
    
    extension [Self <: CSVError](x: Self) {
      
      inline def setErr(value: String): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setExtra(value: String): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => Err): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
}
