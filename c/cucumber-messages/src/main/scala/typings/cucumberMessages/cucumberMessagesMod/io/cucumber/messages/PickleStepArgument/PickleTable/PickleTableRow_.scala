package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.IPickleTableCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PickleTableRow. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow")
@js.native
/**
  * Constructs a new PickleTableRow.
  * @param [properties] Properties to set
  */
class PickleTableRow_ () extends IPickleTableRow {
  def this(properties: IPickleTableRow) = this()
  
  /** PickleTableRow cells. */
  @JSName("cells")
  var cells_PickleTableRow_ : js.Array[IPickleTableCell] = js.native
  
  /**
    * Converts this PickleTableRow to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
