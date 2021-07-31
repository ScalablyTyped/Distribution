package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ExistentialTypeParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExistentialTypeParam_
  extends StObject
     with Node
     with Flow {
  
  @JSName("type")
  var type_ExistentialTypeParam_ : ExistentialTypeParam
}
object ExistentialTypeParam_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double): ExistentialTypeParam_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExistentialTypeParam")
    __obj.asInstanceOf[ExistentialTypeParam_]
  }
  
  @scala.inline
  implicit class ExistentialTypeParam_MutableBuilder[Self <: ExistentialTypeParam_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ExistentialTypeParam): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
