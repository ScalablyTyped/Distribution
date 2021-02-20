package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeAnnotation extends Node {
  
  var typeAnnotation: TSType = js.native
  
  @JSName("type")
  var type_TSTypeAnnotation: typings.babelTypes.babelTypesStrings.TSTypeAnnotation = js.native
}
object TSTypeAnnotation {
  
  @JSImport("babel-types/ts3.6", "TSTypeAnnotation")
  @js.native
  def apply(typeAnnotation: TSType): TSTypeAnnotation = js.native
  
  @scala.inline
  implicit class TSTypeAnnotationMutableBuilder[Self <: TSTypeAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
