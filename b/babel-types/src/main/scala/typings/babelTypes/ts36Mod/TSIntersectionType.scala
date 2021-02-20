package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSIntersectionType
  extends Node
     with TSType {
  
  @JSName("type")
  var type_TSIntersectionType: typings.babelTypes.babelTypesStrings.TSIntersectionType = js.native
  
  var types: js.Array[TSType] = js.native
}
object TSIntersectionType {
  
  @JSImport("babel-types/ts3.6", "TSIntersectionType")
  @js.native
  def apply(types: js.Array[TSType]): TSIntersectionType = js.native
  
  @scala.inline
  implicit class TSIntersectionTypeMutableBuilder[Self <: TSIntersectionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSIntersectionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[TSType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: TSType*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
