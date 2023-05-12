package typings.cyclonedx.anon

import typings.cyclonedx.mod.LicenseOrExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expression
  extends StObject
     with LicenseOrExpression {
  
  var expression: js.UndefOr[String] = js.undefined
  
  var license: typings.cyclonedx.mod.License
}
object Expression {
  
  inline def apply(license: typings.cyclonedx.mod.License): Expression = {
    val __obj = js.Dynamic.literal(license = license.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Expression] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setLicense(value: typings.cyclonedx.mod.License): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
  }
}
