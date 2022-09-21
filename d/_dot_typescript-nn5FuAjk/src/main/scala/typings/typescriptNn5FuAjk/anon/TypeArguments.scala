package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.NodeArray
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeArguments extends StObject {
  
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.undefined
}
object TypeArguments {
  
  inline def apply(): TypeArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeArguments]
  }
  
  extension [Self <: TypeArguments](x: Self) {
    
    inline def setTypeArguments(value: NodeArray[TypeNode]): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
  }
}
