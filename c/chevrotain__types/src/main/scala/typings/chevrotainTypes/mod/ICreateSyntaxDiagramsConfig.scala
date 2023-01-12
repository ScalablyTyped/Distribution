package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICreateSyntaxDiagramsConfig extends StObject {
  
  /**
    * Url to load the styleSheet, replace with your own for styling customization.
    */
  var css: js.UndefOr[String] = js.undefined
  
  /**
    * Base Url to load the runtime resources for rendering the diagrams
    */
  var resourceBase: js.UndefOr[String] = js.undefined
}
object ICreateSyntaxDiagramsConfig {
  
  inline def apply(): ICreateSyntaxDiagramsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateSyntaxDiagramsConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICreateSyntaxDiagramsConfig] (val x: Self) extends AnyVal {
    
    inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setResourceBase(value: String): Self = StObject.set(x, "resourceBase", value.asInstanceOf[js.Any])
    
    inline def setResourceBaseUndefined: Self = StObject.set(x, "resourceBase", js.undefined)
  }
}
