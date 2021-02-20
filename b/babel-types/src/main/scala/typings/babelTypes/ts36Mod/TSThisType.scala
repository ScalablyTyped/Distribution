package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSThisType
  extends Node
     with TSType {
  
  @JSName("type")
  var type_TSThisType: typings.babelTypes.babelTypesStrings.TSThisType = js.native
}
object TSThisType {
  
  @JSImport("babel-types/ts3.6", "TSThisType")
  @js.native
  def apply(): TSThisType = js.native
  
  @scala.inline
  implicit class TSThisTypeMutableBuilder[Self <: TSThisType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSThisType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
