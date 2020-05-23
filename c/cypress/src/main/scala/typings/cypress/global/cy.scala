package typings.cypress.global

import org.scalablytyped.runtime.TopLevel
import typings.cypress.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Global variables `cy` added by Cypress with all API commands.
  * @see https://on.cypress.io/api
  *
```
cy.get('button').click()
cy.get('.result').contains('Expected text')
```
  */
@JSGlobal("cy")
@js.native
object cy
  extends TopLevel[typings.cypress.Cypress.cy with EventEmitter]

