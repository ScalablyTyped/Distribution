package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSAnyKeyword
  extends StObject
     with Node
     with TSType {
  
  @JSName("type")
  var type_TSAnyKeyword: typings.babelTypes.babelTypesStrings.TSAnyKeyword
}
object TSAnyKeyword {
  
  @JSImport("babel-types", "TSAnyKeyword")
  @js.native
  def apply(): TSAnyKeyword = js.native
  
  extension [Self <: TSAnyKeyword](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSAnyKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
