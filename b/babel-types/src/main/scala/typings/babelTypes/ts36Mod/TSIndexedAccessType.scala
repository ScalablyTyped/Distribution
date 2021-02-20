package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSIndexedAccessType
  extends Node
     with TSType {
  
  var indexType: TSType = js.native
  
  var objectType: TSType = js.native
  
  @JSName("type")
  var type_TSIndexedAccessType: typings.babelTypes.babelTypesStrings.TSIndexedAccessType = js.native
}
object TSIndexedAccessType {
  
  @JSImport("babel-types/ts3.6", "TSIndexedAccessType")
  @js.native
  def apply(objectType: TSType, indexType: TSType): TSIndexedAccessType = js.native
  
  @scala.inline
  implicit class TSIndexedAccessTypeMutableBuilder[Self <: TSIndexedAccessType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexType(value: TSType): Self = StObject.set(x, "indexType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectType(value: TSType): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSIndexedAccessType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
