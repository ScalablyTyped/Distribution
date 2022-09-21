package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.Import
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Import_
  extends StObject
     with BaseNode
     with Expression
     with Node
     with Standardized {
  
  @JSName("type")
  var type_Import_ : Import
}
object Import_ {
  
  inline def apply(): Import_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Import")
    __obj.asInstanceOf[Import_]
  }
  
  extension [Self <: Import_](x: Self) {
    
    inline def setType(value: Import): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
