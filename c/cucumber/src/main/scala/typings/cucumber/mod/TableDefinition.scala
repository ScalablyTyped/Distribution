package typings.cucumber.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableDefinition[Type] extends StObject {
  
  /** Returns an array of objects where each row is converted to an object (column header is the key). */
  def hashes(): js.Array[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ columnName in keyof Type ]: string}
    */ typings.cucumber.cucumberStrings.TableDefinition with TopLevel[js.Any]
  ] = js.native
  
  /** Returns the table as a 2-D array. */
  def raw(): js.Array[js.Array[String]] = js.native
  
  /** Returns the table as a 2-D array, without the first row. */
  def rows(): js.Array[js.Array[String]] = js.native
  
  /** Returns an object where each row corresponds to an entry (first column is the key, second column is the value). */
  def rowsHash(): StringDictionary[String] = js.native
}
object TableDefinition {
  
  @scala.inline
  def apply[Type](
    hashes: () => js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ columnName in keyof Type ]: string}
    */ typings.cucumber.cucumberStrings.TableDefinition with TopLevel[js.Any]
    ],
    raw: () => js.Array[js.Array[String]],
    rows: () => js.Array[js.Array[String]],
    rowsHash: () => StringDictionary[String]
  ): TableDefinition[Type] = {
    val __obj = js.Dynamic.literal(hashes = js.Any.fromFunction0(hashes), raw = js.Any.fromFunction0(raw), rows = js.Any.fromFunction0(rows), rowsHash = js.Any.fromFunction0(rowsHash))
    __obj.asInstanceOf[TableDefinition[Type]]
  }
  
  @scala.inline
  implicit class TableDefinitionMutableBuilder[Self <: TableDefinition[_], Type] (val x: Self with TableDefinition[Type]) extends AnyVal {
    
    @scala.inline
    def setHashes(
      value: () => js.Array[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ columnName in keyof Type ]: string}
      */ typings.cucumber.cucumberStrings.TableDefinition with TopLevel[js.Any]
        ]
    ): Self = StObject.set(x, "hashes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRaw(value: () => js.Array[js.Array[String]]): Self = StObject.set(x, "raw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRows(value: () => js.Array[js.Array[String]]): Self = StObject.set(x, "rows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRowsHash(value: () => StringDictionary[String]): Self = StObject.set(x, "rowsHash", js.Any.fromFunction0(value))
  }
}
