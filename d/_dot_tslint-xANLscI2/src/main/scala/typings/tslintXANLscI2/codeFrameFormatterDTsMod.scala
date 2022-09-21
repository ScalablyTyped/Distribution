package typings.tslintXANLscI2

import typings.tslintXANLscI2.abstractFormatterDTsMod.AbstractFormatter
import typings.tslintXANLscI2.formatterDTsMod.IFormatterMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeFrameFormatterDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/formatters/codeFrameFormatter.d.ts", "Formatter")
  @js.native
  open class Formatter () extends AbstractFormatter
  /* static members */
  object Formatter {
    
    @JSImport(".tslint-xANLscI2/lib/formatters/codeFrameFormatter.d.ts", "Formatter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/formatters/codeFrameFormatter.d.ts", "Formatter.metadata")
    @js.native
    def metadata: IFormatterMetadata = js.native
    inline def metadata_=(x: IFormatterMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
