package typings.cliDashInteract.cliDashInteractMod

import typings.cliDashInteract.Anon_ReturnNumeric
import typings.cliDashInteract.cliDashInteractNumbers.`false`
import typings.cliDashInteract.cliDashInteractNumbers.`true`
import typings.readlineDashSync.readlineDashSyncMod.BasicOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cli-interact", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getChar(promptText: String, allowedCharsAsString: String): String = js.native
  def getChar(promptText: String, allowedCharsAsString: String, flagAllowNoAnswer: Boolean): String = js.native
  def getChoice(title: String, choices: js.Array[String]): String = js.native
  def getChoice(title: String, choices: js.Array[String], opts: ChoiceOptions with Anon_ReturnNumeric): Double = js.native
  def getChoiceByChar(title: String, choices: js.Array[String]): String = js.native
  def getChoiceByChar(title: String, choices: js.Array[String], flagAllowNoAnswer: Boolean): String = js.native
  @JSName("getChoice")
  def getChoice_String(title: String, choices: js.Array[String], opts: ChoiceOptions): String = js.native
  def getIPversion(): String = js.native
  def getIPversion(flagAllowNoAnswer: Boolean): String = js.native
  def getInteger(promptText: String): Double = js.native
  def getNumber(promptText: String): Double = js.native
  def getNumber(promptText: String, opts: Boolean): Double = js.native
  def getNumber(promptText: String, opts: NumberOptions): Double = js.native
  def getYesNo(title: String): Boolean = js.native
  @JSName("getYesNo")
  def getYesNo_false(title: String, flagAllowNoAnswer: `false`): Boolean = js.native
  @JSName("getYesNo")
  def getYesNo_true(title: String, flagAllowNoAnswer: `true`): js.UndefOr[Boolean] = js.native
  def question(prompt: String): String = js.native
  def question(prompt: String, options: BasicOptions): String = js.native
}

