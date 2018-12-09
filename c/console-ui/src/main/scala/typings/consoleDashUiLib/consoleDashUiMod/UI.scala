package typings
package consoleDashUiLib.consoleDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * The UI provides the CLI with a unified mechanism for providing output and
 * requesting input from the user. This becomes useful when wanting to adjust
 * logLevels, or mock input/output for tests.
 */
@js.native
trait UI extends js.Object {
  /**
       * Launch the prompt interface (inquiry session) with (Array of Questions || Question)
       * See [Inquirer.js#question](https://github.com/SBoudrias/Inquirer.js#question) for Question properties
       */
  def prompt[T](questions: inquirerLib.inquirerMod.inquirerNs.Questions[T]): js.Promise[T] = js.native
  /**
       * Launch the prompt interface (inquiry session) with (Array of Questions || Question)
       * See [Inquirer.js#question](https://github.com/SBoudrias/Inquirer.js#question) for Question properties
       */
  def prompt[T](
    questions: inquirerLib.inquirerMod.inquirerNs.Questions[T],
    callback: js.Function1[/* answers */ T, scala.Unit]
  ): js.Promise[T] = js.native
  /**
       * Sets the write level for the UI. Valid write levels are 'DEBUG', 'INFO',
       * 'WARNING', and 'ERROR'.
       */
  def setWriteLevel(level: consoleDashUiLib.WriteLevel): scala.Unit = js.native
  /**
       * Begins a progress spinner with a message (only if the INFO write level is visible).
       */
  def startProgress(message: java.lang.String): scala.Unit = js.native
  /**
       * Ends the current progress spinner.
       */
  def stopProgress(): scala.Unit = js.native
  /**
       * Unified mechanism to write a string to the console.
       * Optionally include a writeLevel, this is used to decide if the specific
       * logging mechanism should or should not be printed.
       */
  def write(message: java.lang.String): scala.Unit = js.native
  /**
       * Unified mechanism to write a string to the console.
       * Optionally include a writeLevel, this is used to decide if the specific
       * logging mechanism should or should not be printed.
       */
  def write(message: java.lang.String, level: consoleDashUiLib.WriteLevel): scala.Unit = js.native
  /**
       * Helper method to write a string with the DEBUG writeLevel and gray chalk
       */
  def writeDebugLine(message: java.lang.String): scala.Unit = js.native
  /**
       * Helper method to write a string with the WARNING writeLevel and yellow chalk.
       * Optionally include a test. If falsy, the deprecation will be printed. By default deprecations
       * will be prepended with DEPRECATION text when printed.
       */
  def writeDeprecateLine(message: java.lang.String): scala.Unit = js.native
  /**
       * Helper method to write a string with the WARNING writeLevel and yellow chalk.
       * Optionally include a test. If falsy, the deprecation will be printed. By default deprecations
       * will be prepended with DEPRECATION text when printed.
       */
  def writeDeprecateLine(message: java.lang.String, test: scala.Boolean): scala.Unit = js.native
  /**
       * Helper method to write a string with the WARNING writeLevel and yellow chalk.
       * Optionally include a test. If falsy, the deprecation will be printed. By default deprecations
       * will be prepended with DEPRECATION text when printed.
       */
  def writeDeprecateLine(message: java.lang.String, test: scala.Boolean, prepend: scala.Boolean): scala.Unit = js.native
  /**
       * Unified mechanism to an Error to the console.
       * This will occure at a writeLevel of ERROR
       */
  def writeError(error: js.Object): scala.Unit = js.native
  /**
       * Helper method to write a string with the INFO writeLevel and cyan chalk
       */
  def writeInfoLine(message: java.lang.String): scala.Unit = js.native
  /**
       * Unified mechanism to write a string and new line to the console.
       * Optionally include a writeLevel, this is used to decide if the specific
       * logging mechanism should or should not be printed.
       */
  def writeLine(message: java.lang.String): scala.Unit = js.native
  /**
       * Unified mechanism to write a string and new line to the console.
       * Optionally include a writeLevel, this is used to decide if the specific
       * logging mechanism should or should not be printed.
       */
  def writeLine(message: java.lang.String, level: consoleDashUiLib.WriteLevel): scala.Unit = js.native
  /**
       * Helper method to write a string with the WARNING writeLevel and yellow chalk.
       * Optionally include a test. If falsy, the warning will be printed. By default, warnings
       * will be prepended with WARNING text when printed.
       */
  def writeWarnLine(message: java.lang.String): scala.Unit = js.native
  /**
       * Helper method to write a string with the WARNING writeLevel and yellow chalk.
       * Optionally include a test. If falsy, the warning will be printed. By default, warnings
       * will be prepended with WARNING text when printed.
       */
  def writeWarnLine(message: java.lang.String, test: scala.Boolean): scala.Unit = js.native
  /**
       * Helper method to write a string with the WARNING writeLevel and yellow chalk.
       * Optionally include a test. If falsy, the warning will be printed. By default, warnings
       * will be prepended with WARNING text when printed.
       */
  def writeWarnLine(message: java.lang.String, test: scala.Boolean, prepend: scala.Boolean): scala.Unit = js.native
}

