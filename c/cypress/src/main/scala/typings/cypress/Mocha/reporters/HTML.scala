package typings.cypress.Mocha.reporters

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typings.cypress.HTMLLIElement
import typings.cypress.Mocha.Suite
import typings.cypress.Mocha.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `HTML` reporter.
  *
  * - _This reporter cannot be used on the console._
  *
  * @see https://mochajs.org/api/Mocha.reporters.HTML.html
  */
@JSGlobal("Mocha.reporters.HTML")
@js.native
class HTML () extends Base {
  /**
    * Adds code toggle functionality for the provided test's list element.
    *
    * @see https://mochajs.org/api/Mocha.reporters.HTML.html#addCodeToggle
    */
  def addCodeToggle(el: HTMLLIElement, contents: String): Unit = js.native
  /**
    * Provide suite URL.
    *
    * @see https://mochajs.org/api/Mocha.reporters.HTML.html#suiteURL
    */
  def suiteURL(suite: Suite): String = js.native
  /**
    * Provide test URL.
    *
    * @see https://mochajs.org/api/Mocha.reporters.HTML.html#testURL
    */
  def testURL(test: Test): String = js.native
}

@JSGlobal("Mocha.reporters.html")
@js.native
object html extends TopLevel[Instantiable0[HTML]]

