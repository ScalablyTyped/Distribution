package typings.cucumber.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDefinition[Type] extends js.Object {
  /** Returns an array of objects where each row is converted to an object (column header is the key). */
  def hashes(): js.Array[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ columnName in keyof Type ]: string}
    */ typings.cucumber.cucumberStrings.TableDefinition with js.Any
  ]
  /** Returns the table as a 2-D array. */
  def raw(): js.Array[js.Array[String]]
  /** Returns the table as a 2-D array, without the first row. */
  def rows(): js.Array[js.Array[String]]
  /** Returns an object where each row corresponds to an entry (first column is the key, second column is the value). */
  def rowsHash(): StringDictionary[String]
}

object TableDefinition {
  @scala.inline
  def apply[Type](
    hashes: () => js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ columnName in keyof Type ]: string}
    */ typings.cucumber.cucumberStrings.TableDefinition with js.Any
    ],
    raw: () => js.Array[js.Array[String]],
    rows: () => js.Array[js.Array[String]],
    rowsHash: () => StringDictionary[String]
  ): TableDefinition[Type] = {
    val __obj = js.Dynamic.literal(hashes = js.Any.fromFunction0(hashes), raw = js.Any.fromFunction0(raw), rows = js.Any.fromFunction0(rows), rowsHash = js.Any.fromFunction0(rowsHash))
  
    __obj.asInstanceOf[TableDefinition[Type]]
  }
}

