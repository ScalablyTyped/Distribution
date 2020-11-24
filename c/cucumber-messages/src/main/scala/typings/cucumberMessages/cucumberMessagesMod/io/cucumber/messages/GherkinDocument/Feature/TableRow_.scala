package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow.ITableCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TableRow. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow")
@js.native
/**
  * Constructs a new TableRow.
  * @param [properties] Properties to set
  */
class TableRow_ () extends ITableRow {
  def this(properties: ITableRow) = this()
  
  /** TableRow cells. */
  @JSName("cells")
  var cells_TableRow_ : js.Array[ITableCell] = js.native
  
  /** TableRow id. */
  @JSName("id")
  var id_TableRow_ : String = js.native
  
  /**
    * Converts this TableRow to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
