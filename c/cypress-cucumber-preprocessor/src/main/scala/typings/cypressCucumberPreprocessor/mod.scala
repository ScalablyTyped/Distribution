package typings.cypressCucumberPreprocessor

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cypress-cucumber-preprocessor", JSImport.Default)
  @js.native
  def default(): js.Function1[/* file */ js.Any, js.Promise[String]] = js.native
  @JSImport("cypress-cucumber-preprocessor", JSImport.Default)
  @js.native
  def default(options: js.Any): js.Function1[/* file */ js.Any, js.Promise[String]] = js.native
  
  @JSImport("cypress-cucumber-preprocessor", "transform")
  @js.native
  def transform(file: js.Any): js.Any = js.native
  
  @js.native
  trait TableDefinition extends StObject {
    
    /** Returns an array of objects where each row is converted to an object (column header is the key). */
    def hashes(): js.Array[StringDictionary[String]] = js.native
    
    /** Returns the table as a 2-D array. */
    def raw(): js.Array[js.Array[String]] = js.native
    
    /** Returns the table as a 2-D array, without the first row. */
    def rows(): js.Array[js.Array[String]] = js.native
    
    /** Returns an object where each row corresponds to an entry (first column is the key, second column is the value). */
    def rowsHash(): StringDictionary[String] = js.native
  }
  object TableDefinition {
    
    @scala.inline
    def apply(
      hashes: () => js.Array[StringDictionary[String]],
      raw: () => js.Array[js.Array[String]],
      rows: () => js.Array[js.Array[String]],
      rowsHash: () => StringDictionary[String]
    ): TableDefinition = {
      val __obj = js.Dynamic.literal(hashes = js.Any.fromFunction0(hashes), raw = js.Any.fromFunction0(raw), rows = js.Any.fromFunction0(rows), rowsHash = js.Any.fromFunction0(rowsHash))
      __obj.asInstanceOf[TableDefinition]
    }
    
    @scala.inline
    implicit class TableDefinitionMutableBuilder[Self <: TableDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHashes(value: () => js.Array[StringDictionary[String]]): Self = StObject.set(x, "hashes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRaw(value: () => js.Array[js.Array[String]]): Self = StObject.set(x, "raw", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRows(value: () => js.Array[js.Array[String]]): Self = StObject.set(x, "rows", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRowsHash(value: () => StringDictionary[String]): Self = StObject.set(x, "rowsHash", js.Any.fromFunction0(value))
    }
  }
}
