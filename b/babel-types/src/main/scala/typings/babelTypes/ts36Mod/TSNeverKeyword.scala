package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNeverKeyword
  extends StObject
     with Node
     with TSType {
  
  @JSName("type")
  var type_TSNeverKeyword: typings.babelTypes.babelTypesStrings.TSNeverKeyword
}
object TSNeverKeyword {
  
  @JSImport("babel-types/ts3.6", "TSNeverKeyword")
  @js.native
  def apply(): TSNeverKeyword = js.native
  
  @scala.inline
  implicit class TSNeverKeywordMutableBuilder[Self <: TSNeverKeyword] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSNeverKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
