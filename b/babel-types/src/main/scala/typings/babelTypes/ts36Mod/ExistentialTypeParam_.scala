package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ExistentialTypeParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExistentialTypeParam_
  extends Node
     with Flow {
  
  @JSName("type")
  var type_ExistentialTypeParam_ : ExistentialTypeParam = js.native
}
object ExistentialTypeParam_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, `type`: ExistentialTypeParam): ExistentialTypeParam_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistentialTypeParam_]
  }
  
  @scala.inline
  implicit class ExistentialTypeParam_MutableBuilder[Self <: ExistentialTypeParam_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ExistentialTypeParam): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
