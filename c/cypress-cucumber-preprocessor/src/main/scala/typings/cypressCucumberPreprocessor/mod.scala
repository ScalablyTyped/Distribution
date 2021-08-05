package typings.cypressCucumberPreprocessor

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cypress-cucumber-preprocessor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function1[/* file */ js.Any, js.Promise[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[/* file */ js.Any, js.Promise[String]]]
  inline def default(options: js.Any): js.Function1[/* file */ js.Any, js.Promise[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* file */ js.Any, js.Promise[String]]]
  
  inline def transform(file: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(file.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  trait TableDefinition extends StObject {
    
    /** Returns an array of objects where each row is converted to an object (column header is the key). */
    def hashes(): js.Array[StringDictionary[String]]
    
    /** Returns the table as a 2-D array. */
    def raw(): js.Array[js.Array[String]]
    
    /** Returns the table as a 2-D array, without the first row. */
    def rows(): js.Array[js.Array[String]]
    
    /** Returns an object where each row corresponds to an entry (first column is the key, second column is the value). */
    def rowsHash(): StringDictionary[String]
  }
  object TableDefinition {
    
    inline def apply(
      hashes: () => js.Array[StringDictionary[String]],
      raw: () => js.Array[js.Array[String]],
      rows: () => js.Array[js.Array[String]],
      rowsHash: () => StringDictionary[String]
    ): TableDefinition = {
      val __obj = js.Dynamic.literal(hashes = js.Any.fromFunction0(hashes), raw = js.Any.fromFunction0(raw), rows = js.Any.fromFunction0(rows), rowsHash = js.Any.fromFunction0(rowsHash))
      __obj.asInstanceOf[TableDefinition]
    }
    
    extension [Self <: TableDefinition](x: Self) {
      
      inline def setHashes(value: () => js.Array[StringDictionary[String]]): Self = StObject.set(x, "hashes", js.Any.fromFunction0(value))
      
      inline def setRaw(value: () => js.Array[js.Array[String]]): Self = StObject.set(x, "raw", js.Any.fromFunction0(value))
      
      inline def setRows(value: () => js.Array[js.Array[String]]): Self = StObject.set(x, "rows", js.Any.fromFunction0(value))
      
      inline def setRowsHash(value: () => StringDictionary[String]): Self = StObject.set(x, "rowsHash", js.Any.fromFunction0(value))
    }
  }
}
