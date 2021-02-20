package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.VariableDeclarator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableDeclarator_ extends Node {
  
  var id: LVal = js.native
  
  var init: Expression = js.native
  
  @JSName("type")
  var type_VariableDeclarator_ : VariableDeclarator = js.native
}
object VariableDeclarator_ {
  
  @scala.inline
  def apply(
    end: Double,
    id: LVal,
    init: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: VariableDeclarator
  ): VariableDeclarator_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclarator_]
  }
  
  @scala.inline
  implicit class VariableDeclarator_MutableBuilder[Self <: VariableDeclarator_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: LVal): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: Expression): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: VariableDeclarator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
