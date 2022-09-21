package typings.sucraseTbLAtQ5t

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDeclarationInfoDTsMod {
  
  @JSImport(".sucrase-TbLAtQ5t/dist/types/util/getDeclarationInfo.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(tokens: typings.sucraseTbLAtQ5t.tokenProcessorDTsMod.default): DeclarationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tokens.asInstanceOf[js.Any]).asInstanceOf[DeclarationInfo]
  
  @JSImport(".sucrase-TbLAtQ5t/dist/types/util/getDeclarationInfo.d.ts", "EMPTY_DECLARATION_INFO")
  @js.native
  val EMPTY_DECLARATION_INFO: DeclarationInfo = js.native
  
  trait DeclarationInfo extends StObject {
    
    var typeDeclarations: Set[String]
    
    var valueDeclarations: Set[String]
  }
  object DeclarationInfo {
    
    inline def apply(typeDeclarations: Set[String], valueDeclarations: Set[String]): DeclarationInfo = {
      val __obj = js.Dynamic.literal(typeDeclarations = typeDeclarations.asInstanceOf[js.Any], valueDeclarations = valueDeclarations.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeclarationInfo]
    }
    
    extension [Self <: DeclarationInfo](x: Self) {
      
      inline def setTypeDeclarations(value: Set[String]): Self = StObject.set(x, "typeDeclarations", value.asInstanceOf[js.Any])
      
      inline def setValueDeclarations(value: Set[String]): Self = StObject.set(x, "valueDeclarations", value.asInstanceOf[js.Any])
    }
  }
}
