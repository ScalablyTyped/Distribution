package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSTypeAliasDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `90` extends StObject {
  
  var `type`: TSTypeAliasDeclaration
}
object `90` {
  
  @scala.inline
  def apply(): `90` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSTypeAliasDeclaration")
    __obj.asInstanceOf[`90`]
  }
  
  @scala.inline
  implicit class `90MutableBuilder`[Self <: `90`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSTypeAliasDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
