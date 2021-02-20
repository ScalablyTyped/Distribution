package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSUnionType
  extends Node
     with TSType {
  
  @JSName("type")
  var type_TSUnionType: typings.babelTypes.babelTypesStrings.TSUnionType = js.native
  
  var types: js.Array[TSType] = js.native
}
object TSUnionType {
  
  @JSImport("babel-types/ts3.6", "TSUnionType")
  @js.native
  def apply(types: js.Array[TSType]): TSUnionType = js.native
  
  @scala.inline
  implicit class TSUnionTypeMutableBuilder[Self <: TSUnionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSUnionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[TSType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: TSType*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
