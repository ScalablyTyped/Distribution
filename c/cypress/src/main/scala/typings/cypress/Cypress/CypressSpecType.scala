package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Spec type for the given test. "integration" is the default, but
  * tests run using `open --component` will be "component"
  *
  * @see https://on.cypress.io/experiments
  */
/* Rewritten from type alias, can be one of: 
  - typings.cypress.cypressStrings.integration
  - typings.cypress.cypressStrings.component
*/
trait CypressSpecType extends StObject
object CypressSpecType {
  
  inline def component: typings.cypress.cypressStrings.component = "component".asInstanceOf[typings.cypress.cypressStrings.component]
  
  inline def integration: typings.cypress.cypressStrings.integration = "integration".asInstanceOf[typings.cypress.cypressStrings.integration]
}
