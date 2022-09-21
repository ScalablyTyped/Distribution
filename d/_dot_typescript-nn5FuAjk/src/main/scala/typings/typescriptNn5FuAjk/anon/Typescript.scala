package typings.typescriptNn5FuAjk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typescript extends StObject {
  
  var typescript: AddEmitHelper
}
object Typescript {
  
  inline def apply(typescript: AddEmitHelper): Typescript = {
    val __obj = js.Dynamic.literal(typescript = typescript.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typescript]
  }
  
  extension [Self <: Typescript](x: Self) {
    
    inline def setTypescript(value: AddEmitHelper): Self = StObject.set(x, "typescript", value.asInstanceOf[js.Any])
  }
}
