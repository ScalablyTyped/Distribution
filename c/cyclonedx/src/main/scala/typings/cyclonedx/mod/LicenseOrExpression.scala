package typings.cyclonedx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.cyclonedx.anon.Expression
  - typings.cyclonedx.anon.License
*/
trait LicenseOrExpression extends StObject
object LicenseOrExpression {
  
  inline def Expression(license: License): typings.cyclonedx.anon.Expression = {
    val __obj = js.Dynamic.literal(license = license.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cyclonedx.anon.Expression]
  }
  
  inline def License(expression: String): typings.cyclonedx.anon.License = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.cyclonedx.anon.License]
  }
}
