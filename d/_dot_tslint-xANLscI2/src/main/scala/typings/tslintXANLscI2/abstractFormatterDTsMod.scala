package typings.tslintXANLscI2

import typings.tslintXANLscI2.formatterDTsMod.IFormatter
import typings.tslintXANLscI2.formatterDTsMod.IFormatterMetadata
import typings.tslintXANLscI2.ruleDTsMod.RuleFailure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractFormatterDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/language/formatter/abstractFormatter.d.ts", "AbstractFormatter")
  @js.native
  abstract class AbstractFormatter ()
    extends StObject
       with IFormatter {
    
    /* protected */ def sortFailures(failures: js.Array[RuleFailure]): js.Array[RuleFailure] = js.native
  }
  /* static members */
  object AbstractFormatter {
    
    @JSImport(".tslint-xANLscI2/lib/language/formatter/abstractFormatter.d.ts", "AbstractFormatter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/language/formatter/abstractFormatter.d.ts", "AbstractFormatter.metadata")
    @js.native
    def metadata: IFormatterMetadata = js.native
    inline def metadata_=(x: IFormatterMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
