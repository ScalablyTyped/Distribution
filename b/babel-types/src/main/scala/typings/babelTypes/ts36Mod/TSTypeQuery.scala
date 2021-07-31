package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeQuery
  extends StObject
     with Node
     with TSType {
  
  var exprName: TSEntityName
  
  @JSName("type")
  var type_TSTypeQuery: typings.babelTypes.babelTypesStrings.TSTypeQuery
}
object TSTypeQuery {
  
  @JSImport("babel-types/ts3.6", "TSTypeQuery")
  @js.native
  def apply(exprName: TSEntityName): TSTypeQuery = js.native
  
  @scala.inline
  implicit class TSTypeQueryMutableBuilder[Self <: TSTypeQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExprName(value: TSEntityName): Self = StObject.set(x, "exprName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSTypeQuery): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
