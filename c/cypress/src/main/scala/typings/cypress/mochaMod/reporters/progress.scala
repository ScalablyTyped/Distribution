package typings.cypress.mochaMod.reporters

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.cypress.Mocha.Runner
import typings.cypress.Mocha.reporters.Progress
import typings.cypress.Mocha.reporters.Progress.MochaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha", "reporters.progress")
@js.native
object progress
  extends TopLevel[
      Instantiable2[/* runner */ Runner, js.UndefOr[/* options */ MochaOptions], Progress]
    ]

