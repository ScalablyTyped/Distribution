package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSUndefinedKeyword
  extends StObject
     with Node
     with TSType {
  
  @JSName("type")
  var type_TSUndefinedKeyword: typings.babelTypes.babelTypesStrings.TSUndefinedKeyword
}
object TSUndefinedKeyword {
  
  @JSImport("babel-types/ts3.6", "TSUndefinedKeyword")
  @js.native
  def apply(): TSUndefinedKeyword = js.native
  
  extension [Self <: TSUndefinedKeyword](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSUndefinedKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
