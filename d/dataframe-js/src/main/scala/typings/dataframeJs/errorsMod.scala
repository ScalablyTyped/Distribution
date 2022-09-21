package typings.dataframeJs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("dataframe-js/errors", "ArgumentTypeError")
  @js.native
  open class ArgumentTypeError protected ()
    extends StObject
       with Error {
    def this(input: Any, expected: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("dataframe-js/errors", "FileNotFoundError")
  @js.native
  open class FileNotFoundError protected ()
    extends StObject
       with Error {
    def this(fileName: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("dataframe-js/errors", "MixedTypeError")
  @js.native
  open class MixedTypeError protected ()
    extends StObject
       with Error {
    def this(types: Any*) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("dataframe-js/errors", "NoSuchColumnError")
  @js.native
  open class NoSuchColumnError protected ()
    extends StObject
       with Error {
    def this(column: Any, columns: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("dataframe-js/errors", "SQLParseError")
  @js.native
  open class SQLParseError protected ()
    extends StObject
       with Error {
    def this(message: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("dataframe-js/errors", "TableAlreadyExistsError")
  @js.native
  open class TableAlreadyExistsError protected ()
    extends StObject
       with Error {
    def this(tableName: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("dataframe-js/errors", "WrongSchemaError")
  @js.native
  open class WrongSchemaError protected ()
    extends StObject
       with Error {
    def this(columns: Any, expected: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("dataframe-js/errors", "WrongTableNameError")
  @js.native
  open class WrongTableNameError protected ()
    extends StObject
       with Error {
    def this(tableName: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
