package typings
package cliDashInteractLib.cliDashInteractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cli-interact", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getChar(promptText: java.lang.String, allowedCharsAsString: java.lang.String): java.lang.String = js.native
  def getChar(
    promptText: java.lang.String,
    allowedCharsAsString: java.lang.String,
    flagAllowNoAnswer: scala.Boolean
  ): java.lang.String = js.native
  def getChoice(title: java.lang.String, choices: js.Array[java.lang.String]): java.lang.String = js.native
  def getChoice(
    title: java.lang.String,
    choices: js.Array[java.lang.String],
    opts: ChoiceOptions with cliDashInteractLib.Anon_ReturnNumeric
  ): scala.Double = js.native
  def getChoiceByChar(title: java.lang.String, choices: js.Array[java.lang.String]): java.lang.String = js.native
  def getChoiceByChar(title: java.lang.String, choices: js.Array[java.lang.String], flagAllowNoAnswer: scala.Boolean): java.lang.String = js.native
  @JSName("getChoice")
  def getChoice_String(title: java.lang.String, choices: js.Array[java.lang.String], opts: ChoiceOptions): java.lang.String = js.native
  def getIPversion(): java.lang.String = js.native
  def getIPversion(flagAllowNoAnswer: scala.Boolean): java.lang.String = js.native
  def getInteger(promptText: java.lang.String): scala.Double = js.native
  def getNumber(promptText: java.lang.String): scala.Double = js.native
  def getNumber(promptText: java.lang.String, opts: NumberOptions): scala.Double = js.native
  def getNumber(promptText: java.lang.String, opts: scala.Boolean): scala.Double = js.native
  def getYesNo(title: java.lang.String): scala.Boolean = js.native
  def getYesNo(title: java.lang.String, flagAllowNoAnswer: cliDashInteractLib.cliDashInteractLibNumbers.`false`): scala.Boolean = js.native
  def getYesNo(title: java.lang.String, flagAllowNoAnswer: cliDashInteractLib.cliDashInteractLibNumbers.`true`): js.UndefOr[scala.Boolean] = js.native
  def question(prompt: java.lang.String): java.lang.String = js.native
  def question(prompt: java.lang.String, options: readlineDashSyncLib.readlineDashSyncMod.BasicOptions): java.lang.String = js.native
}

