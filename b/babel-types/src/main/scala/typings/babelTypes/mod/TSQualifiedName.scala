package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSQualifiedName
  extends StObject
     with Node
     with TSEntityName {
  
  var left: TSEntityName
  
  var right: Identifier_
  
  @JSName("type")
  var type_TSQualifiedName: typings.babelTypes.babelTypesStrings.TSQualifiedName
}
object TSQualifiedName {
  
  @JSImport("babel-types", "TSQualifiedName")
  @js.native
  def apply(left: TSEntityName, right: Identifier_): TSQualifiedName = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSQualifiedName] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: TSEntityName): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Identifier_): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSQualifiedName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
