package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.IPickleTableRow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PickleTable. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable")
@js.native
/**
  * Constructs a new PickleTable.
  * @param [properties] Properties to set
  */
class PickleTable_ () extends IPickleTable {
  def this(properties: IPickleTable) = this()
  
  /** PickleTable rows. */
  @JSName("rows")
  var rows_PickleTable_ : js.Array[IPickleTableRow] = js.native
  
  /**
    * Converts this PickleTable to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
